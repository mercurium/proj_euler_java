
public class prob429 {

	public static int compute(int n, int a)
	{
		int sumz = 0;
		while (n > 0){
			n /= a;
			sumz += n;
		}
		return sumz;
	}
	
	public static long pow(int n, int power, long mod){
		
		if (power == 0)
			return 1;
		long prod = 1;
		long num = n;
		while (power > 0){
			if (power %2 == 1)
				prod = (prod * num)%mod;
			num = (num * num)%mod;
			power /= 2;
		}
		return prod;
	}
	
	public static void main(String[] args)
	{
		long start = System.nanoTime();
		int size = 100000000;
		long mod  = 1000000009;
		
		//sieve portion of the code... :x
		int[] prime_lst = new int[6000000];
		boolean[] prime_test = new boolean[size +1];
		prime_lst[0] = 2;
		int index = 1;
		for (int i = 3; i < size; i +=2){
			if (prime_test[i] == false ){
				if (Math.sqrt(size) > i){
					for (int j = i*i; j < size; j += 2*i)
						prime_test[j] = true;
				}
				prime_lst[index] = i;
				index++;
			}
			
		}
		System.out.println((System.nanoTime() - start)/1000000000.);
		System.out.println(index);
		
		
		
		long prod = 1;
		for (int i = index-1; i >= 0; i--){
			int prime = prime_lst[i];
			prod *= (pow(prime, compute(size,prime)*2,mod)+1);
			prod %= mod;
		}
		System.out.println(prod);
		System.out.println((System.nanoTime() - start)/1000000000.);
		
	}
}