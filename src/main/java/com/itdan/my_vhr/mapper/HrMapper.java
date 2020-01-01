package com.itdan.my_vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import com.itdan.my_vhr.model.Hr;


@Component
@Mapper
public interface HrMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    /**
     * 根据hr名查询hr信息
     * @param username
     * @return
     */
    Hr loadUserByUsername(String username);

}
