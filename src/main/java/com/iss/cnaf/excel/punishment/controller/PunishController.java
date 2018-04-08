package com.iss.cnaf.excel.punishment.controller;

import com.alibaba.fastjson.JSONObject;
import com.iss.cnaf.excel.punishment.service.PunishService;
import com.iss.cnaf.excel.repair.service.RepairService;
import com.iss.cnaf.manager.sys.model.CnafGrid;
import com.iss.cnaf.manager.sys.model.QueryParam;
import com.iss.common.utils.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/5.
 */

@Controller
@RequestMapping("/punish")
public class PunishController {

    @Autowired
    private PunishService punishService;

    @RequestMapping("punishIndex")
    public String airportIndex(){
        return "cnaf/punishment/punishManager";
    }

    @RequestMapping("queryPunish")
    @ResponseBody
    public CnafGrid queryPunish(QueryParam param, CnafGrid grid) {

        punishService.queryPunish(param, grid);

        return grid;
    }


    @RequestMapping("excelImport")
    @ResponseBody
    public void  excelImport(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out=response.getWriter();
        Workbook wb = FileUtils.getWorkbookFromRequest(request,response);
        punishService.batchExportJiJin(wb);
        out.flush();
        out.close();
    }


}
