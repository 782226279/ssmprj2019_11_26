package com.service;

import com.domain.Goods;

import java.util.List;

public interface GoodsService{


    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    void delup(int id,Goods record);

    List<Goods> selectGoods();

}
