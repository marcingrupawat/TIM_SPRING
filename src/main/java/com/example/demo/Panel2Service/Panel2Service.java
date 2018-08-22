package com.example.demo.Panel2Service;
import com.example.demo.Panel1Service.Panel1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Average")
public class Panel2Service {

    @Autowired
    Panel1Service panel1Service;

    public double avgList(int arg){

        return arg/panel1Service.listList.size();
    }

    public double sumList (){

        int sum=0;
        for (int i=0;i<panel1Service.listList.size();i++){
                sum=sum+panel1Service.listList.get(i);
                }


        return avgList(sum);
    }



}
