
public class prob351 {
	
	
	public static void main(String[] args){
		long start = System.nanoTime();
		int size = 100000000;
		
		byte[] arr = new byte[size+1];
		long sumz = 0;
		for (int i = 2; i <= size; i++){
			if (i > size/2){
				break;
			}
			else if (arr[i] == -1){
				continue;
			}
			
			long a = size/i;
			if (arr[i] == 0){
				for (int j = 2*i; j < size/2; j+=i){
					if (arr[j] != -1){
						arr[j] +=1;
					}
				}
				sumz += a*(a-1)/2;
			}
			else if(arr[i] == 1){
				for (int j = 2*i; j < size/2; j+=i){
					arr[j] = -1;
				}
			}
			else if(arr[i]%2 == 1){
				sumz += a*(a-1)/2;
			}
			else{
				sumz -= a*(a-1)/2;
			}
			
		}
		System.out.println("Sum is: " + (sumz*6 + (size-1) *6));
		System.out.println("Time Taken: "+ (System.nanoTime() - start)/1000000000.);
	}
}
