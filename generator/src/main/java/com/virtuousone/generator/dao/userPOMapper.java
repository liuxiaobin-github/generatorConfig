package com.virtuousone.generator.dao;

import com.virtuousone.generator.po.userPO;

public interface userPOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userPO record);

    int insertSelective(userPO record);

    userPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userPO record);

    int updateByPrimaryKey(userPO record);
}