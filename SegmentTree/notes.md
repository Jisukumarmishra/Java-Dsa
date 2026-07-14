ST is special type of ds that help to solve range queires
prefixSum Appraoch:--->

Approach:-- 1) BruteForce

Quries O(n)
for (k =i to k =j) {
sum += arr[k];
}

update O(1)
arr[idx] = ---

Approach:-- 2) prefixsum appraoach

1. quries operaion i to j O(1)

prefix[j] - prefix[i-1]

2. update O(n)

# st me quries ka tc--> O(logn)

update ---> O(logn)

# Segment Tree:--

mid = (s+e)/2
left = (s, mid)
right = (mid+1, e)

total level(x) = log(base2)n
total nodes = 2n-1;
for safety we take 4n

segment tree is full binary tree(every node has 2 child except the leaf node)
