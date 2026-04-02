import java.util.*;
// Searching for an element x in a matrix.
public class searchingin2darray {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int row =sc.nextInt(); // row and col show kar rha hai kitne number of row and colum honge matrix me 
        
        int col= sc.nextInt();
        // ab system se jo iput liye hai usko 2d array me store karenge
        int[][] num = new int[row][col];
        // input lenge
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j] =sc.nextInt();// maine yha pe galti ki thi in bracket maine row and col likha tha pr vo nhi hoga uske jagahe pe i and j hoga because row and col huea to usme vo sare case  aa jayenge jo matrix me exist nhi karte because row and col hmara total numbewr of element in row and total num of elementin col btata hai 
            }
        }
        int x = sc.nextInt();
        //output show karenge
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++) {
                //compare with x
                if(num[i][j]==x){
                    System.out.println("x found at Location (" +i+","+j+")");
                }

            }

        }
    }
}
