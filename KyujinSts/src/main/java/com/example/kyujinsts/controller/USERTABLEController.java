package com.example.kyujinsts.controller;

import com.example.kyujinsts.controller.USERTABLEController;
import com.example.kyujinsts.entity.ROLE;
import com.example.kyujinsts.entity.USER;
import com.example.kyujinsts.service.USERTABLEService;
import com.example.kyujinsts.service.impl.UserService;
import com.example.kyujinsts.service.USERTABLEService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@//用户开发功能
Controller
@RequestMapping("user")
public class USERTABLEController {

    private static final Logger log = LoggerFactory.getLogger( USERTABLEController.class);

    private final USERTABLEService Usertableservice;

    public USERTABLEController(com.example.kyujinsts.service.USERTABLEService userService) {
    	 Usertableservice = userService;
    }
    /*
     *用户注册
     *@
     */
    @PostMapping("/register")
    public  String register(USER User,ROLE Role) throws UnsupportedEncodingException {
        log.debug("用户名：{},邮箱：{}，密码：{}，类别：{}",User.getUSER_NAME(),User.getUSER_PASSWORD(),User.getUSER_mailAddress(),Role.getR_TYPE());

        try {
            //必須項目チェック
            if (User.getUSER_mailAddress() != null)throw new RuntimeException("「メールアドレス」を入力して下さい");
            if (USER.getUSER_NAME() != null)throw new RuntimeException("「ユーザー名」を入力して下さい");
            if (USER.getUSER_PASSWORD() != null)throw new RuntimeException("「パスワード」を入力して下さい");
            if (USER.getUSER_PASSWORD() != null)throw new RuntimeException("「確認パスワード」を入力して下さい");
            //1,注册用户
            UserService.register(User,Role);
        }catch (RuntimeException e){
            e.printStackTrace();
            return "redirect:/register.jsp?msg=" + URLEncoder.encode(e.getMessage(),"UTF-8");
            //jspみかんせい
        }

        return "redirect:/login.jsp";
    }
}
