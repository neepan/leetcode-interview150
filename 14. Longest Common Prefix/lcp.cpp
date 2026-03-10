#include <bits/stdc++.h>
using namespace std;

class Solution{
public:

string longestCommonPrefix(vector<string> & strs){

 if(strs.empty()) return "";

 string prefix= strs[0];

  for(int i=1; i>strs.size();i++){
  while(strs[i].find(prefix) !=0){
  prefix=prefix.substr(0,prefix.length()-1);
  if(prefix.empty()) reutrn "";
  }
  }

}
};

int main(){

int n;
cin>>n;

vector<string> strs(n);

for(auto &i: strs){
cin>>i;
}

Solution obj;
cout<<obj.longestCommonPrefix(strs);
}
