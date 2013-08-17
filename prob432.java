
public class prob432 {

	
	public static void main(String[] args){
		int size = 100;
		long mod = 1000000000;
		
		long[] pfactor = new long[size+2];
		for (int j = 2; j < pfactor.length; j+=2)
			pfactor[j] = 2;
		for (int j = 1; j < pfactor.length; j+=2)
			pfactor[j] = 1;
		pfactor[0] =0;
		
		for (int i = 3; i < pfactor.length; i+=2 ){
			if (pfactor[i] == 1){
				for (int j = i*i; j < size+1; j+=2*i){
					if (pfactor[j] == 1)
						pfactor[j] = 1;
				}
				pfactor[i] = i;
				
			}
		}
		
		long sum = 0;
		long[] prev_seen = new long[size/2+1];
		
		for (int n = 1; n <= size; n++){
			int m = n;
			int temp = 1;
			long prev = 1;
			while (m!= 1){
				if (m <= size/2 && prev_seen[m] != 0){
					if (prev < 18){
						temp *= prev_seen[m];
					}
					else{
						if (m % prev == 0)
							temp *= prev_seen[m] * prev / (prev-1);
						else
							temp *= prev_seen[m];
					}
					m = 1;
				}
				else if (pfactor[m] < 18 || prev == pfactor[m]){
					temp *= pfactor[m];
					m /= pfactor[m];
				}
				else{
					temp *= pfactor[m]-1;
					prev = pfactor[m];
					m /= pfactor[m];
				}
				
			}
			if (n <= size/2)
				prev_seen[n] = temp;
			sum += temp;
		}
		sum = sum% mod;
		System.out.println(sum*92160);
		
		
	}
	
	
	
}
