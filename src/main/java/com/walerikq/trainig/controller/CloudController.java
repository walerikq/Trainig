package com.walerikq.trainig.controller;

import com.walerikq.trainig.model.RequestDto;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Validated
@RestController
@RequestMapping("/requestCounter")
public class CloudController {

    private final RequestDto requestDto;

    @GetMapping("/testPost")
    public void requestDtoReturner(@NotNull String line){
        requestDto.requestCounter();
        requestDto.setLastLineRequest(line);
    }

    @GetMapping("/answer")
    public RequestDto requestDtoReturner(){
        return requestDto;
    }
}
