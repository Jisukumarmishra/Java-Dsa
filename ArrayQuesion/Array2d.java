import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in) ;
        int rows=sc.nextInt();
        int cols= sc.nextInt();
        int [][] num = new int[rows][cols];
        //input
        //row
        for(int i=0;i<rows;i++){ // ish loop me first row ke sare element ko lenge bro
            //column
           for(int j=0;j<cols;j++) {
            num[i][j] = sc.nextInt();
            
           }
        }
    //output print kra rha hu mai 
        for(int i=0; i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");

            }
            System.out.println();
        }
    }
}
