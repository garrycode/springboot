package com.qianpen.mybatis.dao;


import java.util.List;
import java.util.Map;

import com.qianpen.mybatis.domain.LearnResource;
import com.qianpen.mybatis.util.MyMapper;

public interface LearnResourceMapper extends MyMapper<LearnResource> {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);
}