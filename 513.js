/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var findBottomLeftValue = function(root) {
    const queue=[root];
    let leftmost=null;
    while(queue.length>0){
        leftmost=queue.shift();
        if(leftmost.right){
            queue.push(leftmost.right);
        }
        if(leftmost.left){
            queue.push(leftmost.left);
        }
    }
    return leftmost.val;
};
