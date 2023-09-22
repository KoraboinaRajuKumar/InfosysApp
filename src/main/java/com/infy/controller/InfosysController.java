package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.InfosysEntitys;
import com.infy.model.InfosysModel;
import com.infy.service.InfosysService;

@RestController
@RequestMapping("api/v1")
public class InfosysController {

	@Autowired
	private InfosysService service;
	
	
	@GetMapping("/")
	public String msg() {
		return "Hello infosys Apllication";
	}

	@PostMapping("/register")
	public ResponseEntity<String> Save(@RequestBody InfosysModel model) {

		String status = service.upSert(model);

		return new ResponseEntity<String>(status, HttpStatus.CREATED);
	}

	@GetMapping("/latest")
	public InfosysEntitys getLatest() {
		InfosysEntitys latestRecords = service.latestRecords();
		return latestRecords;
	}

}
