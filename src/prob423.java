
public class prob423 {

	public static long[] extended_gcd(long a, long b){
		long[] result = new long[2];
		if (b== 0)
		{
			result[0] = 1;
			result[1] = 0;
			return result;
		}
		long q,r;
		q = a/b;
		r = a%b;
		long[] st = extended_gcd(b,r);
		result[0] = st[1];
		result[1] = st[0] - q*st[1];
		return result;
	}
	
	public static long pow(long n, long power,long mods){
		if (power == 0){
			return 1;
		}
		long prod = 1;
		long term = n;
		while (power > 0){
			if (power % 2 == 1){
				prod = (prod * term) % mods;
			}
			power /=2;
			term = (term * term) % mods;
		}
		
		return prod;
	}
	
	public static void main(String[] args){
		long start = System.nanoTime();
		long size = 50;
		boolean[] primes = new boolean[(int)(size+1)];
		long num_mod = 1000000007;
		primes[0] = true;
		primes[1] = true;
		
		for(int i = 2; i < size; i++){
			if (primes[i] == false)
				for (long j = i*i; j < size && j > 0; j+= i){
					primes[(int)j] = true;
				}
		}
		
		long sumz, count, stored;
		sumz = 0;
		count = 0;
		stored = 1;
		int n = 2;
		for ( ; n <= size; n++){
			if (!primes[n]){
				count ++;
				stored = (stored * (n-1))%num_mod;
				stored = (extended_gcd(count,num_mod)[0] * stored)%num_mod;
			}
			else{
				stored = (stored * (5 * (n-1))%num_mod)%num_mod;
				stored = (extended_gcd(n-count-1,num_mod)[0]*stored)%num_mod;
				if (n== 4){
					stored /= 5;
				}
				sumz = (sumz + stored)%num_mod;
			}
			
			
			
		}
		
		System.out.println((System.nanoTime() - start)/1000000000.);
		long prod = pow(5,n-1,num_mod);
		sumz += prod;
		for (long k = 1; k <= count; k++){
			prod = (prod * (n-k+1))%num_mod;
			prod = (extended_gcd(5*k,num_mod)[0] * prod)%num_mod;
			sumz = (sumz+ prod)%num_mod;
		}
		System.out.println((sumz*6)%num_mod + " is the answer.");
		System.out.println((System.nanoTime() - start)/1000000000.);
		
		
		
	}
}
