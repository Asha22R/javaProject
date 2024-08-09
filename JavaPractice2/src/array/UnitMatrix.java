package array;

public class UnitMatrix {
public static void main(String[] args) {
	int[][] a= {{1,0,0},{0,1,1},{0,0,1}};
	boolean flag = true;
	for (int i = 0; i <3; i++) {
		for (int j = 0; j <3; j++) {
			if(i==j&&a[i][j]!=1) {
				flag=false;
			} else if(i!=j&&a[i][j]!=0) {
				flag=false;
			}
		}
	}
	if(flag) {
		System.out.println("Unit matrix");
	}
	else {
		System.out.println("Not Unit matrix");
	}
}
}
