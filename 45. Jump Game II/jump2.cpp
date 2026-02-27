#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        int jumps = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = max(farthest, i + nums[i]);

            // time to make a jump
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
};


int main (){
    int n;
    cin>>n;

    vector<int> nums(n);
    for(int &i: nums){
        cin>> i;
    }

    Solution obj;
    int ans = obj.jump(nums);

    cout<<ans;

}
