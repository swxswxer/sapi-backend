package com.swx.project.model.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 密钥视图
 *
 * @TableName user
 */
@Data
public class AkSkVO implements Serializable {
    private String accessKey;
    private String secretKey;

    private static final long serialVersionUID = 1L;
}