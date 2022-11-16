package com.walerikq.trainig.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Service
public class RequestDto {

    private int countRequest;

    @NotNull
    private String lastLineRequest;

    public void requestCounter(){
        this.countRequest++;
    }

    public void lastLineReturner(String line){
        this.lastLineRequest = line;
    }
}
