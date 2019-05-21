package com.mqs.mapper;

import com.mqs.entity.Person;
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
public interface PersonMapper extends BaseMapper<Person> {
    List<Person> selectAll();
}
