package com.xiaomingming.api.vo.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseHiHistroy<M extends BaseHiHistroy<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setHiInfo(java.lang.String hiInfo) {
		set("hi_info", hiInfo);
	}
	
	public java.lang.String getHiInfo() {
		return getStr("hi_info");
	}

	public void setHiTime(java.lang.Integer hiTime) {
		set("hi_time", hiTime);
	}
	
	public java.lang.Integer getHiTime() {
		return getInt("hi_time");
	}

	public void setInId(java.lang.Integer inId) {
		set("in_id", inId);
	}
	
	public java.lang.Integer getInId() {
		return getInt("in_id");
	}

	public void setPrId(java.lang.Integer prId) {
		set("pr_id", prId);
	}
	
	public java.lang.Integer getPrId() {
		return getInt("pr_id");
	}

}
