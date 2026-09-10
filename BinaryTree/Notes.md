# Binary Tree Templete

void solve(TreeNode root) {

    if(root == null) {
        return;
    }

    // root ka kaam

    solve(root.left);

    // root ka kaam

    solve(root.right);

    // root ka kaam

}

# Pattern 1 Of Binary tree

int left = function(root.left);
int right = function(root.right);

return 1 + Math.max(left, right);
