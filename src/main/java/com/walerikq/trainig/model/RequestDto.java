package com.walerikq.trainig.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

    private Integer countRequest;
    @NotNull(message = "name cannot be null")
    private String lastLineRequest;
}
