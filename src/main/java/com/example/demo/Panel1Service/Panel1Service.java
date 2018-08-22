package com.example.demo.Panel1Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.String.*;

@Service("Random")
public class Panel1Service {

    public List<Integer> listList = new ArrayList<Integer>();

    public String StringList(){
        listList.clear();
        String listString="";
        int number;

        Random generator = new Random();

        for (int i=0;i<10;i++) {
            number = generator.nextInt(100);
            listList.add(number);
            listString = listString +" "+ String.valueOf(number);
        }
        return listString;
    }


}
