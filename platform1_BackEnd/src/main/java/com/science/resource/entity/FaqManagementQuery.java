package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * @since 2021-03-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FaqManagementQuery对象", description="")
public class FaqManagementQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "query_id", type = IdType.AUTO)
    private Integer queryId;

    private String categoryId;

    private String text;

    private Date createTime;


}
