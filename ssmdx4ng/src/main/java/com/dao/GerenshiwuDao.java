package com.dao;

import com.entity.GerenshiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GerenshiwuVO;
import com.entity.view.GerenshiwuView;


/**
 * 个人事务
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public interface GerenshiwuDao extends BaseMapper<GerenshiwuEntity> {
	
	List<GerenshiwuVO> selectListVO(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
	
	GerenshiwuVO selectVO(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
	
	List<GerenshiwuView> selectListView(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);

	List<GerenshiwuView> selectListView(Pagination page,@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
	
	GerenshiwuView selectView(@Param("ew") Wrapper<GerenshiwuEntity> wrapper);
	
}
