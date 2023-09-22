package com.infy.service;

import java.util.List;

import com.infy.entity.InfosysEntitys;
import com.infy.model.InfosysModel;

public interface InfosysService {

	public String upSert(InfosysModel model);
	
	public InfosysEntitys latestRecords();
	
	

}
