package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
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
 * @since 2021-04-25
 */
@Data
@TableName(autoResultMap = true)
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServiceTable对象", description="")
public class ServiceTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "service_id", type = IdType.AUTO)
    private Integer serviceId;

    private String serviceName;

    private String servicePrice;

    private String serviceCharge;

    private String serviceMeansOfPayment;

    private String serviceField;

    private String serviceDesc;

    private String serviceProcedure;

    private String servicePeriod;

    private String serviceAcceptance;

    private String serviceWay;

    private String serviceLocation;

    private String serviceCircumstance;

    private String serviceDeliverableName;

    private String serviceDeliverableType;

    private String serviceDeliverDate;

    private String serviceDeliverableCopyright;

    private String serviceProvider;

    private String serviceCategory;

    private String servicePicture;

    private String serviceThirdPartyUrl;

    private Date createTime;

    @TableField(typeHandler = FastjsonTypeHandler.class)
    @ApiModelProperty(value = "文章中的图片地址")
    private List<Integer> serverId;


}
