package cn.app.zookeeper.service.impl;

import cn.app.zookeeper.service.DemoService;

/**
 * 接口测试--AA
 * Created by goujy on 2017/3/29.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}
