package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会员信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-06 21:26:24
 */
@TableName("huiyuanxinxi")
public class HuiyuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyuanxinxiEntity() {
		
	}
	
	public HuiyuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date banlishijian;
	
	/**
	 * 到期时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
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
