package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GerenshiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GerenshiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenshiwuView;


/**
 * 个人事务
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public interface GerenshiwuService extends IService<GerenshiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GerenshiwuVO> selectListVO(Wrapper<GerenshiwuEntity> wrapper);
   	
   	GerenshiwuVO selectVO(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
   	
   	List<GerenshiwuView> selectListView(Wrapper<GerenshiwuEntity> wrapper);
   	
   	GerenshiwuView selectView(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GerenshiwuEntity> wrapper);
   	
}

