package com.iconicsbooking.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Events {
	
	@Id
	@GeneratedValue(generator = "service_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="service_gen",sequenceName = "service_seq",allocationSize = 1,initialValue = 1)
	private Integer eventId;
	private String eventName;
	private String eventProvider;
	private LocalDate startDate;
	private LocalDate endDate;
	@Enumerated(EnumType.STRING)
	private Availability status;
	private double price;
	@Enumerated(EnumType.STRING)
	private Priority priority;
	@OneToMany
	@JoinColumn(name="event_id")
	private Set<TaskService> taskServiceList; 
	
}
