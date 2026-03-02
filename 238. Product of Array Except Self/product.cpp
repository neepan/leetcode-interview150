#include <bits/stdc++.h>

using namespace std;

class Solution{
public:
vector<int> productExceptSelf(vector<int>& nums){

/* CONCEPT
     nums= 1 2 3 4
     left(i)= 1 1 2 6 // product of elements before index i
     RIGHT(i)=24 12 4 1 // products of elements after index i

     answer= left(i) * right(i)
  */

    int n=nums.size();
    vector<int> answer(n);


    //steps 1: prefix product (left) -> Storing the left(i) in answer itself
    ans[0]=1;
    for(int i=1;i<n;i++){
    ans[i] = ans[i-1] * nums[i-1]; //1 1 2 6
    }

    // Step 2: Sufffix products (right) -> multiplying the left with the right in answer itself using rightproduct
    int rightProduct=1;
    for(int i=n-1;i>=0;i--){
    answer[i] *=rightProduct;
    rightProduct *=nums[i];
    }


return answer;

}
};

int main(){
    int n;
    cin>>n;

    vector<int>nums(n);
    for(auto &i:nums){
    cin>>i;
    }

    Solution obj;
    vector<int> answer(n) = obj.productExceptSelf(nums);

    for(auto x: answer){
    cout<<x<<" ";
    }

}
