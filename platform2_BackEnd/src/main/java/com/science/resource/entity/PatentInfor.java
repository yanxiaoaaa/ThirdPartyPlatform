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
 * @since 2021-04-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PatentInfor对象", description="")
public class PatentInfor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("DOC_STATUS")
    private String docStatus;

    @TableField("patentType")
    private String patenttype;

    @TableField("cognationList")
    private String cognationlist;

    @TableField("DOC_TYPE")
    private String docType;

    @TableField("VID")
    private String vid;

    @TableField("AZ")
    private String az;

    @TableField("AC")
    private String ac;

    @TableField("APD")
    private String apd;

    @TableField("FNUM")
    private String fnum;

    @TableField("DBCODE")
    private String dbcode;

    @TableField("AGT")
    private String agt;

    @TableField("OWNER_STATUS")
    private String ownerStatus;

    @TableField("AA")
    private String aa;

    @TableField("PNSN")
    private String pnsn;

    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @TableField("TIVIEW")
    private String tiview;

    @TableField("PRD")
    private String prd;

    private Integer abst;

    @TableField("CPNUM")
    private String cpnum;

    @TableField("PD")
    private String pd;

    @TableField("PNUM")
    private String pnum;

    @TableField("PR")
    private String pr;

    @TableField("lawStateList")
    private String lawstatelist;

    @TableField("INVIEW")
    private String inview;

    @TableField("PAVIEW")
    private String paview;

    @TableField("`fullText`")
    private Integer fulltext;

    @TableField("AP")
    private String ap;

    @TableField("AGY")
    private String agy;

    @TableField("CPC")
    private String cpc;

    @TableField("ICST")
    private String icst;

    @TableField("lawStatus")
    private String lawstatus;

    @TableField("LANG")
    private String lang;

    @TableField("IC")
    private String ic;

    @TableField("patcitList")
    private String patcitlist;

    @TableField("PN")
    private String pn;

    @TableField("APSN")
    private String apsn;


}
