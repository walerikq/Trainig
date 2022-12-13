package com.walerikq.trainig.service;

import com.walerikq.trainig.model.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class ModelService {

    private int count;
    private String lastLineRequest;

    public void requestCounter(){
        ++count;
    }

    public void lastLineReturner(String line){
        lastLineRequest = line;
    }

    public Model getModel(){
        return new Model(count,lastLineRequest);
    }
}
