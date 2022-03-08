package day18.MyOwnAutoShop;

/**
 * Creating a subclass of Car class and name it as Truck. The Truck class has
 * the following fields and methods
 *
 */
public class Truck extends Car {
	int weight;
	double salePrice;

	/**
	 * Creating a parameterized constructor of the subclass of the Car name Sedan
	 * which has name same as the class with no return type
	 * 
	 * @param speed -passing the speed of the car value
	 * @param regularPrice -passing the regularPrice of the car
	 * @param color -color of the truck
	 * @param length -length of the truck
	 * @param weight -weight of the truck
	 */
	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	@Override
	/**
	 * creating a method getSalePrice() to get the SalePrice amount
	 * 
	 * @return -return to the getSalePrice method from where we called
	 */
	double getSalePrice() {
		System.out.println("For Truck :");

		/**
		 * checking the condition if weight is greater than 2000 then 5% will be the
		 * discount
		 */
		if (weight > 2000) {
			double DiscountPrice = regularPrice * 0.10;// discount=10%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is :" + salePrice);
		} else {
			
			/**
			 * if weight is lesser than 2000 then 20% will be the discount
			 */
			double DiscountPrice = regularPrice * 0.20;// discount=20%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is :" + salePrice);
		}
		return salePrice;
	}

}
