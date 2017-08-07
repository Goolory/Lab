package cn.yoon.domain;

import java.util.Date;

public class Courses {
	private String id;
	private String user_id;
	private Integer score;
	private String experiment_id;
	private Date upload_date;
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
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getExperiment_id() {
		return experiment_id;
	}
	public void setExperiment_id(String experiment_id) {
		this.experiment_id = experiment_id;
	}
	public Date getUpload_date() {
		return upload_date;
	}
	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}
	

}
