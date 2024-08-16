package com.swx.sapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.sapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author swxswxer
 */
public interface InnerUserService  {

    /**
     * 数据库中查询是否分配密钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
