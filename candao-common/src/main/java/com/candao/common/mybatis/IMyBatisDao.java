package com.candao.common.mybatis;

import java.util.List;

/**
 * @Description: dao类的基础类(mybatis)
 * @Company:人联科技
 * @create Author: 余城序
 * @create Date: 2016年2月23日下午2:12:48
 * @version 1.0
 */
public interface IMyBatisDao<PK,T> {
	
	void insert(T t);
	
	void delete(PK id);
	
	void update(T t);
	/**
	 * 
	 * @Description:获取对象集合
	 * @create: 余城序
	 * @Modification:
	 * @param t 对象条件
	 * @return List<T>
	 */
	List<T> findList(Object t);
	/**
	 * 
	 * @Description:获取对象集合总数
	 * @create: 余城序
	 * @Modification:
	 * @param t 对象条件
	 * @return List<T>
	 */
	long findCount(T t);
	/**
	 * 
	 * @Description:根据id获取对象
	 * @create: 余城序
	 * @Modification:
	 * @param id 对象id
	 * @return T
	 */
	T findById(PK id);

}
