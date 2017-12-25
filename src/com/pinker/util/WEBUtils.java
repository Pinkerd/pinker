package com.pinker.util;


import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;

public class WEBUtils {

    public static <T>T para2bean(HttpServletRequest request, Class<T> clazz){
        T t=null;
        try {
            t=clazz.newInstance();
            BeanUtils.populate(t,request.getParameterMap());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
