package com.example.kyujinsts.mapper;


import com.example.kyujinsts.entity.USER;

import java.util.List;

public interface USERTABLEMapper {
	 //根据用户名查询用户
	USERTABLEMapper findByUserName(String username);;
	//注册用户
	void save(USER user);
	
	
}
