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
 * @since 2021-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Process对象", description="")
public class Process implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "process_id", type = IdType.AUTO)
    private Integer processId;

    private Integer serviceId;

    private String processTitle;

    private String processContext;


}
