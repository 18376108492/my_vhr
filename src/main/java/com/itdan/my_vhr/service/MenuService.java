package com.itdan.my_vhr.service;

import com.itdan.my_vhr.mapper.MenuMapper;
import com.itdan.my_vhr.model.Hr;
import com.itdan.my_vhr.model.Menu;
import com.itdan.my_vhr.model.RespBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuMapper menuMapper;

    private Logger logger=LoggerFactory.getLogger(MenuService.class);

    /**
     * 根据登入的用户ID获取其能访问的相应菜单
     * @return
     */
    public List<Menu> getSystemConfigMenuByHrId(){
        //从SecurityContextHolder中获取到登入用户的信息，在获取ID
        logger.info("根据登入的用户ID获取其能访问的相应菜单操作");
        List<Menu> menuList=   menuMapper.getSystemConfigMenuByHrId(((Hr)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
        logger.info("根据登入的用户ID获取其能访问的相应菜单操作成功");
        return menuList;
    }

    /**
     * 获取数据中的所有菜单
     * @return
     */
    public List<Menu> getAllEmnus(){
        logger.info("获取数据中的所有菜单操作");
        List<Menu> menuList=   menuMapper.getAllEmnus();
        logger.info("获取数据中的所有菜单操作成功");
        return menuList;
    }
}
