
public class prob28 {
	public static void main(String[] args){
		
		long startTime = System.nanoTime();
		
		int sum = 1;
		for (int i = 1; i <= 500; i++)
			sum += 4*(4*i*i+i+1);
		System.out.println(sum);
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("Time Taken:" + duration);
	}
} 
