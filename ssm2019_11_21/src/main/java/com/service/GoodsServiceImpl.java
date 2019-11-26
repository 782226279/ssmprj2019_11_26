package com.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.domain.Goods;
import com.mapper.GoodsMapper;
import com.service.GoodsService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return goodsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods selectByPrimaryKey(Integer id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void delup(int id, Goods record) {
        goodsMapper.deleteByPrimaryKey(id);
        // Integer.valueOf("a");
        goodsMapper.updateByPrimaryKey(record);

    }

    @Override
    public List<Goods> selectGoods() {
        Goods goods = new Goods();
        goods.setId(2);
        goods.setGoodsname("aa");
        goods.setMyorderid(4);

        List<Goods> list = new ArrayList();
        list.add(goodsMapper.selectByPrimaryKey(goods));
        return list;
        // return goodsMapper.select(goods);
    }

}
