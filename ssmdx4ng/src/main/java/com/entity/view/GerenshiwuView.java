package com.entity.view;

import com.entity.GerenshiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 个人事务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
@TableName("gerenshiwu")
public class GerenshiwuView  extends GerenshiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GerenshiwuView(){
	}
 
 	public GerenshiwuView(GerenshiwuEntity gerenshiwuEntity){
 	try {
			BeanUtils.copyProperties(this, gerenshiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
