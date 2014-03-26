import java.util.*;

public class prob031 {
	
	static HashMap visited = new HashMap(1000);
	static int[] coinVals = {200,100,50,20,10,5,2,1};
	public static class tuple{
		int pos,val;
		public tuple(int pos,int val){
			this.pos = pos;
			this.val = val;
		}
		
	}
	
	public static int coinPos(int position, int value){
		tuple posVal = new tuple(position, value);
		//If we've already seen it, just return that.
		if (visited.containsKey(posVal ) ){
			return (Integer) visited.get(posVal);
		}
		if (position >= coinVals.length){
			return 0;
		}
		if (value < 0){
			return 0;
		}
		if (value == 0){
			return 1;
		}
		
		int val = coinPos(position+1,value)
				+coinPos(position,value-coinVals[position]);
		visited.put(posVal, val);
		return val;
				
	
	}
	
	public static void main(String[] args){
		
		int answer = coinPos(0,200);
		System.out.println(answer);
	}
}
