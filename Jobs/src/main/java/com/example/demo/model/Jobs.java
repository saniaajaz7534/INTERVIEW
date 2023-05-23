package com.example.demo.model;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.List;

//import com.example.demo.SubJobs;
import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="jobList")
public class Jobs {
	
	
	@Id
	private String _id;
	private String description;


	
	
	@DBRef
	private Collection<SubJobs> sbj = new ArrayList<>();

	


	public Jobs(String  _id, String description, Collection<SubJobs> sbj) {
		super();
		this. _id =  _id;
		this.description = description;
		this.sbj = sbj;
	}




	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String get_id() {
		return _id;
	}




	public void set_id(String _id) {
		this._id = _id;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Collection<SubJobs> getSbj() {
		return sbj;
	}




	public void setSbj(Collection<SubJobs> sbj) {
		this.sbj = sbj;
	}




	@Override
	public String toString() {
		return "Jobs [_id=" + _id + ", description=" + description + ", sbj=" + sbj + "]";
	}



	
	
	
	
	
}
