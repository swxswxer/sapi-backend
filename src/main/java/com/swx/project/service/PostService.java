package com.swx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swx.project.model.entity.Post;

/**
 * @author swxswxerli
 * @description 针对表【post(帖子)】的数据库操作Service
 */
public interface PostService extends IService<Post> {

    /**
     * 校验
     *
     * @param post
     * @param add 是否为创建校验
     */
    void validPost(Post post, boolean add);
}
