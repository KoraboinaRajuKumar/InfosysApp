package com.infy.service;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.entity.InfosysEntitys;
import com.infy.entity.InfosysEntitys;
import com.infy.model.InfosysModel;
import com.infy.repo.InfosysRepository;

@Service
public class InfosysServiceImpl implements InfosysService {

	@Autowired
	private InfosysRepository repo;

	@Override
	public String upSert(InfosysModel model) {

		InfosysEntitys entity = new InfosysEntitys();

		BeanUtils.copyProperties(model, entity);

		entity.setCreateddate(LocalDateTime.now());

		InfosysEntitys latestRecords = repo.latestRecords();

		if (latestRecords != null && latestRecords.getName().equals("koraboina")) {

			String infyId = latestRecords.getInfyId();

			String[] split = infyId.split("Infosys");

			int parseInt = Integer.parseInt(split[1]);

			parseInt = parseInt + 1;

			entity.setInfyId("Infosys" + parseInt);

			InfosysEntitys save = repo.save(entity);

			return "Infosys Data Register Successfully";

		} else {
			entity.setInfyId("Infosys101");
			repo.save(entity);
			return "Infosys Data Register First Employee...!";

		}

	}

	/*
	 * 
	 * Sample Normal Code
	 * 
	 * 
	 * 
	 * InfosysEntity entity = new InfosysEntity();
	 * 
	 * BeanUtils.copyProperties(model, entity);
	 * 
	 * entity.setCreateddate(LocalDateTime.now());
	 * 
	 * if (model != null && model.getName().equals("koraboina")) {
	 * 
	 * InfosysEntity save = repo.save(entity);
	 * 
	 * // if (save != null && save.getName().equals("koraboina")) {
	 * 
	 * return "Infosys Registration Success...!"; } return
	 * "Infosys Registration Failed...!"; }
	 * 
	 * 
	 * ===========END========================
	 * 
	 */

	@Override
	public InfosysEntitys latestRecords() {

		InfosysEntitys latestRecords = repo.latestRecords();

		System.out.println("Latest Records:" + latestRecords);

		return latestRecords;
	}

}
