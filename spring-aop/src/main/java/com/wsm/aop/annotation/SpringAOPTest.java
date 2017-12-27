package com.wsm.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangsm on 2017/12/27.
 */
public class SpringAOPTest {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        PersonServer bean = (PersonServer)ctx.getBean("personServiceBean");
        bean.save(null);

    }

    public void inteceptorTest(){
    }


}
