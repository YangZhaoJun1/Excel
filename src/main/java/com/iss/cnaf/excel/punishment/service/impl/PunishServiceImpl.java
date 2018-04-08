package com.iss.cnaf.excel.punishment.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.iss.cnaf.excel.punishment.dao.PunishMapper;
import com.iss.cnaf.excel.punishment.service.PunishService;
import com.iss.cnaf.excel.punishment.vo.Punishment;
import com.iss.cnaf.excel.repair.dao.RepairMapper;
import com.iss.cnaf.excel.repair.service.RepairService;
import com.iss.cnaf.excel.repair.vo.Repair;
import com.iss.cnaf.manager.sys.model.CnafGrid;
import com.iss.cnaf.manager.sys.model.QueryParam;
import com.iss.common.utils.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/5.
 */

@Service
public class PunishServiceImpl implements PunishService {


    @Autowired
    private PunishMapper punishMapper;

    @Override
    public CnafGrid queryPunish(QueryParam param, CnafGrid grid) {
        PageHelper.startPage(param.getPage(), param.getRows());
        Page<Punishment> page = punishMapper.queryPunish();
        grid.setGrid(page.getTotal(), page.getResult());
        return grid;
    }

    @Override
    public int insertList(List<Punishment> punishs) {
        return punishMapper.insertList(punishs);
    }

    @Override
    public Map<String, Object> batchExportJiJin(Workbook wb) {
        List<Punishment> punishs = new ArrayList<>();
        Sheet sheet = wb.getSheetAt(0);
        boolean fl = false;
        // 获取总行数
        int rows = sheet.getPhysicalNumberOfRows();
        if (rows > 2) {
            for (int start = 2; start < rows; start++) {
                // 从第三行开始逐行获取
                Row row = sheet.getRow(start);
                Punishment punish = new Punishment();
                for (int i = 0; i < 7; i++) {
                    Cell cell = row.getCell(i);
                    String cellValue = FileUtils.getCellValue(cell);

                    if (i == 0) {
                        if(cellValue==""){
                            fl = true;
                            break;
                        }else{
                            punish.setCarId(cellValue);
                        }
                    }
                    if (i == 1) {
                        punish.setPunishDate(cellValue);
                    }
                    if (i == 2) {
                        punish.setPunishPlace(cellValue);
                    }
                    if (i == 3) {
                        punish.setPunishCause(cellValue);
                    }
                    if (i == 4) {
                        punish.setPenaltyValue(cellValue);
                    }
                    if (i == 5) {
                        punish.setDriver(cellValue);
                    }
                    if (i == 6) {
                        punish.setResults(cellValue);
                    }
                }
                if(punish.getCarId()!=""&&punish.getCarId()!=null){
                    punishs.add(punish);
                }
                if(fl){
                    break;
                }
            }
        }
        punishMapper.insertList(punishs);
        return null;
    }
}
