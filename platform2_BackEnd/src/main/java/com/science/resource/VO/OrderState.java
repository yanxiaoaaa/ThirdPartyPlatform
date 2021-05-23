package com.science.resource.VO;

import io.swagger.models.auth.In;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderState {
    private Integer state;
    private Integer done;
}
