package cn.app.zookeeper.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by goujy on 2017/3/29.
 */
public class Provider {

    /**
     * 主⽅法
     *
     * @param args args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //
        System.out.println("Begin to load-provider======");
        // 加载Spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-context.xml"});
        context.start();
        //
        System.out.println("End to load-provider");
        // 为保证服务一直开着，利用输入流的阻塞来模拟
        System.in.read();
    }
}
