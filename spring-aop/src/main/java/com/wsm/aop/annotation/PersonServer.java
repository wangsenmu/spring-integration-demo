package com.wsm.aop.annotation;

/**
 * Created by wangsm on 2017/12/27.
 */
public interface PersonServer {

    public void save(String name);
    public void update(String name, Integer id);
    public String getPersonName(Integer id);

}
