package com.itdan.my_vhr.service;

import com.itdan.my_vhr.mapper.HrMapper;
import com.itdan.my_vhr.model.Hr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HrService implements UserDetailsService {

    @Autowired
    private HrMapper hrMapper;

    private Logger logger=LoggerFactory.getLogger(HrService.class);


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
          logger.info("根据hr名查询用户操作,参数为:"+s);
          Hr hr= hrMapper.loadUserByUsername(s);
          if(null==hr){
              logger.error("根据hr名查询用户操作失败,用户不存在");
              throw new UsernameNotFoundException("根据hr名查询用户操作失败,用户不存在");
          }
          logger.info("根据hr名查询用户操作成功");
         //用户登入成功后给用户设置角色
        hr.setRoles(hrMapper.getRoleById(hr.getId()));
        return hr;
    }



}
