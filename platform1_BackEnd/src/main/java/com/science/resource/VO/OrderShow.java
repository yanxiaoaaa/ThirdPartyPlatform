package com.science.resource.VO;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
public class OrderShow implements Serializable {
    private Integer orderId;

//    @TableField(typeHandler = FastjsonTypeHandler.class)
//    @ApiModelProperty(value = "文章中的图片地址")
    private String serverId;

    private String serviceName;
    private String server;
    private Date createTime;
    private Integer processId;
    private String note;
}
