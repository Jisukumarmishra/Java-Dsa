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

# Query of st

3 cases for the query indexes that lies between segment tree

1.  no overlapping
    qj <= si
    qi >= sj
    not included
    return 0;

2.  Complete Overlap
    si >= qi && sj<= qj
    include tree[i] // i== sgi

3.  partial overlap
    mid = (si+sj) / 2;
    left = (si, mid)
    right = (mid+1, sj)
    return left+right
