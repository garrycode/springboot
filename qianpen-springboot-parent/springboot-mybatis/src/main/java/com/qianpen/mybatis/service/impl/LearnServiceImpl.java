package com.qianpen.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qianpen.mybatis.dao.all.LearnResourceMapper;
import com.qianpen.mybatis.po.LearnResource;
import com.qianpen.mybatis.service.LearnService;


import java.util.Arrays;

/**
 * 
* @ClassName: LearnServiceImpl 
* @Description: 学习实现
* @author Jihua Yi
* @date 2018年5月4日 下午2:47:21 
*
 */
@Service
public class LearnServiceImpl extends BaseServiceImpl<LearnResource> implements LearnService {

    @Autowired
    private LearnResourceMapper  learnResourceMapper;


}
