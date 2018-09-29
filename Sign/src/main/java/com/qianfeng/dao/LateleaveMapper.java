package com.qianfeng.dao;

import com.qianfeng.entity.LateleaveKey;

public interface LateleaveMapper {
    int deleteByPrimaryKey(LateleaveKey key);

    int insert(LateleaveKey record);

    int insertSelective(LateleaveKey record);
}