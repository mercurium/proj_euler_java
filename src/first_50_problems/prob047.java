package first_50_problems;

public class prob047 {

	public static int[] primeCount(int n){
		int[] numbers = new int[n+1];
		for (int i = 2; i <= n; i++){
			if (numbers[i] == 0){
				for(int j = i; j <= n; j+=i){
					numbers[j]++;
				}
			}
		}
		
		return numbers;
	}
	
	
	public static void main(String[] args){
		int[] primeC = primeCount(200000);
		for(int i = 0; i < primeC.length - 4; i++){
			if (primeC[i] == 4 && primeC[i+1] == 4 && primeC[i+2] ==4 && primeC[i+3] == 4){
				System.out.println(i);
				break;
			}
		}
		System.out.println("Done");
	}
}
