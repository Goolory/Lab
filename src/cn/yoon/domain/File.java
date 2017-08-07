package cn.yoon.domain;

import java.sql.Date;

public class File {
	private String id;
	private String user_id;//上传人
	private String path;//路径
	private String type; //实验报告--1；共享文件：--2;实验内容附件--3
	private String experiment_id; //实验id
	private Date upload_date;//上传时间
	
	public String getExperiment_id() {
		return experiment_id;
	}
	public void setExperiment_id(String experiment_id) {
		this.experiment_id = experiment_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}
	

}
