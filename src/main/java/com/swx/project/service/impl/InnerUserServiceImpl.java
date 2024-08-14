package com.swx.project.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.swx.project.common.ErrorCode;
import com.swx.project.exception.BusinessException;
import com.swx.project.mapper.UserMapper;
import com.swx.sapicommon.model.entity.User;
import com.swx.sapicommon.service.InnerUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }
}
