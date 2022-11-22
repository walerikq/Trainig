package com.walerikq.trainig.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.validation.constraints.NotNull;

@Data
//@NoArgsConstructor
@AllArgsConstructor
public class Model {

    private int countRequest;

    @NotNull
    private String lastLineRequest;
}
