
public class VariablesAndNames {
	public static void main(String[] args) {
		// declaring integer variable names
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		// declaring double variable names
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		// 100 is the value given to variable 'cars'
		cars = 100;
		// 4.0 is the value given to 'space_in_a_car'
		space_in_a_car = 4.0;
		// 30 is the value given to 'drivers'
		drivers = 30;
		// 90 is the value given to passengers
		passengers = 90;
		// 'cars_not_driven'(70) = the amount of cars(100) minus the number of drivers(30)
		cars_not_driven = cars - drivers;
		// 'cars_driven'(30) = 'drivers'(30)
		cars_driven = drivers;
		
		// 'carpool_capacity'(120.0) = 'cars_driven'(30) * 'space_in_a_car'(4.0)
		carpool_capacity = cars_driven * space_in_a_car;
		// 'average_passengers_per_car'(3.0) = 'passengers'(90) / 'cars_driven'(30)
		average_passengers_per_car = passengers / cars_driven;

		// print statement: There are 100 cars available.
		System.out.println("There are " + cars + " cars available.");
		//There are only 30 drivers available.
		System.out.println("There are only " + drivers + " drivers available.");
		// There will be 70 empty cars today.
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		// We can transport 120 people today.
		System.out.println("We can transport " + carpool_capacity + " people today.");
		// We have 90 passengers to carpool today.
		System.out.println("We have " + passengers + " to carpool today.");
		// We need to put about 3 in each car.
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");

	}

}
