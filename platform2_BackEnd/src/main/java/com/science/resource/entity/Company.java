package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * @since 2021-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Company对象", description="")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String telephone;

    private String email;

    private String website;

    private String address;

    @TableField("registerCapital")
    private String registercapital;

    @TableField("establishmentDate")
    private String establishmentdate;

    private String state;

    private String code;

    @TableField("registerNum")
    private String registernum;

    @TableField("Num")
    private String num;

    @TableField("CompanyCode")
    private String companycode;

    private String type;

    private String industry;

    @TableField("approvalDate")
    private String approvaldate;

    @TableField("registrationAuthority")
    private String registrationauthority;

    @TableField("operatingPeriod")
    private String operatingperiod;

    @TableField("taxpayerQualification")
    private String taxpayerqualification;

    @TableField("staffSize")
    private String staffsize;

    @TableField("participantsNum")
    private String participantsnum;

    @TableField("usedName")
    private String usedname;

    @TableField("englishName")
    private String englishname;

    @TableField("registeredAddress")
    private String registeredaddress;

    @TableField("businessScope")
    private String businessscope;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

}
