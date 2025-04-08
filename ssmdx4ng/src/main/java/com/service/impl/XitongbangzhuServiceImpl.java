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


import com.dao.XitongbangzhuDao;
import com.entity.XitongbangzhuEntity;
import com.service.XitongbangzhuService;
import com.entity.vo.XitongbangzhuVO;
import com.entity.view.XitongbangzhuView;

@Service("xitongbangzhuService")
public class XitongbangzhuServiceImpl extends ServiceImpl<XitongbangzhuDao, XitongbangzhuEntity> implements XitongbangzhuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XitongbangzhuEntity> page = this.selectPage(
                new Query<XitongbangzhuEntity>(params).getPage(),
                new EntityWrapper<XitongbangzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XitongbangzhuEntity> wrapper) {
		  Page<XitongbangzhuView> page =new Query<XitongbangzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XitongbangzhuVO> selectListVO(Wrapper<XitongbangzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XitongbangzhuVO selectVO(Wrapper<XitongbangzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XitongbangzhuView> selectListView(Wrapper<XitongbangzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XitongbangzhuView selectView(Wrapper<XitongbangzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
