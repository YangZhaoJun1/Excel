package com.iss.cnaf.excel.punishment.service;

import com.iss.cnaf.excel.punishment.vo.Punishment;
import com.iss.cnaf.manager.sys.model.CnafGrid;
import com.iss.cnaf.manager.sys.model.QueryParam;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/5.
 */
public interface PunishService {
    CnafGrid queryPunish(QueryParam param, CnafGrid grid);

    int insertList(List<Punishment> punishs);

    Map<String,Object> batchExportJiJin(Workbook wb);
}
