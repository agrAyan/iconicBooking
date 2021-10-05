package com.iconicsbooking.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iconicsbooking.model.Workers;

@Repository
public interface IWorkersRepository extends JpaRepository<Workers, Integer> {

	List<Workers> findByWorkerStatus(String status);
//	List<Workers> find
}
