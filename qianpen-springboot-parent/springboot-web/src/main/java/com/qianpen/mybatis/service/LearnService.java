package com.qianpen.mybatis.service;

import com.github.pagehelper.PageInfo;
import com.qianpen.mybatis.domain.LearnResource;
import com.qianpen.mybatis.model.LeanQueryLeanListReq;
import com.qianpen.mybatis.util.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by tengj on 2017/4/7.	
 */

public interface LearnService  extends IService<LearnResource>{
    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);
    public void deleteBatch(Long[] ids);
}
