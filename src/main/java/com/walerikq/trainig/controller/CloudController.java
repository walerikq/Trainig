package com.walerikq.trainig.controller;

import com.walerikq.trainig.model.ExceptionResponse;
import com.walerikq.trainig.model.RequestDto;
import org.jetbrains.annotations.NotNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Validated
@RestController
@RequestMapping("/requestCounter")
public class CloudController {


    Integer count = 0;
    RequestDto requestDto = new RequestDto();

    @GetMapping("/testPost")
    public void requestDtoReturner(@RequestParam("line")@NotNull String line){
//
//        if (line.equals(null)){
//            new ExceptionResponse(400,"Line cannot null");
//        }

        count = count + 1;
        requestDto.setLastLineRequest(line);
        requestDto.setCountRequest(count);
    }

    @GetMapping("/answer")
    public RequestDto requestDtoReturner(){
        return requestDto;
    }
}
