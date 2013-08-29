
public class prob7 {
	

	public static void main(String[] args) {
        int count = 0;
        byte[] values = new byte[2000001];
        int answer = 0;
        for (int i = 2; i < values.length; i++){
        	if (values[i]==0){
        		count++;
        		if (count == 10001){
        			answer = i;
        			break;
        		}
        		for (int j = 2*i; j < values.length; j+=i)
        		{
        			values[j] = 1;
        		}
        	}
        }	
        System.out.println(answer);
    }
}
