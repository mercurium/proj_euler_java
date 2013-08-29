
public class prob401 {
	
	public static void main(String[] args){
		
		long start = System.nanoTime();

		long mult = (long) Math.pow(10, 15);
		long size = (long) Math.pow(10, 9);
		long sum = 0;
		
		for(long i = 1; i <= size; i++){
			long a = (((mult/i) *i)%size * i)%size;
			if (a < 0){
				System.out.println(i + " " + a);
				break;
			}	
			sum += a;
		}
		
		System.out.println(sum%size);
		long end = System.nanoTime() - start;
		System.out.println("Time Taken :" + (end/(1000 * 1000*1000.)) + " seconds" );
		
	}
}

/*
Answer found: 747246560
Time Taken :34.664703084 seconds
*/