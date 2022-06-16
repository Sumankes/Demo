import java.util.Scanner;

public class SumTwoMat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows and column");
		int row=sc.nextInt();
		int cols=sc.nextInt();
		int mat1[][]=new int[row][cols];
		int mat2[][]=new int[row][cols];
		int mat3[][]=new int[mat1.length][mat1[0].length];
		System.out.println("enter 1st matrix elements");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter 2nd matrix elements");
		for(int i=0;i<mat2.length;i++)
		{
			for(int j=0;j<mat2[i].length;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<mat3.length;i++)
		{
			for(int j=0;j<mat3[i].length;j++)
			{
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			System.out.print(mat3[i][j]+" ");
		}
	  }
	}

}
