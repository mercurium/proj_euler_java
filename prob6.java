
public class prob6 {
	public static void main(String[] args){
		int sumSq = 0;
		int sqSum = 0;
		
		for (int i = 1; i < 101; i++){
			sumSq += i*i;
			sqSum += i;
		}
		sqSum *= sqSum;
		System.out.println(sqSum-sumSq);
	}
}
