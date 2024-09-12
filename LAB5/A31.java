import java.util.Scanner;

class A31{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
			int row1 = 3;
			int col1 = 2;
            //MATRIX A 
            int arr1[][] = new int[row1][col1];

			System.out.println("Enter elements of 1st matrix:");

		 	//Scanning 1st matrix
		 	for (int i=0; i<row1; i++) {	//Row
		 		for (int j=0; j<col1; j++) {	//Column
		 			arr1[i][j] = sc.nextInt();
		 		}
		 	}
            //Printing 1st matrix
		 	System.out.println("Elements of matrix A:");
		 	for (int i=0; i<row1; i++) {
		 		for (int j=0; j<col1; j++) {
		 			System.out.println( "a[" + i + "][" + j +"] = " + arr1[i][j]);
		 		}
		 	}
		 	//System.out.println();
			int row2 = 2;
			int col2 = 3;

		 	//MATRIX B
		 	int arr2[][] = new int[row2][col2];

			System.out.println("Enter elements of 2nd matrix:");

		 	//Scanning 2nd matrix
		 	for (int i=0; i<row2; i++) {	//Row
		 		for (int j=0; j<col2; j++) {	//Column
		 			arr2[i][j] = sc.nextInt();
		 		}
		 	}

		 	//Printing 2nd matrix
		 	System.out.println("Elements of matrix B:");
		 	for (int i=0; i<row2; i++) {
		 		for (int j=0; j<col2; j++) {
		 			System.out.println( "b[" + i + "][" + j +"] = " + arr2[i][j]);
		 		}
		 	}

			int row3 = 3;
			int col3 = 3;
			
		 	//MUL OF MATRICES
		 	int arr3[][] = new int[row3][col3];

		 	System.out.println("Addition of both matrices A and B:");	

		 	//Adding the corresponding elements
		 	for (int i=0; i<3; i++) {
		 		for (int j=0; j<3; j++) {
		 			for(int k=0;k<2;k++)
		 			{
		 				arr3[i][j] += arr1[i][k] * arr2[k][j];
		 					
		 			}
		 			
		 		}
			}
			for (int i=0;i<3 ;i++ ) {
				for (int j=0;j<3 ;j++ ) {
					System.out.print("c[" + i + "][" + j +"] = " + arr3[i][j]+" ");
					
				}
				System.out.println();
			}
	}
}
