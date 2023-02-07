package com.example.main;

class Vehicle {

	// required parameters
	private String engine;
	private int wheels;

	// optional parameters
	private int airBags;

	private Vehicle(VehicleBuilder vehicleBuilder) {
		this.engine = vehicleBuilder.engine;
		this.wheels = vehicleBuilder.wheels;
		this.airBags = vehicleBuilder.airBags;
	}

	public static class VehicleBuilder {
		private String engine;
		private int wheels;

		private int airBags;

		public VehicleBuilder(String engine, int wheels) {
			this.engine = engine;
			this.wheels = wheels;
		}

		public VehicleBuilder setAirBags(int airBags) {
			this.airBags = airBags;
			return this;
		}

		public Vehicle Build() {
			return new Vehicle(this);
		}
	}

	public int getAirBags() {
		return airBags;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

}

public class BuilderExample {

	public static void main(String[] args) {

		Vehicle car = new Vehicle.VehicleBuilder("RolseRoyse", 4).setAirBags(6).Build();
		Vehicle bike = new Vehicle.VehicleBuilder("Ducati", 2).Build();

		System.out.println("car\n type : " + car.getEngine() + "\r\n no of wheels : " + car.getWheels()
				+ "\r\n no of airbags : " + car.getAirBags());
		System.out.println("bike\n type : " + bike.getEngine() + "\r\n no of wheels : " + bike.getWheels());
	}

}
