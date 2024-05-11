package com.entity.vo;

import com.entity.GequxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 歌曲信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
public class GequxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 歌曲分类
	 */
	
	private String gequfenlei;
		
	/**
	 * 专辑名称
	 */
	
	private String zhuanjimingcheng;
		
	/**
	 * 发行方
	 */
	
	private String faxingfang;
		
	/**
	 * 歌手
	 */
	
	private String geshou;
		
	/**
	 * 播放时长
	 */
	
	private String bofangshizhang;
		
	/**
	 * 音频
	 */
	
	private String yinpin;
		
	/**
	 * 歌词
	 */
	
	private String geci;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：歌曲分类
	 */
	 
	public void setGequfenlei(String gequfenlei) {
		this.gequfenlei = gequfenlei;
	}
	
	/**
	 * 获取：歌曲分类
	 */
	public String getGequfenlei() {
		return gequfenlei;
	}
				
	
	/**
	 * 设置：专辑名称
	 */
	 
	public void setZhuanjimingcheng(String zhuanjimingcheng) {
		this.zhuanjimingcheng = zhuanjimingcheng;
	}
	
	/**
	 * 获取：专辑名称
	 */
	public String getZhuanjimingcheng() {
		return zhuanjimingcheng;
	}
				
	
	/**
	 * 设置：发行方
	 */
	 
	public void setFaxingfang(String faxingfang) {
		this.faxingfang = faxingfang;
	}
	
	/**
	 * 获取：发行方
	 */
	public String getFaxingfang() {
		return faxingfang;
	}
				
	
	/**
	 * 设置：歌手
	 */
	 
	public void setGeshou(String geshou) {
		this.geshou = geshou;
	}
	
	/**
	 * 获取：歌手
	 */
	public String getGeshou() {
		return geshou;
	}
				
	
	/**
	 * 设置：播放时长
	 */
	 
	public void setBofangshizhang(String bofangshizhang) {
		this.bofangshizhang = bofangshizhang;
	}
	
	/**
	 * 获取：播放时长
	 */
	public String getBofangshizhang() {
		return bofangshizhang;
	}
				
	
	/**
	 * 设置：音频
	 */
	 
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
				
	
	/**
	 * 设置：歌词
	 */
	 
	public void setGeci(String geci) {
		this.geci = geci;
	}
	
	/**
	 * 获取：歌词
	 */
	public String getGeci() {
		return geci;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
