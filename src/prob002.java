public class prob002 {
	public static void main(String[] args){
		int sum = 0;
		int a =1, b=1, temp = 0;
		while (a < 4000000){
			temp = a;
			a = a+b;
			b = temp;
			if (a%2 == 0){
				sum+= a;
			}
		}
		System.out.println(sum);
	}
}
