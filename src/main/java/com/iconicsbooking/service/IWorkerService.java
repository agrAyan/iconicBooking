package com.iconicsbooking.service;

import java.util.List;

import com.iconicsbooking.model.Workers;

public interface IWorkerService {

	Workers addWorker(Workers worker);
	Workers updateWorker(Workers worker);
	Workers getByWorkerId(int workerId);
	List<Workers> getAllWorkers();
	String deleteWorker(int workerId);
	
	
	
}
