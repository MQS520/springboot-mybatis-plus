package com.mqs.service.impl;

import com.mqs.entity.User;
import com.mqs.mapper.UserMapper;
import com.mqs.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MQS
 * @since 2019-05-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
