package edu.albany.hw2.car;

/*
 * FuelGuage stores the current fuel and can increase and decrease
 * fuel up to the tank capacity
 */
public class FuelGuage {

	private int currentFuel;
	private final int TANKCAPACITY = 15;		//the maximum amount of fuel the tank can hold
	
	//Constructor that sets currentFuel
	public FuelGuage(int currentFuel) {
		if(currentFuel > 0)
			this.currentFuel = currentFuel;
	}
	
	//Accessor for currentFuel
	public int getCurrentFuel() {
		return currentFuel;
	}
	
	//increases currentFuel by 1 if the tank is not already full
	public void increaseFuel() {
		if(currentFuel < TANKCAPACITY) {
			currentFuel++;
		} else {
			System.out.println("Car's gas tank is full");
		}
	}
	
	//decreases currentFuel if the tank is not already empty
	public void decreaseFuel() {
		if(currentFuel > 0) {
			currentFuel--;
		} else {
			System.out.println("Car is out of fuel");
		}
	}
}
