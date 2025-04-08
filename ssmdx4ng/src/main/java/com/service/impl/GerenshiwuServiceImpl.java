package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GerenshiwuDao;
import com.entity.GerenshiwuEntity;
import com.service.GerenshiwuService;
import com.entity.vo.GerenshiwuVO;
import com.entity.view.GerenshiwuView;

@Service("gerenshiwuService")
public class GerenshiwuServiceImpl extends ServiceImpl<GerenshiwuDao, GerenshiwuEntity> implements GerenshiwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GerenshiwuEntity> page = this.selectPage(
                new Query<GerenshiwuEntity>(params).getPage(),
                new EntityWrapper<GerenshiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GerenshiwuEntity> wrapper) {
		  Page<GerenshiwuView> page =new Query<GerenshiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GerenshiwuVO> selectListVO(Wrapper<GerenshiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GerenshiwuVO selectVO(Wrapper<GerenshiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GerenshiwuView> selectListView(Wrapper<GerenshiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GerenshiwuView selectView(Wrapper<GerenshiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
