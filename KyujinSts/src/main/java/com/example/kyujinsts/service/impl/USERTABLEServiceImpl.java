package com.example.kyujinsts.service.impl;

import com.example.kyujinsts.entity.USER;
import com.example.kyujinsts.mapper.USERTABLEMapper;
import com.example.kyujinsts.service.USERTABLEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USERTABLEServiceImpl implements USERTABLEService {

    @Autowired
    private USERTABLEMapper usertableMapper;


    @Override
    public List<USER> list() {
        List list = usertableMapper.list();
        return list;
    }
}
