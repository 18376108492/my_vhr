package com.itdan.my_vhr.controller;

import com.itdan.my_vhr.model.RespBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "登入控制")
@CrossOrigin
@RestController
public class LoginController {

    @ApiOperation(value = "用户登入操作",notes = "登入操作")
    @GetMapping("/login")
    public RespBean login () {
        return RespBean.error("尚未登入，请登入");
    }

}
