package day18.MyOwnAutoShop;

/**
 * Creating a subclass of Car class and name it as Sedan. The Sedan class has
 * the following fields and methods
 *
 */
public class Sedan extends Car {
	int length;
	double salePrice;

	/**
	 * Creating a parameterized constructor of the subclass of the Car name Sedan
	 * which has name same as the class with no return type
	 * 
	 * @param speed -passing the speed of the car value
	 * @param regularPrice -passing the regularPrice of the car
	 * @param color -color of the car
	 * @param length -length of the car
	 */
	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	@Override

	/**
	 * creating a method getSalePrice() to get the SalePrice amount
	 * 
	 * @return -return to the getSalePrice method from where we called
	 */
	double getSalePrice() {
		System.out.println("For Sedan :");
		
		/**
		 * checking the condition if length is greater than 20 feet the 5% will be the
		 * discount
		 */
		if (length > 20) {
			double DiscountPrice = regularPrice * 0.05; // discount=5%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is : " + salePrice);
		} else {
			/**
			 * if length is lesser than 20 feet then 10% will be the discount
			 */
			double DiscountPrice = regularPrice * 0.10; // discount=10%
			salePrice = regularPrice - DiscountPrice;
			System.out.println("saleprice is : " + salePrice);
		}
		return salePrice;
	}

}
