package com.swx.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.project.common.ErrorCode;
import com.swx.project.exception.BusinessException;
import com.swx.project.mapper.InterfaceCallLogMapper;
import com.swx.project.mapper.InterfaceInfoMapper;
import com.swx.sapicommon.model.entity.InterfaceCallLog;
import com.swx.sapicommon.model.entity.InterfaceInfo;
import com.swx.sapicommon.service.InnerInterfaceCallLogService;
import com.swx.sapicommon.service.InnerInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerInterfaceCallLogServiceImpl implements InnerInterfaceCallLogService {

    @Resource
    private InterfaceCallLogMapper interfaceCallLogMapper;


    @Override
    public boolean insertInterfaceCallLog(InterfaceCallLog interfaceCallLog) {

        int insert = interfaceCallLogMapper.insert(interfaceCallLog);
        if (insert == 1) {
            return true;
        }
        return false;
    }
}
