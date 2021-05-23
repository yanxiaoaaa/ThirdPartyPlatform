package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="ServerOrder对象", description="")
public class ServerOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "服务id")
    private Integer productId;

    @ApiModelProperty(value = "被服务方id")
    private Integer userId;

    @ApiModelProperty(value = "服务方沟通评价")
    private Integer userEstimate;

    @ApiModelProperty(value = "服务方沟通评价意见")
    private String userSuggestion;

    @ApiModelProperty(value = "被服务方沟通评价")
    private Integer serverEstimate;

    @ApiModelProperty(value = "被服务方沟通评价意见")
    private String serverSuggestion;

    @ApiModelProperty(value = "当前服务状态")
    private Integer state;

    @ApiModelProperty(value = "流程监控id")
    private String progressList;

    @ApiModelProperty(value = "流程已定内容")
    private Integer progressId;

    @ApiModelProperty(value = "完成度")
    private Integer completeness;

    @ApiModelProperty(value = "准时性")
    private Integer punctuality;

    @ApiModelProperty(value = "总体评价")
    private Integer generalEvaluation;

    @ApiModelProperty(value = "专业水平")
    private Integer professionalLevel;

    @ApiModelProperty(value = "响应速度")
    private Integer responseSpeed;

    @ApiModelProperty(value = "服务体验")
    private Integer serviceExperience;

    @ApiModelProperty(value = "意见感受")
    private Integer feedback;

    @ApiModelProperty(value = "服务方结果评价")
    private Integer userGeneralEvaluation;


}
