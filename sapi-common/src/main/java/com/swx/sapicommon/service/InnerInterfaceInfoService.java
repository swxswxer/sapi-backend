package com.swx.sapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.sapicommon.model.entity.InterfaceInfo;

/**
* @author yanghaoxin
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-31 23:15:41
*/
public interface InnerInterfaceInfoService  {

    /**
     * 数据库中查询模拟接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);





}