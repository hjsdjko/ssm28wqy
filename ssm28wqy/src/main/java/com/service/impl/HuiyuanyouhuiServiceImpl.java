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


import com.dao.HuiyuanyouhuiDao;
import com.entity.HuiyuanyouhuiEntity;
import com.service.HuiyuanyouhuiService;
import com.entity.vo.HuiyuanyouhuiVO;
import com.entity.view.HuiyuanyouhuiView;

@Service("huiyuanyouhuiService")
public class HuiyuanyouhuiServiceImpl extends ServiceImpl<HuiyuanyouhuiDao, HuiyuanyouhuiEntity> implements HuiyuanyouhuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanyouhuiEntity> page = this.selectPage(
                new Query<HuiyuanyouhuiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanyouhuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanyouhuiEntity> wrapper) {
		  Page<HuiyuanyouhuiView> page =new Query<HuiyuanyouhuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanyouhuiVO> selectListVO(Wrapper<HuiyuanyouhuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanyouhuiVO selectVO(Wrapper<HuiyuanyouhuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanyouhuiView> selectListView(Wrapper<HuiyuanyouhuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanyouhuiView selectView(Wrapper<HuiyuanyouhuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
