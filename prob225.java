
public class prob225 {
	public static void main(String[] args){
		int n,count,round;
		int[] a = {1,1,3};
		count = 0;
		n = 25;
		round = 1;
		while (round < 124){
			while (a[0] != 1 || a[1] != 1 || a[2] != 1){
				a[count%3] = (a[0] + a[1] + a[2])%n;
				System.out.println(a[count%3] + " " + a[(count+1)%3] + " " + a[(count+2)%3]);
				if (a[count%3] == 0){
					round++;
					System.out.println(n);
					break;
				}
				count++;
			n+=2;
			a[0]=1;
			a[1]=1;
			a[2]=3;
			count = 0;
			}
			
			
		}
		System.out.println(n);
	}
} 
