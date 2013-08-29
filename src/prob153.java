import java.lang.Math;
public class prob153 {

	public static int gcd(int a, int b){
		if (a == 0)
			return b;
		return gcd(b%a, a);
	}
	
	public static long real_num(long size){
		long sumz = 0;
		for (int i = 1; i <= size; i++){
			sumz += i * (size/i);
		}
		return sumz;
	}
	
	public static long complex_num(long size){
		long sumz = 0;
		long[] squares = new long[(int)Math.sqrt(size) + 10];
		for (int i = 0; i < squares.length; i++)
			squares[i] = i*i;
		
		for (int i = 1; i < ((int)Math.sqrt(size) + 1); i++){
			long a = squares[i];
			for (int j = i; j < size; j++){
				long b = j*j;
				if (a+b > size){
					break;
				}
				for (int k = 1; k < size+1; k++){
					if (k * (a+b) > size){
						break;
					}
					long c = gcd(i,j);
					if (c != 1){
						continue;
					}
					if (i == j)
						sumz += (2 *i*k) * (size / ( (a + b) * k ) );
					else
						sumz += (2 * (i + j) * k) * (size / ( (a + b) * k ) );
				}
			}
		}
		return sumz;
	}
	static final long SIZE = 1000 * 1000 * 100;
	
	public static void main(String[] args){
		long start = System.nanoTime();
		long ans = real_num(SIZE) + complex_num(SIZE);
		System.out.println("The answer for size " + SIZE + " is: " + ans);
		System.out.println("The time taken was: " + ((System.nanoTime() - start)/1000000000.) + " seconds");
	}
}
