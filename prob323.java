

public class prob323 {

	public static long ncr(int n, int r){
		if (n < r){
			return 0;
		}
		long prod = 1;
		for(int i = 0; i < r; i++){
			prod *= (n-i);
			prod /= (i+1);
		}
		return prod;
	}
	public static double[] bitwiseVal = new double[33];

	public static void main(String[] args){

	    double sum = 0;
	    for(int i = 1; i<= 32; i++){
	    	for(int j = 0; j <= i; j++){
	    		sum += (1+bitwiseVal[j]) * ncr(i,j);
	    	}
	    	bitwiseVal[i] = sum /(Math.pow(2., i)-1);
	    	sum = 0;
	    }
	    for (int i = 0; i < 33; i++){
	    	System.out.println(bitwiseVal[i]);
	    }
	}
}
