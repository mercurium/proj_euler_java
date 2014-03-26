public class prob020 {
	
	/* Since we may be dealing with large numbers, we'll keep them in an array
	 *  to avoid the problem of number limits.
	 */
	public static int[] multiply(int[] items, int multiplier){
		
		for (int i = 0; i < items.length; i++){
			items[i] *= multiplier;
		}
		
		for (int i = 0; i < items.length-1; i++){
			items[i+1] += items[i]/10;
			items[i] = items[i]%10;
		}
		return items;
	}
	public static int[] factorial(int n){
		int size = 0;
		for(int i = 2; i <= n; i++){
			size += Math.log(i);
		}
		int[] items = new int[size];
		items[0] = 1;
		for (int i = 2; i <= n; i++)
			multiply(items,i);
		
		return items;
		
	}
	
	
	public static void main(String[] args){
		int[] items = factorial(100);
		int sum = 0;
		for (int i = 0; i < items.length; i++){
			sum+= items[i];
		}
		System.out.println(sum);
	}
}
