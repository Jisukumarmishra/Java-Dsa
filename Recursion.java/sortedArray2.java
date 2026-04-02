public class sortedArray2 {    // move all x toward end in string axbcxxd
    public static void moveAllx (String str , int idx , int count , String newstr ) {
        // base case 
        if (idx == str.length()){
            for ( int i = 0; i<count; i++ ){  // for loop isliye lgaya taki jitne x count karke count me 
                // rakhe hai usko last add kar sake new string me
                newstr += 'x';  // newstr me x char add kar denge count times that means jitne bar count varrible count iye hai;
            }
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx); // string me se pahle character ko nikal liya
         if (currChar == 'x' ) {  // singlon semiclon because vo character hai
            count = count + 1;  // count++; jitnee x aayga utne count baddhate rahenge
            moveAllx(str, idx+1, count, newstr);
            }   else {
                newstr += currChar; // newstr = newstr + currChar
                moveAllx(str, idx+1, count, newstr);

            }
         }
    public static void main (String [] args) {
        String str = "axbcxxd";
        moveAllx(str, 0, 0, "");
    }
}   

// time complexity of this code is o (n+coun{n}) = O(n+n)=O(2n)
// sice asymptonics notation so thau we remove 2 so 
// time complexity = 0(n)