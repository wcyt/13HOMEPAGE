package com.example.kyujinsts.service.impl;



import com.example.kyujinsts.entity.ROLE;
import com.example.kyujinsts.entity.USER;
import com.example.kyujinsts.mapper.USERTABLEMapper;
import com.example.kyujinsts.service.USERTABLEService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;


@Service
public class USERTABLEServiceImpl implements USERTABLEService {

    @Autowired
    private USERTABLEMapper usertableMapper;


    @Override
    public void register(USER User, ROLE Role) {

        //1.查询数据用户是否存在该用户名
        USER userDB = (USER) usertableMapper.findByUserName(USER.getUSER_NAME());
        if(!ObjectUtils.isEmpty(userDB))throw new RuntimeException("用户名已存在！");
        {

        //2.进行注册

        	usertableMapper.save(User);
        }
        //2.如果存在报错，用户名已经存在
        //3.如果不存在进行注册

    }
	


	
    	
}
