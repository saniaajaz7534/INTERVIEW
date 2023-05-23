package com.example.demo.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.convert.MongoTypeMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.JobDAL;
import com.example.demo.model.SubJobs;
import com.example.demo.model.Jobs;


@Repository
public class JobDalImp implements JobDAL {
    private final MongoTemplate mongoTemplate;
    @Autowired
    public JobDalImp(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
    
	@Override
	public List<Jobs> getJobs() {
		
		List<Jobs> job =new ArrayList<>();
    	 List<Jobs> jobs = mongoTemplate.findAll(Jobs.class);
    	 
			
			
			  for(Jobs j:jobs) {
			  
			 
			  Jobs jb=new Jobs();
			  jb.set_id(j.get_id());
			  jb.setDescription(j.getDescription());
			  List<SubJobs> sb1 =new ArrayList<>();
			  
			  System.out.println(jb.get_id()+" "+jb.getSbj());
			  for(SubJobs s:jb.getSbj()) {
				  System.out.println("Bye");
				  System.out.println(s.get_id() +" " +s.getCreatedDate() +" " +s.getName());
				  SubJobs sb2 =new SubJobs();  
			  
			  sb2.set_id(s.get_id()); 
			  sb2.setCreatedDate(s.getCreatedDate());
			 sb2.setName(s.getName()); 
			 sb1.add(sb2);
			  
			  
			  
			  }
			  
			  jb.setSbj(sb1);
			  
			  job.add(jb); }
			 
			 
    	 return job;
    	
	}
	
	
	public void postSubJobss(SubJobs sbj) {
		
		mongoTemplate.save(sbj);
	}

	public List<SubJobs> getSubJobs() {
		
		return mongoTemplate.findAll(SubJobs.class);
	}

	public void postJobss(Jobs j) {
		mongoTemplate.save(j);
		
		
	}

	
}
