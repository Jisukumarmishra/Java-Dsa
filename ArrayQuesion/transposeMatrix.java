import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        int [][] matrix = new int[n][m];
        //input
        for(int i =0; i<n; i++){
            for (int j =0;j<m;j++){
                matrix[i][j] = sc.nextInt();// ye islie likhe hai taki haer position pe elment store karna hai na
            }
        }
        System.out.println("the transpose is: ");
        // creatre transpoze matrix of size m*n  // yha pe ham extra storage leke tranpoze matrix create kar he  hai bina iske nhi ham print kra sakte hai 
        // to print transpoze matrix 
        //for(int j=0; j<m; j++ ){
        // for (int i=0; i<n; i++){
        //     System.out.println(matrix[i][j]); // yha pe [j][i] isliye nhi huea because [i][j] yha pe bas systoamtic tarike se print krane ke liye use ho rha hao

        // }}
     int [][] transpose = new int [m][n];
     for(int i=0; i<n;i++){
        for (int j=0; j<m; j++ ){
            transpose[j][i] = matrix[i][j];
        }
     }
     // print the transpoze matrix
     for (int i=0; i<m;i++){
        for (int j=0; j<n; j++){
            System.out.print(transpose[i][j]);
        }
        System.out.println();
     }
    }
}
