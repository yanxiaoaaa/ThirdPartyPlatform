package com.science.resource.entity;

import java.util.Date;
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
@ApiModel(value="ProgressRecords对象", description="")
public class ProgressRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "监管流程id")
    private Integer id;

    @ApiModelProperty(value = "流程id")
    private Integer progressId;

    @ApiModelProperty(value = "服务id")
    private Integer orderId;

    @ApiModelProperty(value = "流程计划时间")
    private Date planTime;

    @ApiModelProperty(value = "实际完成时间")
    private Date realTime;

    @ApiModelProperty(value = "相关文件地址")
    private String relateFiles;

    @ApiModelProperty(value = "延期次数")
    private Integer delay;


}
