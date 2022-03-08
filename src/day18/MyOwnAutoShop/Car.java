package day18.MyOwnAutoShop;

/**
 * Creating a super class called Car. The Car class has the following fields and
 * methods.Here abstract keyword is used because car class is extended to many
 * other subclasses like Ford, Truck, sedan abstraction happens here
 *
 */
abstract class Car {
	int speed;
	double regularPrice;
	String color;

	/**
	 * Create a parameterized constructor of the Car which has name same as the
	 * class with no return type
	 * 
	 * @param speed -passing the speed of the car value
	 * @param regularPrice -passing the regularPrice of the car
	 * @param color -color of the car
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	/**
	 * creating a method getSalePrice() to get the SalePrice amount
	 * 
	 * @return -return to the getSalePrice method from where we called
	 */
	abstract double getSalePrice();

}
