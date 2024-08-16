package com.swx.project.model.vo;

import com.swx.project.model.entity.Post;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**interface_info
 * 帖子视图
 *
 * @author swxswxer
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}