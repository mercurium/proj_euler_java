package first_50_problems;

public class prob010 {

	public static void main(String[] args) {
        long sum = 0;
        byte[] values = new byte[2000001];
        for (int i = 2; i < values.length; i++){
        	if (values[i]==0){
        		sum+= i;
        		for (int j = 2*i; j < values.length; j+=i)
        		{
        			values[j] = 1;
        		}
        	}
        }	
        System.out.println(sum);
    }
}
