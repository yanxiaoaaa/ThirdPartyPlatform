package com.science.resource.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
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
 * @since 2021-03-29
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServiceOrder对象", description="")
public class ServiceOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Integer orderId;

    @TableField(typeHandler = FastjsonTypeHandler.class)
    @ApiModelProperty(value = "文章中的图片地址")
    private List<Integer> serverId;

    private Date createTime;

    private Integer serviceId;

    private Integer customerId;

    private Integer sConversationCommentScore;

    private String sConversationCommentText;

    private Integer cConversationCommentScore;

    private String cConversationCommentText;

    private Integer processId;

    private Integer completeness;

    private Integer punctuality;

    private Integer cEvaluationScore;

    private Integer professionalLevel;

    private Integer responseSpeed;

    private Integer serviceExperience;

    private String commentContext;

    private Integer cCooperateScore;

    private Integer sCooperateScore;

    private Integer sEvaluationScore;

    private String note;

    private Integer applyId;

    private String protocal;

    private Integer isDone;

    private String resultFile;

    private String traceFile;

    public ServiceOrder(Integer serviceId, List<Integer> serverId, Integer customerId, Integer applyId, Date createTime){
        this.serviceId = serviceId;
        this.serverId = serverId;
        this.customerId = customerId;
        this.applyId = applyId;
        this.createTime = createTime;
    }
    public void updateState(Integer state){
        this.processId = state;
    }
}
