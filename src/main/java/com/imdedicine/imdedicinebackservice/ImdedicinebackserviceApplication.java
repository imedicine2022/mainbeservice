package com.imdedicine.imdedicinebackservice;


import com.imdedicine.imdedicinebackservice.controller.health.Health;
import com.imdedicine.imdedicinebackservice.domain.PrescriptionDrug;
import com.imdedicine.imdedicinebackservice.service.PrescriptionDrug.PrescriptionDrugService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@EnableWebMvc
@SpringBootApplication
@EnableJpaRepositories("com.imdedicine.imdedicinebackservice")
public class ImdedicinebackserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImdedicinebackserviceApplication.class, args);
	}

}
