package com.entity.vo;

import com.entity.HuiyuanyouhuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员优惠
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
public class HuiyuanyouhuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 优惠项目
	 */
	
	private String youhuixiangmu;
		
	/**
	 * 会员价格
	 */
	
	private Integer huiyuanjiage;
		
	/**
	 * 办理须知
	 */
	
	private String banlixuzhi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：优惠项目
	 */
	 
	public void setYouhuixiangmu(String youhuixiangmu) {
		this.youhuixiangmu = youhuixiangmu;
	}
	
	/**
	 * 获取：优惠项目
	 */
	public String getYouhuixiangmu() {
		return youhuixiangmu;
	}
				
	
	/**
	 * 设置：会员价格
	 */
	 
	public void setHuiyuanjiage(Integer huiyuanjiage) {
		this.huiyuanjiage = huiyuanjiage;
	}
	
	/**
	 * 获取：会员价格
	 */
	public Integer getHuiyuanjiage() {
		return huiyuanjiage;
	}
				
	
	/**
	 * 设置：办理须知
	 */
	 
	public void setBanlixuzhi(String banlixuzhi) {
		this.banlixuzhi = banlixuzhi;
	}
	
	/**
	 * 获取：办理须知
	 */
	public String getBanlixuzhi() {
		return banlixuzhi;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
