package com.wsm.aop.conf;

/**
 * Created by wangsm on 2017/12/27.
 */
public class HelloWorldImpl2 implements HelloWorld {

    public void printHelloWorld()
    {
        System.out.println("Enter HelloWorldImpl2.printHelloWorld()");
    }

    public void doPrint()
    {
        System.out.println("Enter HelloWorldImpl2.doPrint()");
        return ;
    }

}
