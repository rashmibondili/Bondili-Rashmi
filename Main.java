package com.saipent.asde.service;

import java.util.Arrays;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		List<Car> carList = Arrays.asList(
				new Car("Model S", "Swift",99000.99),
				new Car("Model R", "Suzuki",89000.99)
				);
		
		CarService carService = new CarService(carList);
		System.out.println("Sum of prices: " + carService.getSumOfPrices());
		System.out.println("Car names: " + carService.getCarNames());
		System.out.println("Car makers: " + carService.getCarMakers());
		
		carService.getHighestPricedCar().ifPresent(Car -> System.out.println("Highest priced car: " + Car.getName() + " - $"+ Car.getPrice()));
		carService.getLowestPricedCar().ifPresent(Car -> System.out.println("Lowest priced car: " + Car.getName() + " - $"+ Car.getPrice()));		

	}

}
