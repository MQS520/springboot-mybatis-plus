package com.mqs.controller;


import com.mqs.entity.Person;
import com.mqs.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author MQS
 * @since 2019-05-06
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IPersonService personService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public List<Person> add(){
        return personService.selectAll();
    }

}
