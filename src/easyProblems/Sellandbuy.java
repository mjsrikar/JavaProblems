package easyProblems;

public class Sellandbuy {
        
	 public int maxProfit(int[] prices) {
	   int minval=Integer.MAX_VALUE;
	   int maxprofit=0;
	   for(int i=0;i<prices.length;i++) {
		   if(prices[i]<minval) {
			   minval=prices[i];
		   }else if(prices[i]-minval>maxprofit) {
			   maxprofit=prices[i]-minval;
		   }
	   }
	   return maxprofit;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] prices= {7,1,5,3,6,4};
		int[] prices= {7,6,4,3,1};
		Sellandbuy s= new Sellandbuy();
		System.out.println(s.maxProfit(prices));
	}

}
