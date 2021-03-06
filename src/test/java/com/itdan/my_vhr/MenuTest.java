package com.itdan.my_vhr;


import com.itdan.my_vhr.mapper.MenuMapper;
import com.itdan.my_vhr.model.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuTest {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void test01(){
        List<Menu> menus=menuMapper.getAllMenus();
        System.out.println(menus.toString());
    }

    @Test
    public void test02(){
        List<Menu> menus=menuMapper.getAllMenusByTree();
        System.out.println(menus.toString());
    }
}
