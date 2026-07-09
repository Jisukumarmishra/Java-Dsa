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
