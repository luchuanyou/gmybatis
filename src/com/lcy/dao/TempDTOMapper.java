package com.lcy.dao;

import com.lcy.model.TempDTO;

public interface TempDTOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TempDTO record);

    int insertSelective(TempDTO record);

    TempDTO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TempDTO record);

    int updateByPrimaryKey(TempDTO record);
}