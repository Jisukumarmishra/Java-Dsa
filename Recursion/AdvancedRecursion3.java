public class AdvancedRecursion3 { // places tiles of size 1*m in a floor of size n*m;
    public static int placeTiles (int n , int m ) { // int return type because tha pe ham total way jha pe ham tiles ko floor pe bhar sakte hai vo retun kra rhe hai 
     if ( n == m) {
        return 2; 
     } if ( n < m ) {
        return 1;

     }
        // vertically
     int vertPlacement = placeTiles(n-m, m); // because verticsally places kiyqa to uppar ka m size bar gya isliye n-m kiye haI
     // horinzantly
     int horzPlacement = placeTiles(n-1, m);
     return vertPlacement + horzPlacement; 
    }
 public static void main(String[] args) {
    int n = 4, m =  2; // n = m me 2 ways hote hai // n<m me 1 ways honge 
    System.out.println (placeTiles(n, m));
     
 }
}
