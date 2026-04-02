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
         }    //⚡ Why swap like this?

//Agar directly likh dete:

//arr[i] = arr[smallest];
//arr[smallest] = arr[i];


//❌ toh dono jagah same value chali jaati (overwrite ho jaata).
         int temp = arr[smallest];//Save smallest element in temp
        arr[i]= arr[smallest]; //put arr[i] element into arr[j]
         arr[i] = temp; //Put temp into arr[i]
        }
        printJava(arr);
    }

                                     // selection sort me sabse paHLE ELEMENT KO SHORTED MANATE HAI that means vo elment sabse chhota hai as uska compare next element se karter hai agr vo element jayda chhota hai to usko minimum elemnet bna lete hai hai nhi to aage badhte hai 
                                
}