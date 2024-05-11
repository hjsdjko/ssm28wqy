package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanyouhuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanyouhuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanyouhuiView;


/**
 * 会员优惠
 *
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
public interface HuiyuanyouhuiService extends IService<HuiyuanyouhuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanyouhuiVO> selectListVO(Wrapper<HuiyuanyouhuiEntity> wrapper);
   	
   	HuiyuanyouhuiVO selectVO(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
   	
   	List<HuiyuanyouhuiView> selectListView(Wrapper<HuiyuanyouhuiEntity> wrapper);
   	
   	HuiyuanyouhuiView selectView(@Param("ew") Wrapper<HuiyuanyouhuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanyouhuiEntity> wrapper);
   	
}

