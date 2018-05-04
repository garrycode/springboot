package com.qianpen.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
* @ClassName: BaseService 
* @Description: 通用接口
* @author Jihua Yi
* @date 2018年5月4日 下午2:13:35 
* 
* @param <T>
 */
@Service
public interface BaseService<T> {
	
	/**
	 * 
	* @Title: selectByKey 
	* @Description: 查询单条记录
	* @param key
	* @return T
	* @throws
	 */
	T selectByKey(Object key);
	
	/**
	 * 
	* @Title: save 
	* @Description: 保存实体
	* @param entity
	* @return int
	* @throws
	 */
	int save(T entity);
	
	/**
	 * 
	* @Title: delete 
	* @Description: 删除记录
	* @param key
	* @return int
	* @throws
	 */
	int delete(Object key);
	
	/**
	 * 
	* @Title: updateAll 
	* @Description: 更新所有
	* @param entity
	* @return int
	* @throws
	 */
	int updateAll(T entity);
	
	/**
	 * 
	* @Title: updateNotNull 
	* @Description: 更新不为空
	* @param entity
	* @return int
	* @throws
	 */
	int updateNotNull(T entity);
	
	/**
	 * 
	* @Title: selectByExample 
	* @Description: 查询列表
	* @param example
	* @return List<T>
	* @throws
	 */
	List<T> selectByExample(Object example);

}
