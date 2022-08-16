package com.example.dao;

import com.example.entity.Role;
import com.example.entity.User;
import com.example.entity.UserRole;

//20220703 wangyide:daoの追加

public interface Userdao {
    //register機能
    User findByUserName(String mail);
    void saveUser(User user);
    void saveRole(Role role);
    void saveUserRole(UserRole UserRole);
   
}
