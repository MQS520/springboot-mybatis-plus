package com.mqs.mapper;

import com.mqs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author MQS
 * @since 2019-05-06
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> selectAll();
}
