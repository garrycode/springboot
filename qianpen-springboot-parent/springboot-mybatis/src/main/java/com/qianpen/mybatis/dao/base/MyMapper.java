package com.qianpen.mybatis.dao.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 
* @ClassName: MyMapper 
* @Description: 继承自己的MyMapper
* @author Jihua Yi
* @date 2018年5月4日 下午2:05:43 
* 
* @param <T>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
