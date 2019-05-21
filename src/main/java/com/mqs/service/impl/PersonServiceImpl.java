package com.mqs.service.impl;

import com.mqs.entity.Person;
import com.mqs.mapper.PersonMapper;
import com.mqs.service.IPersonService;
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
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> selectAll() {
        return personMapper.selectAll();
    }
}
