package day18.MyOwnAutoShop;

/**
 * Creating a subclass of Car class and name it as Ford. The Ford class has the
 * following fields and methods
 *
 */
public class Ford extends Car {
	int year = 2022;
	int manufacturingDiscount = 100000;
	double salePrice;

	/**
	 * Creating a parameterized constructor of the subclass of the Car name Ford
	 * which has name same as the class with no return type
	 * 
	 * @param speed -passing the speed of the car value
	 * @param regularPrice -passing the regularPrice of the car
	 * @param color -color of the car
	 */
	public Ford(int speed, double regularPrice, String color) {
		super(speed, regularPrice, color);
	}

	@Override
	/**
	 * creating a method getSalePrice() to get the SalePrice amount
	 * 
	 * @return -return to the getSalePrice method from where we called
	 */
	double getSalePrice() {
		System.out.println("For Two Ford's salesprice are :");

		/**
		 * From the sale price computed from Car class,subtracting the manufacturer
		 * Discount.
		 */
		salePrice = regularPrice - manufacturingDiscount;
		System.out.println("saleprice is : " + salePrice);
		return salePrice;
	}

}
