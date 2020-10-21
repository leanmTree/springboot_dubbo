package com.lemon.cosumer.controller;
import com.lemon.common.pojo.UserPO;
import com.lemon.provider.service.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/10/21 12:30
 **/
@RestController
public class Test {

    //dubbo提供的调用远程服务的注解
    @Reference
    TestService testService;

    @RequestMapping("/test")
    public String test() {
        UserPO po = testService.test();
        return "通过dubbo服务获取的用户名是:" + po.getName() + ",用户ID是：" + po.getId();
    }
}
