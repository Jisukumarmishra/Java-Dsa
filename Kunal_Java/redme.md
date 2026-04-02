1️⃣ O(n) time complexity — meaning

Your algorithm must only scan the array once, or just a few passes.

O(n) means:
✔ Time increases linearly with the number of elements
✔ No nested loops like for(i) for(j)
✔ No sorting (sorting is O(n log n), not allowed)

Example of O(n):
Looping through the array 1–2 times only.

2️⃣ O(1) auxiliary space — meaning

You must not use extra arrays, hash sets, or lists.

O(1) means:
✔ Only constant extra memory
✔ You can use a few variables, but NOT a new array or large data structure
✔ You must modify inside the given nums array itself

Allowed:
int a, b, c; — few variables

Not allowed:
boolean[] visited, HashSet<Integer>, new int[n]
❌ Because this is extra space O(n)