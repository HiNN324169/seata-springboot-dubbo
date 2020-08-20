package com.nn.user.service;

import com.nn.interf.AgentInterface;
import com.nn.interf.UserInterface;
import com.nn.user.mapper.UserMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserService
 * @Author nn
 * @Date 2020/8/19 14:27
 */
@Service
public class UserServiceImpl implements UserInterface {

    @Autowired
    private UserMapper userMapper;

    @Reference
    private AgentInterface agentInterface;

    /**
     * 商户，添加入金
     *
     * @param money
     */
    @Override
//    @Transactional
    @GlobalTransactional(timeoutMills = 60000 * 10)
    public void addMoney(Integer money) {


        userMapper.addMoney(money);

        // 代理提成
        agentInterface.addMoney(2);
        int a = 1/0;
    }
}
