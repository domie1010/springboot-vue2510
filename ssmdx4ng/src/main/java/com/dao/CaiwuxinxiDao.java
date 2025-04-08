package com.dao;

import com.entity.CaiwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaiwuxinxiVO;
import com.entity.view.CaiwuxinxiView;


/**
 * 财务信息
 * 
 * @author 
 * @email 
 * @date 2021-05-18 20:47:33
 */
public interface CaiwuxinxiDao extends BaseMapper<CaiwuxinxiEntity> {
	
	List<CaiwuxinxiVO> selectListVO(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
	
	CaiwuxinxiVO selectVO(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
	
	List<CaiwuxinxiView> selectListView(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);

	List<CaiwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
	
	CaiwuxinxiView selectView(@Param("ew") Wrapper<CaiwuxinxiEntity> wrapper);
	
}
