public class Arr2{
	public static void main(String[]args) {
		int mat[][]= {{1},{2,3},{4,5,6},{7,8,9,0},{1,2,3,4,5}};
		System.out.println(mat.length);
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.println(mat[i].length);//It will find length of each arr
				System.out.println(mat[i][j]);
				
			}
		}
	}
}
