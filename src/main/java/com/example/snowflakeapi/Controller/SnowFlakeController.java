package com.example.snowflakeapi.Controller;

import com.example.snowflakeapi.Entity.SnowFlakeID;
import com.example.snowflakeapi.Response.ResponseHandler;
import com.example.snowflakeapi.Service.SnowFlakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/id")
public class SnowFlakeController {

    @Autowired
    SnowFlakeService snowFlakeService;

    @PostMapping("")
    @ResponseBody
    public ResponseEntity<?> generateNewID(){
        Long newID = snowFlakeService.newIdSequence();
        return ResponseHandler.generateResponse(HttpStatus.OK, newID);
    }
}
