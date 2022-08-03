
public class Spiral_demo {

	public   static void main(String[] args) {
	int[][] a=new int[4][4];
	int value=0;
	int minrow=0;int maxrow=3;int mincol=0;int maxcol=3;
	while(value<16){
	for(int col=mincol;col<=maxcol;col++) {
			a[mincol][col]=value;
		value++;}
	for(int row=minrow+1;row<=maxrow;row++) {
			a[row][maxrow]=value;
			value++;}
	for(int col=maxcol-1;col>=mincol;col--) {
					a[maxcol][col]=value;
					value++;	}
	for(int row=maxrow-1;row>=minrow+1;row--) {
					a[row][minrow]=value;
					value++;}
		mincol++;maxcol--;	
	    minrow++;maxrow--;}
	
	for(int row=0;row<4;row++) {
		for(int col=0;col<4;col++) {
			System.out.print(a[row][col]  + " \t");}
		System.out.println();}

	}
	}


