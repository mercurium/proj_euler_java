
public class prob16 {
	/**
	 * This is an array implementation of multiplication for a large number. Assumes that original number given is within size of array.
	 * Also suffers from int overflow, but we can specify how big we want to make it.
	 * @param digits
	 * @param multiplier
	 * @return
	 */
	public static int[] multiply(int[] digits, int multiplier){
		
		for (int i = 0; i < digits.length; i++){
			digits[i] *= multiplier;
		}
		
		for (int i = 0; i < digits.length-1; i++){
			digits[i+1] += digits[i]/10;
			digits[i] = digits[i]%10;
		}
		return digits;
	}
	
	public static void main(String[] args){
		int size = (int) (1000*(Math.log(10)/Math.log(2))+10);
		int[] number = new int[size];
		int sumOfDig = 0;
		number[0] = 1;
		for(int i = 0; i < 1000; i++){
			multiply(number,2);
		}
		for(int i = 0; i < number.length; i++){
			sumOfDig+= number[i];
		}
		System.out.println(sumOfDig);
	}
}
