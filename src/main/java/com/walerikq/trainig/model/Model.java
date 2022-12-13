package com.walerikq.trainig.model;


import lombok.AllArgsConstructor;
import lombok.Data;


import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class Model {

    private int countRequest;
    @NotNull
    private String lastLineRequest;
}
