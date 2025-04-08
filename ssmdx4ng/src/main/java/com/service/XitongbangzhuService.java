package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XitongbangzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XitongbangzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XitongbangzhuView;


/**
 * 系统帮助
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public interface XitongbangzhuService extends IService<XitongbangzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XitongbangzhuVO> selectListVO(Wrapper<XitongbangzhuEntity> wrapper);
   	
   	XitongbangzhuVO selectVO(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
   	
   	List<XitongbangzhuView> selectListView(Wrapper<XitongbangzhuEntity> wrapper);
   	
   	XitongbangzhuView selectView(@Param("ew") Wrapper<XitongbangzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XitongbangzhuEntity> wrapper);
   	
}

