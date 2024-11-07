package com.swx.sapicommon.service;


import com.swx.sapicommon.model.entity.InterfaceCallLog;
import com.swx.sapicommon.model.entity.InterfaceInfo;

/**
* @author swxswxer
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2024-07-31 23:15:41
*/
public interface InnerInterfaceCallLogService {

    /**
     * 增加调用记录
     * @param interfaceCallLog
     * @return
     */
    boolean insertInterfaceCallLog(InterfaceCallLog interfaceCallLog);





}
