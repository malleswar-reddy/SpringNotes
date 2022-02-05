package com.main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.main.constructordi.Transmission;
import com.main.dao.SqlMapAccountDao;
import com.main.dao.SqlMapItemDao;
import com.main.services.PetStoreServiceImpl;
import com.main.setterbaseed.TransmissionSetter;

@Configuration
public class AppConfiguration {

	@Bean(name = "sqlMapAccountDao")
	public SqlMapAccountDao sqlMapAccountDao() {
		return new SqlMapAccountDao();
	}

	@Bean(name = "sqlMapItemDao")
	public SqlMapItemDao sqlMapItemDao() {
		return new SqlMapItemDao();
	}

	@Bean(name = "petStoreServiceImpl")
	public PetStoreServiceImpl petStoreServiceImpl() {
		return new PetStoreServiceImpl();
	}
	
	
	@Bean(name = "transmission")
	public Transmission transmission() {
		return new Transmission("Contrtucter");
	}

	
	@Bean(name = "transmissionSetter")
	public TransmissionSetter transmissionSetter() {
		TransmissionSetter transmissionSetter= new TransmissionSetter();
		transmissionSetter.setItem("Seeter");
		return transmissionSetter;
	}	

}
