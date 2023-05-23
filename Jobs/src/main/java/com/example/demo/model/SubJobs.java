package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection ="SubJobs")
public class SubJobs {
	
	
	@Id
	private String _id;
	private String name;
	private String  createdDate;
	
	@DBRef
    public Jobs job;
	
	

	public SubJobs() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SubJobs(String _id, String name, String createdDate, Jobs job) {
		super();
		this._id = _id;
		this.name = name;
		this.createdDate = createdDate;
		this.job = job;
	}



	public String get_id() {
		return _id;
	}



	public void set_id(String _id) {
		this._id = _id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}



	public Jobs getJob() {
		return job;
	}



	public void setJob(Jobs job) {
		this.job = job;
	}



	@Override
	public String toString() {
		return "SubJobs [_id=" + _id + ", name=" + name + ", createdDate=" + createdDate + ", job=" + job + "]";
	}

	
	

}
