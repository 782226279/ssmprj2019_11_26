package com.controller;

import com.common.MyPeiZhi;
import com.domain.Goods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource(name ="goodsServiceImpl" )
    GoodsService goodsService;

    @RequestMapping("/testa")
    public String testa(int id){
        // ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application.xml");
        // GoodsService goodsService = classPathXmlApplicationContext.getBean("goodsServiceImpl", GoodsServiceImpl.class);
        Goods goods = goodsService.selectByPrimaryKey(id);
        System.out.println(goods.getGoodsname());
        return "";
    }

    @RequestMapping("/testb")
    public String testb(int id){
        Goods goods=new Goods();
        goods.setId(138);
        goods.setGoodsname("aaaaa");
        goodsService.delup(137,goods);
        System.out.println("ok");
        return "";
    }
    @RequestMapping("/testc")
    public ModelAndView testc(int page){
        int pagecount= MyPeiZhi.pagecount;//每页条数

        PageHelper.startPage(page,pagecount);//设置分页参数

        List<Goods> goods = goodsService.selectGoods();

        PageInfo pageInfo=new PageInfo(goods);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("goods",goods);
        modelAndView.addObject("pageInfo",pageInfo);
        modelAndView.setViewName("forward:index.jsp");
        return modelAndView;
    }
}
