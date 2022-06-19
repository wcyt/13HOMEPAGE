package com.example.kyujinsts.controller;

import com.example.kyujinsts.entity.USER;
import com.example.kyujinsts.service.USERTABLEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("test")
@RestController
public class USERTABLEController {
    @Autowired
    private USERTABLEService usertableService;

    @RequestMapping("/list")
    public List<USER> list(){
        List<USER> list = usertableService.list();
        return list;
    }



}
