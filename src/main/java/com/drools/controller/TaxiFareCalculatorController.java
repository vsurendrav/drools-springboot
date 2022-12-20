package com.drools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drools.facts.TaxiRide;
import com.drools.model.Fare;
import com.drools.service.TaxiFareCalculatorService;

@RestController
@RequestMapping("/api/taxifare")
public class TaxiFareCalculatorController {
	
	@Autowired
	TaxiFareCalculatorService taxiFareCalculatorService;
	
	@PostMapping("/compute")
	public Long computeTaxiFare(@RequestBody TaxiRide taxiRide) {
		return taxiFareCalculatorService.calculateFare(taxiRide, new Fare());
	}
	
	@GetMapping("/test")
	public Long getLong() {
		//return taxiFareCalculatorService.calculateFare(taxiRide, new Fare());
		return 100L;
	}
}
