package com.swx.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swx.sapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author yanghaoxin
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-08-06 16:58:04
* @Entity com.swx.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);


}




