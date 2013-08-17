
public class prob193 {
	
	
	
	public static long pow(int n, int pow){
		if (pow == 0)
			return 1;
		long temp = n;
		long ans = 1;
		while (pow > 0){
			if (pow%2 == 1){
				ans *= temp;
			}
			temp *= temp;
			pow /= 2;
		}
		return ans;
	}
	
	public static void main(String[] args){
		long start = System.nanoTime();
		int size = (int)pow(2,25);
		long total = pow(size,2);
		
		byte[] arr = new byte[size+1];
		long sumz = 0;
		
		for (int i = 2; i <= size; i++){
			if (arr[i] == -1){
				continue;
			}
			long a = ((long)i)*i;
			if (arr[i] == 0){
				for (int j = 2*i; j <= size; j+=i){
					if (arr[j] != -1){
						arr[j] +=1;
					}
				}
				sumz += total/a;
			}
			else if(arr[i] == 1){
				for (int j = 2*i; j <= size; j+=i){
					arr[j] = -1;
				}
			}
			else if(arr[i]%2 == 1){
				sumz += total/a;
			}
			else{
				sumz -= total/a;
			}
			
		}
		System.out.println("Number squarefree is:" + (total - sumz));
		System.out.println("Time Taken: "+ (System.nanoTime() - start)/1000000000.);
	}
}
