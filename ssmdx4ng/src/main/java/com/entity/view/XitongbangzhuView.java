package com.entity.view;

import com.entity.XitongbangzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 系统帮助
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
@TableName("xitongbangzhu")
public class XitongbangzhuView  extends XitongbangzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XitongbangzhuView(){
	}
 
 	public XitongbangzhuView(XitongbangzhuEntity xitongbangzhuEntity){
 	try {
			BeanUtils.copyProperties(this, xitongbangzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
