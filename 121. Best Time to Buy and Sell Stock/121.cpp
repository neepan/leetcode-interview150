#include <bits/stdc++.h>

using namespace std;

class Solution{
public:
int maxProfit(vector<int>& prices){

	int n= prices.size();
	int mini=prices[0];
	int profit = 0;
	
	for(int i=0;i<n;i++){
		int cost=prices[i]-mini;
		 profit=max(profit,cost);
		mini=min(prices[i],mini);
	}
	return profit;
	 

	
}
};

int main(){
	int n;
	cin>>n;

	if(n <1 || n>100000){
		cout<<"Invalid n\n";
		return 0;
	}

	vector<int> prices(n);
	for(int i=0;i<n;i++){
		cin>>prices[i];

		if(prices[i]<0 || prices[i] >10000){
			cout<<"Invalid Price";
			return 0;
		}
	}

	Solution obj;


	int ans = obj.maxProfit(prices);

	cout<<ans;
	return 0;
	



}
