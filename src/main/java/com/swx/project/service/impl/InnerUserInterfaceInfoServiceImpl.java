package com.swx.project.service.impl;

import com.swx.project.service.UserInterfaceInfoService;
import com.swx.sapicommon.model.entity.UserInterfaceInfo;
import com.swx.sapicommon.service.InnerUserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId,userId);
    }

    @Override
    public boolean isEmptyForUserInfaceInfo(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.isEmptyForUserInfaceInfo(interfaceInfoId,userId);
    }


}
