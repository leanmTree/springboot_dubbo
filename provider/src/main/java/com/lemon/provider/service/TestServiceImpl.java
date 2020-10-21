package com.lemon.provider.service;


import com.lemon.common.pojo.UserPO;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author hengtao.wu
 *
 * dubbo服务提供接口
 * 导入的是dubbo下的service注解
 *
 * @Date 2020/10/21 11:45
 **/
@Service
public class TestServiceImpl implements TestService{

    @Override
    public UserPO test() {
        UserPO po = new UserPO();
        po.setId(1);
        po.setName("测试用户");
        return po;
    }
}
