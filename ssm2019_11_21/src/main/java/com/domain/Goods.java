package com.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;
import java.util.Map;

public class Goods {

    @Id
    private Integer id;

    private String goodsname;

    private Integer myorderid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getMyorderid() {
        return myorderid;
    }

    public void setMyorderid(Integer myorderid) {
        this.myorderid = myorderid;
    }
}