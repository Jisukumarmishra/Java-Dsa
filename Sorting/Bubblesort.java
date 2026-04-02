public class Bubblesort {
    public static void printArray(int arr[]){
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
   

                           //pahle do element ko compare karenge unko short karenge unme jo chhota element rahega usko pahle rakhenge 
                           // phir uske agle next do element ko short karte hAI
}

