
public class prob186 {

	public static void main(String[] args){
		
		long start = System.nanoTime();
		
		int size = 1008*3642;
		int[] lst = new int[size+1];
		for (int i = 0; i < lst.length; i++)
			lst[i] = 1;
		
		for(int a = 2; a < lst.length; a+=2)
			lst[a] *=2;
		for(int a = 4; a < lst.length; a+=4)
			lst[a] *=2;
		for(int a = 8; a < lst.length; a+=8)
			lst[a] *=2;
		for(int a = 16; a < lst.length; a+=16)
			lst[a] *=2;
		for(int a = 32; a < lst.length; a+=32)
			lst[a] *=2;
		for(int a = 64; a < lst.length; a+=64)
			lst[a] *=2;
		
		
		for(int a = 3; a < lst.length; a+=3)
			lst[a] *=3;
		for(int a = 9; a < lst.length; a+=9)
			lst[a] *=3;
		for(int a = 27; a < lst.length; a+=27)
			lst[a] *=3;
		
		for(int a = 7; a < lst.length; a+=7)
			lst[a] *=7;
		for(int a = 607; a < lst.length; a+=607)
			lst[a] *=607;
		
		long sum = 0;
		for(int i = 2; i < size; i++){
			if(lst[i] == 1 && lst[i-1] ==2){
				sum+= i;
			}
		}
		
		System.out.println(sum);
		System.out.println("Time Taken: "+ (double)(System.nanoTime()-start)/1000000000);
	}
}
