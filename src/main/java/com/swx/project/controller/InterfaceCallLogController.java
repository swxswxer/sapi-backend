package com.swx.project.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.swx.project.annotation.AuthCheck;
import com.swx.project.common.BaseResponse;
import com.swx.project.common.ErrorCode;
import com.swx.project.common.ResultUtils;
import com.swx.project.exception.BusinessException;
import com.swx.project.mapper.UserInterfaceInfoMapper;
import com.swx.project.model.vo.InterfaceCallLogVO;
import com.swx.project.model.vo.InterfaceInfoVO;
import com.swx.project.service.InterfaceCallLogService;
import com.swx.project.service.InterfaceInfoService;
import com.swx.project.service.UserInterfaceInfoService;
import com.swx.sapicommon.model.entity.InterfaceCallLog;
import com.swx.sapicommon.model.entity.InterfaceInfo;
import com.swx.sapicommon.model.entity.UserInterfaceInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/InterfaceCallLog")
@Slf4j
public class InterfaceCallLogController {


    @Resource
    private  UserInterfaceInfoMapper userInterfaceInfoMapper;
    @Resource
    private InterfaceInfoService interfaceInfoService;
    @Autowired
    private UserInterfaceInfoService userInterfaceInfoService;
    @Autowired
    private InterfaceCallLogService interfaceCallLogService;


    @GetMapping("/list")
    public BaseResponse<List<InterfaceCallLogVO>> listInterfaceCallLog( @RequestParam(required = false) Long interfaceId, @RequestParam(required = false) Long userId) {
        QueryWrapper<InterfaceCallLog> queryWrapper = new QueryWrapper<InterfaceCallLog>();
        if (interfaceId != null) {
        queryWrapper.eq("interfaceInfoId", interfaceId);
        }
        if (userId != null) {
        queryWrapper.eq("userId", userId);
        }
        List<InterfaceCallLog> list = interfaceCallLogService.list(queryWrapper);
        List<InterfaceCallLogVO> interfaceCallLogVOList = new ArrayList<>();
        for (InterfaceCallLog interfaceCallLog : list) {
            InterfaceInfo byId = interfaceInfoService.getById(interfaceCallLog.getInterfaceInfoId());
            InterfaceCallLogVO interfaceCallLogVO = new InterfaceCallLogVO();
            BeanUtils.copyProperties(interfaceCallLog, interfaceCallLogVO);
            interfaceCallLogVO.setInterfaceName(byId.getName());
            interfaceCallLogVO.setRealityUrl(byId.getRealityUrl());
            interfaceCallLogVOList.add(interfaceCallLogVO);
        }
        return ResultUtils.success(interfaceCallLogVOList);
    }

    @GetMapping("/getTotalNumber")
    public BaseResponse<Integer> getTotalNumber( @RequestParam(required = false) Integer status) {
        QueryWrapper<InterfaceCallLog> queryWrapper = new QueryWrapper<>();
        if (status != null) {
          queryWrapper.eq("status", status);
        }
        Integer count = Math.toIntExact(interfaceCallLogService.count(queryWrapper));
        return ResultUtils.success(count);
    }









}
