package com.lemon.provider.service;
import com.lemon.common.pojo.UserPO;
import org.apache.dubbo.config.annotation.Service;

/**
 * dubbo服务提供接口
 * 导入的是dubbo下的service注解，指定服务版本，以及该服务对应的接口类，默认是实现的接口
 * @Date 2020/10/21 11:45
 **/
@Service(version = "1.0.0", interfaceClass = TestService.class)
public class TestServiceImpl implements TestService{

    @Override
    public UserPO test() {
        UserPO po = new UserPO();
        po.setId(1);
        po.setName("测试用户");
        return po;
    }
}
