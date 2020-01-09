package com.itdan.my_vhr.controller;

import com.itdan.my_vhr.model.Menu;
import com.itdan.my_vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统菜单初始化层
 */
@CrossOrigin
@RestController
@RequestMapping("/system/config")
public class SystemConfigController {

    @Autowired
    private MenuService menuService;

    /**
     * 根据登入的用户ID获取其能访问的相应菜单
     * @return
     */
    @GetMapping("/menu")
    public List<Menu> getSystemConfigMenuByHrId(){
        return menuService.getSystemConfigMenuByHrId();
    }

}
