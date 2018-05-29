package edu.albany.hw2.car;

/*
 * Odometer stores the current mileage, a FuelGuage, and MilesPerGallon of the car
 * As the odometer is increased the FuelGuage decreases when a gallon is used
 */
public class Odometer {

	private int currentMileage;
	private FuelGuage fuelGuage;
	private int mpgCounter;			//counter to tell when a gallon has been used
	private int mpg;
	
	//Constructor that sets currentMileage, creates a FuelGuage with the given fuel, and mpg of the car
	public Odometer(int currentMileage, int currentFuel, int mpg) {
		if(currentMileage > 0 && currentMileage < 1000000)
			this.currentMileage = currentMileage;
		fuelGuage = new FuelGuage(currentFuel);
		this.mpg = mpg;
		mpgCounter = mpg;
	}
	
	//Accessor for currentMileage
	public int getCurrentMileage() {
		return currentMileage;
	}
	
	//Accessor for currentFuel
	public int getCurrentFuel() {
		return fuelGuage.getCurrentFuel();
	}
	
	//increases the currentMileage if there is fuel and resets the mileage if 
	//it exceeds the limit. Also decreases the fuelGuage if a gallon was used
	public void incrementCurrentMileage() {
		if(fuelGuage.getCurrentFuel() == 0) {
			System.out.println("Car cannot move, out of fuel");
		} else {
			if(currentMileage == 999999) {
				currentMileage = 0;
			} else {
				currentMileage++;
			}
			mpgCounter--;
			//if mpg counter is at 0 decrease fuelGuage and reset counter
			if(mpgCounter == 0) {
				fuelGuage.decreaseFuel();
				mpgCounter = mpg;
			}
		}
	}
	
	//increases fuel
	public void incrementFuel() {
		fuelGuage.increaseFuel();
	}
	
	//decreases fuel
	public void decrementFuel() {
		fuelGuage.decreaseFuel();
	}
	//method to neatly print odometer reading and fuelGuage reading
	public void printFuelAndMileage() {
		System.out.println("Odometer reading: " + this.getCurrentMileage() + " FuelGuage reading: " +
				this.getCurrentFuel());
	}
}
