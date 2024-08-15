package com.swx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.sapicommon.model.entity.UserInterfaceInfo;

/**
 * @author yanghaoxin
 * @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
 * @createDate 2024-08-06 16:58:04
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);


    boolean invokeCount(long interfaceInfoId, long userId);


    public boolean isEmptyForUserInfaceInfo(long interfaceInfoId, long userId);

    Integer getTotalNumByInterfaceId(Long interfaceInfoId);
}
