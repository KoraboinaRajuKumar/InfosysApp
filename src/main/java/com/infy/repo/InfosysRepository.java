package com.infy.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.infy.entity.InfosysEntitys;

public interface InfosysRepository extends JpaRepository<InfosysEntitys, Serializable> {

	@Query(value = "select * from infosys_entitys order by createddate desc limit 1", nativeQuery = true)
	public InfosysEntitys latestRecords();

}
