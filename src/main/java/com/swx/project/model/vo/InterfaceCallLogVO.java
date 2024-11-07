package com.swx.project.model.vo;

import com.swx.sapicommon.model.entity.InterfaceCallLog;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**interface_info
 * 接口调用记录封装视图
 *
 * @author swxswxer
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceCallLogVO extends InterfaceCallLog {

    //接口名称
    private String interfaceName;
    //接口地址
    private String realityUrl;

    private static final long serialVersionUID = 1L;
}