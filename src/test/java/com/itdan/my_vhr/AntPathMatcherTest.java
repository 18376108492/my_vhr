package com.itdan.my_vhr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.AntPathMatcher;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AntPathMatcherTest {

    @Test
    public void test(){
        String urlReq="/employee/basic/test01";
        String url="/employee/basic/**";
        //使用antPathMatcher去比较访问路径是否一致
        AntPathMatcher antPathMatcher = new AntPathMatcher();
        System.out.println(antPathMatcher.match(url,urlReq));

    }
}
