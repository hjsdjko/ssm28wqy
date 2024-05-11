package com.entity.view;

import com.entity.HuiyuanyouhuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 会员优惠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
@TableName("huiyuanyouhui")
public class HuiyuanyouhuiView  extends HuiyuanyouhuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuiyuanyouhuiView(){
	}
 
 	public HuiyuanyouhuiView(HuiyuanyouhuiEntity huiyuanyouhuiEntity){
 	try {
			BeanUtils.copyProperties(this, huiyuanyouhuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
