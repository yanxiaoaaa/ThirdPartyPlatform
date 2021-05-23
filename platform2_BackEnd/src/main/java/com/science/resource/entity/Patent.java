package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Patent对象", description="")
@NoArgsConstructor
public class Patent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("CPC_type")
    private String cpcType;

    @TableField("IPC_type")
    private String ipcType;

    private String patentNumber;

    @TableId(value = "patent_id", type = IdType.AUTO)
    private Integer patentId;

    private String patentName;

    private String patentText;

    private Date publicationDate;

    private String publicationNumber;

    private Integer familyNumber;

    private Integer citationNumber;

    private String patentAbstract;

    private String status;

    private String applyNumber;

    private Date applyDate;

    private Integer citedNumber;

    private String language;


}
