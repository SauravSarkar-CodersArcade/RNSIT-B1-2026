#include<iostream>
using namespace std;
class TreeNode{
public:
    int data;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int data){
        this->data = data;
        this->left = this->right = nullptr;
    }
};
class Solution{
    public:
    TreeNode* sortedArrayToBalancedBST(int arr[], int s, int e){
        if(s > e) return NULL;
        int mid = s+(e-s)/2;
        TreeNode* root = new TreeNode(arr[mid]);
        root->left = sortedArrayToBalancedBST(arr, s,mid-1);
        root->right = sortedArrayToBalancedBST(arr, mid+1, e);
        return root;
    }
};
int main(){
    int arr[] = {1,2,3,4,5,6,7,8,9};
    Solution s;
    TreeNode* root;  
    root = s.sortedArrayToBalancedBST(arr, 0, 8);
    cout << root->data << endl; 
    return 0;
}