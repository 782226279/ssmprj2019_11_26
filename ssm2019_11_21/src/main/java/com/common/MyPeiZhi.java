package com.common;

import org.apache.ibatis.io.Resources;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
@Component
public class MyPeiZhi {

    public static int pagecount;
    public static String a;

    public MyPeiZhi() {
        pagecount = Integer.parseInt(properties.getProperty("pagecount"));
        a = properties.getProperty("a");
    }


    private static Properties properties = null;

    static {
        init();
    }

    private static void init() {
        properties = new Properties();
        try {
            properties.load(Resources.getResourceAsStream("common.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String s) {
        if (properties == null) {
            init();
        }
        return properties.getProperty(s);
    }

    public static void main(String[] args) {
        String pagecount = getValue("pagecount");
        System.out.println(pagecount);
    }

}
