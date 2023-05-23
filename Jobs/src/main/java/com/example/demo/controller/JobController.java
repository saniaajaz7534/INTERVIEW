package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SubJobs;
import com.example.demo.model.Jobs;
import com.example.demo.repository.JobDalImp;
//import com.example.demo.service.JobService;

@RestController
public class JobController {
	 @Autowired private JobDalImp jobimp;
	
	//JobService service;
	@PostMapping("/postsubjobs")
	public void postSubJobs(@RequestBody SubJobs sbj)
	{
		jobimp.postSubJobss(sbj);
	}
	@GetMapping("/getsubjobs")
	
	public List<SubJobs> getSubJob()
	{
		List<SubJobs> j=jobimp.getSubJobs();
		return j;
	}
	
	@GetMapping("/getJobs")
	
	public ResponseEntity<List<Jobs>>  getJob()
	{
		
		List<Jobs> j=jobimp.getJobs();
	
		return new ResponseEntity<>(j,HttpStatus.OK);
	}
	@PostMapping("/postjobs")
	public void postJobs(@RequestBody Jobs j)
	{
		jobimp.postJobss(j);
	}
	
	
	
	

}
