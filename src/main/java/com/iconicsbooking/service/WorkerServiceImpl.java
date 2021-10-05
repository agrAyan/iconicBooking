package com.iconicsbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iconicsbooking.exception.WorkerNotFoundException;
import com.iconicsbooking.model.Workers;
import com.iconicsbooking.repository.IWorkersRepository;
@Service
public class WorkerServiceImpl implements IWorkerService {

	@Autowired
	IWorkersRepository workerRepository;
	
	
	//Save the Worker Details
	@Override
	public Workers addWorker(Workers worker) {
		// TODO Auto-generated method stub
		Workers workerSave= workerRepository.save(worker);
		if(workerSave== null)
			throw new WorkerNotFoundException("cannot added");
		return workerSave;
	}

	@Override
	public Workers updateWorker(Workers worker) {
		Workers workerUpdate= workerRepository.save(worker);
		if(workerUpdate== null)
			throw new WorkerNotFoundException("cannot updated");
		return workerUpdate;
	}

	@Override
	public Workers getByWorkerId(int workerId) {
		Workers workerById= workerRepository.findById(workerId).get();
		if(workerById== null)
			throw new WorkerNotFoundException("No Id Found");
		return workerById;
	}

	@Override
	public List<Workers> getAllWorkers() {
		List<Workers> allWorkers= workerRepository.findAll();
		if(allWorkers.isEmpty()) 
			throw new WorkerNotFoundException("no worker Found");
		return allWorkers;
	}

	@Override
	public String deleteWorker(int workerId) {
		 workerRepository.deleteById(workerId);
		 return "deleted successfully";
	}

}
