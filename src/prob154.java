public class prob154 {
	
	public static int fiver(int n){
		int sumz = 0;
		while (n > 0){
			n /= 5;
			sumz += n;
		}
		return sumz;
	}
	
	public static int twoer(int n){
		int sumz = 0;
		while (n > 0){
			n /= 2;
			sumz += n;
		}
		return sumz;
	}
	public static void main(String args[]){
		long start = System.nanoTime();
		int SIZE = 200000;
		int five_pow = fiver(SIZE) - 12;
		int two_pow = twoer(SIZE) - 12;
		
		int[] twos = new int[SIZE+1], fives = new int[SIZE+1];
		for (int i = 0; i <= SIZE; i++){
			twos[i] = twoer(i);
			fives[i] = fiver(i);
		}
		
		long count = 0;
		for (int x = 0; x <= SIZE/3; x++){
			for (int y = x+1; x+y <= SIZE; y++){
				int z = SIZE - x - y;
				if (z <= y)
					break;
				if( (fives[x] + fives[y] + fives[z] <= five_pow)  && (twos[x] + twos[y] + twos[z] <= two_pow) ){
					count +=6;
				}
			}
			
			if (x % 1024 == 0)
				System.out.println(x);
		}
		for (int x = 0; x <= SIZE/2; x++){
			int z = SIZE - 2 * x;
			if (fives[x] * 2 + fives[z] <= five_pow && twos[x] * 2 + twos[z] <= two_pow )
				count += 3;
		}
		
		System.out.println("The answer is:" + count);
		System.out.println("Time taken: " + (System.nanoTime() - start)/1000000000.);
	
	}

}
