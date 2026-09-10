public class sortedArray {
    public static boolean  isSorted ( int arr [], int idx ){
        if ( idx == arr.length-1){  // base codition yhA PE AGR TUM EL EQUAL TO LGATE HO TO USKA MATLAB HOGA KI TUM comparision kar rhe ho
         return true;  // 
         }
        if (arr[idx]<arr[idx+1]) {
            // array is sorted till now
             return isSorted ( arr ,idx+1);// yha pe return is liye aaya 
        }
        else {
            return false ;
        }
    }
public static void main(String[] args) {
    int arr [] = { 1,2,6 } ;
    System.out.println(isSorted(arr,0));
    
}
}
