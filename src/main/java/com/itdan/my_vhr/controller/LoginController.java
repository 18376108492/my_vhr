package com.itdan.my_vhr.controller;

import com.itdan.my_vhr.model.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登入控制层
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public RespBean login () {
        return RespBean.error("尚未登入，请登入");
    }

}
