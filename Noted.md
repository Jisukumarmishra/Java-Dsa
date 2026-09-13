Constructor → object ko ready karta hai

Methods → ready object par kaam karte hain

Queue me rear se element add hote hai and front se nikalte hai

// For the Circular Queue
(rear + 1) % n ;
(front+1) % n ;

# Monotonic Stack

Used for:

Next Greater Element
Next Smaller Element
Previous Greater Element
Previous Smaller Element
Stock Span
Daily Temperatures
Largest Rectangle

Next Greater Element

[2, 1, 5, 3, 4]

Answer:
[5, 5, -1, 4, -1]

# Skeleton

Stack<Integer> stack = new Stack<>();
int[] ans = new int[n];

Arrays.fill(ans, -1);

for (int i = n - 1; i >= 0; i--) {

    while (!stack.isEmpty() && stack.peek() <= arr[i]) {
        stack.pop();
    }

    if (!stack.isEmpty()) {
        ans[i] = stack.peek();
    }

    stack.push(arr[i]);

}
