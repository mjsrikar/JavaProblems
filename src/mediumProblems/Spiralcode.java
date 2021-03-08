package mediumProblems;

import java.util.ArrayList;
import java.util.List;

public class Spiralcode {
public List<Integer> spiral(int[][] a){
	List<Integer> res= new ArrayList<>();
	int rowbeging=0;
	int rowending=a.length-1;
	int columnbeg=0;
	int columnend=a[0].length-1;
	
	while(rowbeging>=rowending && columnbeg>=columnend) {
		for(int i=columnbeg;i<=columnend;i++) {
			res.add(a[rowbeging][i]);
		}
		rowbeging++;
		for(int i=rowbeging;i<=rowending;i++) {
			res.add(a[i][columnend]);
		}
		columnend--;
		if(rowbeging<=rowending) {
			
		}
		
	}
	
return res;
}
}
