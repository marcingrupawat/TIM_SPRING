package com.example.demo.Panel1;

import com.example.demo.Panel1Service.Panel1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.*;

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

}
