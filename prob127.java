
public class prob127 {

	
	static int size = 120000;
	static long[] rad_lst = new long[size+1];
	
	
	public static long gcd(long a, long b){
		if (a== 0)
			return b;
		return gcd(b%a,a);
	}
	
	public static boolean rad_fail(int n){
		if (rad_lst[n] * 6 > n)
			return true;
		if (rad_lst[n] % 2== 0 && rad_lst[n] * 15 > n){
			return true;
		}
		if (rad_lst[n] % 3== 0 && rad_lst[n] * 10 > n){
			return true;
		}
		if (rad_lst[n] % 6== 0 && rad_lst[n] * 35 > n){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		
		long start = System.nanoTime();
		int count = 0;
		int sumz = 0;
		
		for (int i = 0; i <= size; i++)
			rad_lst[i] = 1;
		
		for (int i = 2; i <= size; i++){ //setting up the radicals list
			if (rad_lst[i] == 1){
				for (int j = i; j <= size; j+= i)
					rad_lst[j] *= i; }}

		for (int c = 2; c < size; c++){
			if (rad_fail(c)){
				int b = c -1;
				if (rad_lst[b] * rad_lst[c] < c){
					System.out.println(c-b + " "+ b + " " + c);
					count +=1;
					sumz += c;
				}
			}
			else{
				int diff = -1;
				if (c%2 == 0) diff = -2;
				
				for (int b = c-1; b > c/2; b+= diff){
					if(!(rad_lst[b] == b) && gcd(rad_lst[b],rad_lst[c]) == 1){
						if(rad_lst[c] * rad_lst[b] * rad_lst[c-b] < c){
							System.out.println(c-b + " "+ b + " " + c);
							count +=1;
							sumz += c;
						}
					}
				}
			}
		}
		
		long end = System.nanoTime() - start;
		
		System.out.println(" ");
		System.out.println(count);
		System.out.println(sumz);
		System.out.println("Time Taken :" + (end/(1000 * 1000*1000.)) + " seconds" );
	}
}
