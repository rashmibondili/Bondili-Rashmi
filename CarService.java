package com.saipent.asde.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarService {
	private List<Car> cars;
	
	

	public CarService(List<Car> cars) {
		
		this.cars = cars;
	}
	
	public double getSumOfPrices() {
		return cars.stream()
				   .mapToDouble(Car::getPrice)
				   .sum();
		
	}
	public List<String> getCarNames() {
		return cars.stream()
				   .map(Car::getName)
				   .collect(Collectors.toList());
	}
	public List<String> getCarMakers() {
		
		return cars.stream()
				   .map(Car::getMaker)
				   .collect(Collectors.toList());
	}
	public Optional<Car> getHighestPricedCar() {
		
		       return cars.stream()
				          .max((car1, car2)-> Double.compare(car1.getPrice(), car2.getPrice()));
	}
	
	public Optional<Car> getLowestPricedCar() {
		
	       return cars.stream()
			          .min((car1, car2)-> Double.compare(car1.getPrice(), car2.getPrice()));
}
	
}
