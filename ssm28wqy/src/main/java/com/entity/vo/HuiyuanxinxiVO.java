package com.entity.vo;

import com.entity.HuiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 会员信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
public class HuiyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 会员卡号
	 */
	
	private String huiyuankahao;
		
	/**
	 * 会员类型
	 */
	
	private String huiyuanleixing;
		
	/**
	 * 会员等级
	 */
	
	private Integer huiyuandengji;
		
	/**
	 * 办理时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date banlishijian;
		
	/**
	 * 到期时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date daoqishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：会员卡号
	 */
	 
	public void setHuiyuankahao(String huiyuankahao) {
		this.huiyuankahao = huiyuankahao;
	}
	
	/**
	 * 获取：会员卡号
	 */
	public String getHuiyuankahao() {
		return huiyuankahao;
	}
				
	
	/**
	 * 设置：会员类型
	 */
	 
	public void setHuiyuanleixing(String huiyuanleixing) {
		this.huiyuanleixing = huiyuanleixing;
	}
	
	/**
	 * 获取：会员类型
	 */
	public String getHuiyuanleixing() {
		return huiyuanleixing;
	}
				
	
	/**
	 * 设置：会员等级
	 */
	 
	public void setHuiyuandengji(Integer huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	
	/**
	 * 获取：会员等级
	 */
	public Integer getHuiyuandengji() {
		return huiyuandengji;
	}
				
	
	/**
	 * 设置：办理时间
	 */
	 
	public void setBanlishijian(Date banlishijian) {
		this.banlishijian = banlishijian;
	}
	
	/**
	 * 获取：办理时间
	 */
	public Date getBanlishijian() {
		return banlishijian;
	}
				
	
	/**
	 * 设置：到期时间
	 */
	 
	public void setDaoqishijian(Date daoqishijian) {
		this.daoqishijian = daoqishijian;
	}
	
	/**
	 * 获取：到期时间
	 */
	public Date getDaoqishijian() {
		return daoqishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
