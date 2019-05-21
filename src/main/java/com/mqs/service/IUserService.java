package com.mqs.service;

import com.mqs.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MQS
 * @since 2019-05-06
 */
public interface IUserService extends IService<User> {
    List<User> selectAll();
}
