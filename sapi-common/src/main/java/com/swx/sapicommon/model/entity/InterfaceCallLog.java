package com.swx.sapicommon.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 调用记录
 * @TableName user_interface_info
 */
@TableName(value ="interface_call_log")
@Data
public class InterfaceCallLog implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;

    /**
     * 0-成功，1-失败
     */
    private Integer status;

    /**
     * 调用时间
     */
    private LocalDateTime callTime;
    /**
     * 调用IP
     */
    private String callIp;


    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 是否删除(0-未删, 1-已删)
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;



}