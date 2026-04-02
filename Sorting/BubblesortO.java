public class Bubblesort {
    // dekho ish tuype ke question me ham do loop chalate hai sabse psahle loop (outer loop) me ham sare element pe jate hai that means traverse karte hai and main jo operation perform kran aparta hai vo case inner loop me likhte hai 
    public static void printArray(int arr[]){
        // ye for loop hamfunal sorted array p[rint karne ke liye likhe hai] 
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");


        }
    }
    public static void main(String[] args) {
        int arr [] = {12,36,9,31,3,6,0,};
        //bubble short
        for (int i =0; i<arr.length-1;i++) {
            for (int j=0; j<arr.length-i-1;j++){ //time complexity 0(n^2)
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;

                }
                
            }
        }
        printArray(arr);
    }
}
   

                           // first loop me pahle do element ko compare karenge unko short karenge to sabse bada element apne aap last me chala jayha  aise hi loop run karte rahenge and sare bhari element right side shift hote rahenge and last ,me left side me sabse chhiota ellement rahega c
                        


