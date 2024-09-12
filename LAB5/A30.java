import java.util.Scanner;

class A30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

			System.out.print("Enter row size:");
			int row = sc.nextInt();

			System.out.print("Enter column size:");
			int col = sc.nextInt();

			System.out.println();

            //MATRIX A 
            int arr1[][] = new int[row][col];

			System.out.println("Enter elements of 1st matrix:");

		 	//Scanning 1st matrix
		 	for (int i=0; i<=row-1; i++) {	//Row
		 		for (int j=0; j<=col-1; j++) {	//Column
		 			arr1[i][j] = sc.nextInt();
		 		}
		 	}

            //Printing 1st matrix
		 	System.out.println("Elements of matrix A:");
		 	for (int i=0; i<=row-1; i++) {
		 		for (int j=0; j<=col-1; j++) {
		 			System.out.println( "a[" + i + "][" + j +"] = " + arr1[i][j]);
		 		}
		 	}
 
		 	System.out.println();

		 	//MATRIX B
		 	int arr2[][] = new int[row][col];

			System.out.println("Enter elements of 2nd matrix:");

		 	//Scanning 2nd matrix
		 	for (int i=0; i<=row-1; i++) {	//Row
		 		for (int j=0; j<=col-1; j++) {	//Column
		 			arr2[i][j] = sc.nextInt();
		 		}
		 	}

		 	//Printing 2nd matrix
		 	System.out.println("Elements of matrix B:");
		 	for (int i=0; i<=row-1; i++) {
		 		for (int j=0; j<=col-1; j++) {
		 			System.out.println( "b[" + i + "][" + j +"] = " + arr2[i][j]);
		 		}
		 	}

            System.out.println();

		 	//ADITION OF MATRICES
		 	int arr3[][] = new int[row][col];

		 	System.out.println("Addition of both matrices A and B:");	

		 	//Adding the corresponding elements
		 	for (int i=0; i<=row-1; i++) {
		 		for (int j=0; j<=col-1; j++) {
		 			arr3[i][j] = arr1[i][j] + arr2[i][j];
		 			System.out.println("c[" + i + "][" + j +"] = " + arr3[i][j]);
		 		}
				}
	}

}
