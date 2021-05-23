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
 * @since 2021-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Equipment对象", description="")
public class Equipment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String appendix;

    private String machineBigCode;

    private String name;

    private String machineBigType;

    private String makein;

    private String machineSimType;

    private String company;

    private String title;

    private String viewInfo;

    private String imgLink;

    private String machineLink;

    private String model;

    private String country;

    private String buydate;

    private String machineSimCode;

    private String place;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


}
