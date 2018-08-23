package com.example.demo.Panel1;

import com.example.demo.Panel1Service.Panel1Service;
import com.example.demo.Panel1Service.Panel1ServiceJason;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Panel1Controller {


    @Autowired
    Panel1Service panel1Service;

    @RequestMapping(value = "/gen", method = RequestMethod.GET, produces = { MimeTypeUtils.TEXT_PLAIN_VALUE })
    public ResponseEntity<String> Panel1() {
        try {
            ResponseEntity<String> responseEntity = new ResponseEntity<String>(panel1Service.StringList(), HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }

    @Autowired
    Panel1ServiceJason panel1ServiceJason;

    @RequestMapping(value = "/generatorjason", method = RequestMethod.GET, produces = { MimeTypeUtils.TEXT_PLAIN_VALUE })
    public ResponseEntity<String> Panel1jason() {
        List<JSONObject> jasonList = new ArrayList<JSONObject>();
        jasonList.add(panel1ServiceJason.StringListJason1());
        try {
            ResponseEntity<String> responseEntity = new ResponseEntity<String>(String.valueOf(panel1ServiceJason.StringListJason1()), HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }


}
