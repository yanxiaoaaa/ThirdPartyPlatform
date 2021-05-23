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
 * @since 2021-01-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Expert对象", description="")
public class Expert implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("allLevel")
    private Integer alllevel;

    @TableField("tecProfessional")
    private String tecprofessional;

    private String national;

    @TableField("areaBigCode")
    private String areabigcode;

    @TableField("picPath")
    private String picpath;

    @TableField("threeYearWork")
    private String threeyearwork;

    @TableField("signedMark")
    private String signedmark;

    @TableField("isAbroad")
    private String isabroad;

    @TableField("expertType")
    private String experttype;

    @TableField("workUnitProperties")
    private String workunitproperties;

    @TableField("socialService")
    private String socialservice;

    private String title;

    private String specialty;

    private String position;

    @TableField("highPraiseRate")
    private Integer highpraiserate;

    @TableField("workUnit")
    private String workunit;

    @TableField("serviceTypeName")
    private String servicetypename;

    @TableField("phoneNumber")
    private String phonenumber;

    @TableField("solutionId")
    private String solutionid;

    @TableField("registerTime")
    private String registertime;

    @TableField("expertSatisfactScore")
    private String expertsatisfactscore;

    @TableField("postAddress")
    private String postaddress;

    private String date;

    private String sex;

    @TableField("middlePicType")
    private String middlepictype;

    @TableField("expertLevelScore")
    private String expertlevelscore;

    private String email;

    @TableField("resultNames")
    private String resultnames;

    @TableField("chatState")
    private String chatstate;

    @TableField("departMent")
    private String department;

    @TableField("areaSamllCode")
    private String areasamllcode;

    @TableField("majorUnit")
    private String majorunit;

    @TableField("ggchatNumber")
    private String ggchatnumber;

    @TableField("studySpecialty")
    private String studyspecialty;

    @TableField("otherContacts")
    private String othercontacts;

    @TableField("keyWord")
    private String keyword;

    @TableField("expertTypeText")
    private String experttypetext;

    @TableField("serviceType")
    private String servicetype;

    @TableField("otherContactsNumber")
    private String othercontactsnumber;

    @TableField("latestSolution")
    private String latestsolution;

    private String expertIntroduce;

    private String status;

    @TableField("certificateNumber")
    private String certificatenumber;

    private String degrees;

    @TableField("solutionCount")
    private Integer solutioncount;

    @TableField("subjectType")
    private String subjecttype;

    private String name;

    @TableField("graduateSchool")
    private String graduateschool;

    @TableField("mobilePhoneNumber")
    private String mobilephonenumber;

    private String time;

    private String requireid;

    @TableField("degreesDicName")
    private String degreesdicname;

    @TableField("certificateType")
    private String certificatetype;

    @TableField("tecProfessionalName")
    private String tecprofessionalname;

    @TableField("subjectTypeText")
    private String subjecttypetext;

    @TableField("degreesName")
    private String degreesname;

    @TableField("tecTransAndResult")
    private String tectransandresult;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


}
