package com.qianpen.mybatis.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.qianpen.mybatis.po.LearnResource;
import com.qianpen.mybatis.service.LearnService;
import com.qianpen.mybatis.vo.LearnResourceVO;

import java.util.List;

/**
 * 
* @ClassName: LearnController 
* @Description: 教程页面
* @author Jihua Yi
* @date 2018年5月4日 下午2:52:16 
*
 */
@Controller
@RequestMapping("/learn")
public class LearnController  extends AbstractController{
    @Autowired
    private LearnService learnService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @GetMapping("/selectByKey")
    @ResponseBody
    public LearnResource selectByKey() {
    	LearnResourceVO learnResourceVo = new LearnResourceVO();
    	learnResourceVo.setId(1001L); 
    	LearnResource learnResource = learnService.selectByKey(learnResourceVo);
    	return learnResource;
    }

}