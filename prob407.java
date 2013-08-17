
public class prob407 {

	static int size = 10000000;
	static int[] pfactor = new int[size+1];
	
	public static long calc(int n){
		long a;
		if (pfactor[n] == n){ return 1;}
		for(long i = n-pfactor[n]; i > n/2-1; i -= pfactor[n]){
			a = i*i;
			if ((a+i)%n == 0) return i+1;
			if ((a-i)%n == 0) return i;
		}
		return 1;
	}
	
	public static void main(String[] args){
		long start = System.nanoTime();
		
		for (int i = 0; i < pfactor.length; i++) pfactor[i] = i;
		for(int i = 2; i < pfactor.length; i++){
			if (pfactor[i] == i){
				for (int j = 2*i; j < pfactor.length; j+=i)
					pfactor[j] = i;
			}
		}
		
		long sum = 1;
		long val;
		for(int i = 2; i < size+1; i++){
			val = calc(i);
			sum += val;
			
			if(i%1024 == 0) System.out.println(i + " " + val);
		}
		
		
		
		System.out.println("");
		System.out.println(sum);
		
		long end = System.nanoTime() - start;
		System.out.println("Time Taken: " + (end/(1000 * 1000*1000.)) + " seconds" );
		
	}
}
