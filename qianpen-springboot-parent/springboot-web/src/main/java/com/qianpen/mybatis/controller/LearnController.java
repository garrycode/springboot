package com.qianpen.mybatis.controller;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.qianpen.mybatis.domain.LearnResource;
import com.qianpen.mybatis.model.LeanQueryLeanListReq;
import com.qianpen.mybatis.service.LearnService;
import com.qianpen.mybatis.util.AjaxObject;
import com.qianpen.mybatis.util.Page;

/** 教程页面
 * Created by tengj on 2017/3/13.
 */
@Controller
@RequestMapping("/learn")
public class LearnController  extends AbstractController{
    @Autowired
    private LearnService learnService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("")
    public String learn(Model model){
        model.addAttribute("ctx", getContextPath()+"/");
        return "learn-resource";
    }

    /**
     * 查询教程列表
     * @param page
     * @return
     */
    @RequestMapping(value = "/queryLeanList",method = RequestMethod.GET)
    @ResponseBody
    public AjaxObject queryLearnList(Page<LeanQueryLeanListReq> page){
        List<LearnResource> learnList=learnService.queryLearnResouceList(page);
        PageInfo<LearnResource> pageInfo =new PageInfo<LearnResource>(learnList);
        return AjaxObject.ok().put("page", pageInfo);
    }
    /**
     * 新添教程
     * @param learn
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public AjaxObject addLearn(@RequestBody LearnResource learn){
        learnService.save(learn);
        return AjaxObject.ok();
    }

    /**
     * 修改教程
     * @param learn
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public AjaxObject updateLearn(@RequestBody LearnResource learn){
        learnService.updateNotNull(learn);
        return AjaxObject.ok();
    }

    /**
     * 删除教程
     * @param ids
     */
    @RequestMapping(value="/delete",method = RequestMethod.POST)
    @ResponseBody
    public AjaxObject deleteLearn(@RequestBody Long[] ids){
        learnService.deleteBatch(ids);
        return AjaxObject.ok();
    }
}