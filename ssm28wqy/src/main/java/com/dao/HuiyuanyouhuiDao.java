package com.dao;

import com.entity.HuiyuanyouhuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanyouhuiVO;
import com.entity.view.HuiyuanyouhuiView;


/**
 * 会员优惠
 * 
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
public interface HuiyuanyouhuiDao extends BaseMapper<HuiyuanyouhuiEntity> {
	
	List<HuiyuanyouhuiVO> selectListVO(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
	
	HuiyuanyouhuiVO selectVO(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
	
	List<HuiyuanyouhuiView> selectListView(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);

	List<HuiyuanyouhuiView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
	
	HuiyuanyouhuiView selectView(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
	
}
