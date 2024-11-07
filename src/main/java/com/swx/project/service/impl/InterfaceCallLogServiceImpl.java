package com.swx.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swx.project.common.ErrorCode;
import com.swx.project.exception.BusinessException;
import com.swx.project.mapper.InterfaceCallLogMapper;
import com.swx.project.mapper.InterfaceInfoMapper;
import com.swx.project.service.InterfaceCallLogService;
import com.swx.project.service.InterfaceInfoService;
import com.swx.sapicommon.model.entity.InterfaceCallLog;
import com.swx.sapicommon.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author swxswxer
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2024-07-31 23:15:41
*/
@Service
public class InterfaceCallLogServiceImpl extends ServiceImpl<InterfaceCallLogMapper, InterfaceCallLog>
    implements InterfaceCallLogService {



}




