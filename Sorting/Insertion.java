public class Insertion {
    public static void printArray(int arr[]){
        for(int i= 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr [] = {23,54,97,21,22,81,19};
        //insertion sorting //insertion sorting me pahle mid element ko find karte hai, mid element ke jo 
        //left side rahega usko sorted manenge right side ko unsorted manange phior continuouee unsorted me se daata leke udsko
        //sorted karte chalenge  
        for (int i = 0; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            //placement //time complexity is o(n^2);
            arr [j+1] = current;
        
        }
        printArray(arr);
     } 
}
