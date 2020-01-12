package com.itdan.my_vhr.controller;

import com.itdan.my_vhr.model.Menu;
import com.itdan.my_vhr.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(value ="系统菜单初始化" )
@CrossOrigin
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    private MenuService menuService;


    @ApiOperation(value = "根据登入的用户ID获取其能访问的相应菜单",notes = "菜单栏查询")
    @GetMapping("/menu")
    public List<Menu> getSystemConfigMenuByHrId(){
        return menuService.getSystemConfigMenuByHrId();
    }

}
