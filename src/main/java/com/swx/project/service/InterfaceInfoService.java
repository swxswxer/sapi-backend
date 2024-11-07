package com.swx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.sapicommon.model.entity.InterfaceInfo;

/**
* @author swxswxer
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-31 23:15:41
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);


}
