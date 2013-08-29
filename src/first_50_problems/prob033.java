package first_50_problems;

public class prob033 {
	public static void main(String[] args){
		for (int a = 1; a< 10; a++){
			for(int b = 0; b < 10; b++){
				for(int c = 0; c < 10; c++){
					if(10*b+c != 0){
						if ((10*a+b) *c == a*(10*b+c)){
							System.out.println(100* a + 10* b + c);
						}
					}
				}
			}
		}
	}
}
