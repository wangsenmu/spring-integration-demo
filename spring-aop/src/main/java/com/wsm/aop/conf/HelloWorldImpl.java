package com.wsm.aop.conf;

/**
 * Created by wangsm on 2017/12/27.
 */
public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl1.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl1.doPrint()");
        return ;
    }

}
