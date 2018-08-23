package com.example.demo.Panel1Service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import java.util.Random;


@Service("RandomJason")
public class Panel1ServiceJason {


    JSONObject jasonObject = new JSONObject();

       public JSONObject StringListJason1 (){

        int number;

        Random generator = new Random();

        for (int i=0;i<10;i++) {
            number = generator.nextInt(100);
            jasonObject.put("ID",i);
            jasonObject.put("NUMBER",number);

        }
        return jasonObject;
    }

}
