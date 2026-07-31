# System.out.println();

System Java ki built-in class hai.
out is the object of system class // resposible for show output in the console
println() is the method that print

SC find out karne ke liye ham array ka kitna elemnt ds me store kar rhe hai if worst case me sare elemnt store ho thahai to SC O(n) hoga

// Const SC means Array me Kinte Bhi Elemnt Hai But HAm Const Number Of Varraibel Use Kar rha hai to O(1) Hoga

# Others Diffrent Eg:--

int[][] dp = new int[n][m];

Sc:== O(n\*m)

// int[] arr = new int[n]; SC:== O(n)

# Recursion

// har recursive call stack me store hota hai to O(n)

# Java Always Take Pass By Value

1. Primitive (int, double, char, boolean)
   Copy of the value pass hoti hai.
   Original change nahi hota.

2. Objects/Arrays
   Reference (address) ki copy pass hoti hai.
   Object ke andar changes dikhte hain.
   Lekin parameter ko kisi naye object par assign karne se caller par koi effect nahi padta.

# 👍 General case me Arrays.sort() ki complexity hoti hai:

O(m log m)

Jahan m = array ka size.

int[] arr = new int[n];
Arrays.sort(arr); // O(nlogn)

int[] freq = new int[26];
Arrays.sort(freq); // O(26log26) = O(1)

# Hashing

Hashing is a technique used in data structures that efficiently stores and retrieves data in a way that allows for quick access.

Hashing involves mapping data to a specific index in a hash table (an array of items) using a hash function. It enables fast retrieval of information based on its key.
The great thing about hashing is, we can achieve all three operations (search, insert and delete) in O(1) time on average.
Hashing is mainly used to implement a set of distinct items (only keys) and dictionaries (key value pairs).
