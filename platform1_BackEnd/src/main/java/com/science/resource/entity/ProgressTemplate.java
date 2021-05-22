package com.science.resource.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Minghao Shi
 * @since 2021-01-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ProgressTemplate对象", description="")
public class ProgressTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "流程id")
    private Integer id;

    @ApiModelProperty(value = "序号")
    private Integer processNumber;

    @ApiModelProperty(value = "服务id")
    private Integer serviceId;

    @ApiModelProperty(value = "流程标题")
    private Integer title;

    @ApiModelProperty(value = "描述内容")
    private Integer content;


}
