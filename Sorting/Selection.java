public class Selection {
    public static void printJava(int arr[]) {
        for (int i = 0; i <arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,7,1,5,};
        //selection sorting // time complexity is O(n^2);
        for (int i = 0; i < arr.length; i++) {
         int smallest = i;
         for (int j =i+1; j<arr.length; j++) {
             if (arr[smallest] >arr[j]) {
                 smallest = j;

             }
         }
         int temp = arr[smallest];
         arr[smallest] = arr[i];
         arr[i] = temp;
        }
        printJava(arr);
    }

                                     // selection sort me sabse paHLE ELEMENT KO SHORTED MANATE HAI that means vo aelment sabse chhota hai as uska compare baki sabh
                                   // element se karre hi 
}