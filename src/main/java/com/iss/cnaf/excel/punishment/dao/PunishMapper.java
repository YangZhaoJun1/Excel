package com.iss.cnaf.excel.punishment.dao;

import com.github.pagehelper.Page;
import com.iss.cnaf.excel.punishment.vo.Punishment;
import com.iss.cnaf.excel.repair.vo.Repair;

import java.util.List;

/**
 * Created by Administrator on 2018/4/5.
 */
public interface PunishMapper {
    Page<Punishment> queryPunish();

    int insertList(List<Punishment> punishs);
}
