package com.example.demo.Panel2;


import com.example.demo.Panel2Service.Panel2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Panel2Controller {


    @Autowired
    Panel2Service panel2Service;


    @RequestMapping(value = "/avg", method = RequestMethod.GET, produces = { MimeTypeUtils.TEXT_PLAIN_VALUE })
     public ResponseEntity<String> Panel2() {
        try {
            ResponseEntity<String> responseEntity = new ResponseEntity<String>(String.valueOf(panel2Service.sumList()), HttpStatus.OK);
            return responseEntity;
        } catch (Exception e) {
            return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        }
    }
}
