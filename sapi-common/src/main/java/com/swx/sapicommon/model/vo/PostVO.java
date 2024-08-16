package com.swx.sapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.swx.sapicommon.model.entity.Post;


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