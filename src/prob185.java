
public class prob185 {

	static String[] playerGuess = 
	   {"5616185650518293" ,
		"3847439647293047" ,
		"5855462940810587" ,
		"9742855507068353" ,
		"4296849643607543" ,
		"3174248439465858" ,
		"4513559094146117" ,
		"7890971548908067" ,
		"8157356344118483" ,
		"2615250744386899" ,
		"8690095851526254" ,
		"6375711915077050" ,
		"6913859173121360" ,
		"6442889055042768" ,
		"2321386104303845" ,
		"2326509471271448" ,
		"5251583379644322" ,
		"1748270476758276" ,
		"4895722652190306" ,
		"3041631117224635" ,
		"1841236454324589" ,
		"2659862637316867" };
	static int[] numCorrect = {2, 1, 3, 3, 3, 1, 2, 3, 1, 2, 3, 1, 1, 2, 0, 2, 2, 3, 1, 3, 3, 2};
	/**
	 * @param level: the level of depth of recursion that we're at. Start at 0, quit at 15
	 * @param correctInput: the number of digits that match the user's guess at the moment.
	 * @param currentGuess: the sequence of digits that were guessed by the user thus far.
	 * @return nothing, we'll print out what we need.
	 */
	public static void checker(int level, int[] correctInput, int[] currentGuess){
		
		//We only have a 16 digit number, so we don't want to go beyond that.
		if (level > 15){
			return;
		}
		else if (level == 15){
			for (int i = 0; i < correctInput.length; i++){
				
				
			}
		}
		//else we do the non base case:
		
		
		
		return;
	}
	
	
	
	
	public static void main(String[] args){
		long startTime = System.nanoTime();
		checker(0,numCorrect,new int[0]);
		
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration);
	}
}
