package edu.albany.hw2.car;

/*
 * Test class for FuelGuage and Odometer
 */
public class CarTest {

	public static void main(String[] args) {
		
		Odometer odometer1 = new Odometer(150000,0,22);
		
		//fill up the tank
		for(int i = 0; i < 16; i++) {
			odometer1.incrementFuel();
			odometer1.printFuelAndMileage();
		}
		
		//run the car until it runs out of fuel and try an extra mile
		for(int i = 0; i < 331; i++) {
			odometer1.incrementCurrentMileage();
			odometer1.printFuelAndMileage();
		}
	}

}
