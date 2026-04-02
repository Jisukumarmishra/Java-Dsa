import java.util.*;
public class homework3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();
     int num[] = new int [n];

     for(int i=0;i<n;i++) {
        num[i] = sc.nextInt();
     }
      boolean isAscending = true; // ham assume kiye hai ki isSorted varriable true hai 
      //matlab Array sorted hone ki probability hai jab tak hum prove na kar dein ki nahi hai.

      for (int i=0; i<num.length-1;i++) {
        //yha pe i ki value ham 1 se start karke num.length tak hi ja sakte hai becauise agr aisa krenge to ham last boud exception aa jaga that means ham array size kin index se aage chale jate hai ya uski jarurat parti hai jo array hai hai nhi 
      
        if( num[i]>num[i+1] ) {
           isAscending= false;
           }
        }
      if (isAscending){  //👉 Java me jab boolean variable use karte hain, to comparison likhne ki bilkul zarurat nahi padti ✅
        System.out.println("array is sorted in ascending order");
      }   else {
        System.out.println("array num is not sorted");
      }

      }


    }

    //✅ Java ka Logic Behind if (isAscending)

// 👉 Jab hum likhte hain:

// if (isAscending) {
//     // Block 1
// } else {
//     // Block 2
// }


// 👉 Java internally yeh karta hai:

// if (isAscending == true) {
//     // Block 1
// } else {
//     // Block 2
// }


// 💡 Reason:
// isAscending ek boolean variable hai →
// Uska value sirf 2 hi ho sakta hai:

// true

// false

// ✅ How Java understands it?

// 👉 Example:

// boolean isAscending = true;

// if (isAscending) {  
//     System.out.println("Array is sorted");
// } else {
//     System.out.println("Array is not sorted");
// }


// 🔍 Behind the scenes:

// Java sees:
// → Is isAscending true?
// → Agar yes → Enter the first block.
// → Otherwise → Enter else block.
