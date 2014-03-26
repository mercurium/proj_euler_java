public class prob021 {
	
	public static int[] divisorSum(int size){
		
		int[] numberList = new int[size+1];
		
		//This initializes each entry to its value

		for (int i = 1; i < size; i++){
			for(int j = 2*i; j < size; j+= i){
				numberList[j] += i;
			}
		}
		return numberList;
	}
	
	
	public static void main(String[] args){
		int size = 10000;
		int[] numberList = divisorSum(size);
		int sum = 0;
		for (int i = 1; i < size; i++){
			if (numberList[i] < size && numberList[i] != i && numberList[numberList[i]] == i){
				sum+= i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		System.out.println(numberList[220]);
	}
}
