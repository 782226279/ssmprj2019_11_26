package com.test;

import com.domain.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        GoodsService goodsService = classPathXmlApplicationContext.getBean("goodsServiceImpl",GoodsServiceImpl.class);
        Goods goods = goodsService.selectByPrimaryKey(1);
        System.out.println(goods.getGoodsname());


    }
}
