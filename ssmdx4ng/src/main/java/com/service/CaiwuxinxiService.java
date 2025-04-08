package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaiwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaiwuxinxiView;


/**
 * 财务信息
 *
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public interface CaiwuxinxiService extends IService<CaiwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaiwuxinxiVO> selectListVO(Wrapper<CaiwuxinxiEntity> wrapper);
   	
   	CaiwuxinxiVO selectVO(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
   	
   	List<CaiwuxinxiView> selectListView(Wrapper<CaiwuxinxiEntity> wrapper);
   	
   	CaiwuxinxiView selectView(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaiwuxinxiEntity> wrapper);
   	
}

