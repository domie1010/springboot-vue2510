package com.entity.vo;

import com.entity.XitongbangzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 系统帮助
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public class XitongbangzhuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 使用帮助
	 */
	
	private String shiyongbangzhu;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
				
	
	/**
	 * 设置：使用帮助
	 */
	 
	public void setShiyongbangzhu(String shiyongbangzhu) {
		this.shiyongbangzhu = shiyongbangzhu;
	}
	
	/**
	 * 获取：使用帮助
	 */
	public String getShiyongbangzhu() {
		return shiyongbangzhu;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
			
}
