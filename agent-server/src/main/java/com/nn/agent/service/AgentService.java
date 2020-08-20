package com.nn.agent.service;

import com.nn.agent.mapper.AgentMapper;
import com.nn.interf.AgentInterface;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName AgentService
 * @Author nn
 * @Date 2020/8/19 15:58
 */
@Service
public class AgentService implements AgentInterface {

    @Autowired
    private AgentMapper agentMapper;
    /**
     * 代理，添加佣金
     *
     * @param money
     */
    @Override
    public void addMoney(Integer money) {
        agentMapper.addMoney(money);
    }
}
