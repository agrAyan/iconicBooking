package com.iconicsbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iconicsbooking.model.Availability;
import com.iconicsbooking.model.Workers;
import com.iconicsbooking.service.IWorkerService;

@SpringBootApplication
public class AllocationMicroservice1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AllocationMicroservice1Application.class, args);
	}
	
	@Autowired
	IWorkerService workerService;
	
	
	@Override
	public void run(String... args) throws Exception {
		Availability available= Availability.valueOf("AVAILABLE");
		Workers worker= new Workers("Ayush","7991237314",available, "CHEF");
//		Workers worker1= new Workers("Ayan","9340575529","Available");
//		Workers worker2= new Workers("Suman","9500630153","Available");
//		Workers worker3= new Workers("Prasanna","6383880543","Available");
		workerService.addWorker(worker);
//		workerService.addWorker(worker1);
//		workerService.addWorker(worker2);
//		workerService.addWorker(worker3);
//		LocalDate startDate= LocalDate.of(2021, 10, 4);
//		LocalDate endDate= LocalDate.of(2021, 10, 4);
//		
//		TaskService task= new TaskService("Cattering","Naresh",4.5,startDate,endDate, 0,"Available");
//		TaskService task1= new TaskService("Cattering","Febina",4.8,startDate,endDate, 0,"Available");
//		
//		TaskService task2= new TaskService("Decoration","Raheem",4.6,startDate,endDate, 0,"Available");
//		TaskService task3= new TaskService("Music","Febina",4.9,startDate,endDate, 0,"Available");
//		taskService.addTask(task);
//		taskService.addTask(task2);
//		taskService.addTask(task3);
//		taskService.addTask(task1);
		
		//Events openCeremony= new Events("Open Ceremony","Vivek",startDate, endDate,"Available",25000);
		//openCeremonyService.addOpenCeremony(openCeremony);
	}

}
