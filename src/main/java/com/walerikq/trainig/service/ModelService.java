package com.walerikq.trainig.service;

import com.walerikq.trainig.model.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class ModelService {
    private Model model;
    int count;
    String lastLineRequest;


    public void requestCounter(){
        int count = model.getCountRequest();
        model.setCountRequest(count++);
    }

    public void lastLineReturner(String line){
        lastLineRequest = line;
        model.setLastLineRequest(lastLineRequest);
    }

    public Model getModel(){
        return model;
    }
}
