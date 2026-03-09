#include <bits/stdc++.h>

using namespace std;

class Solution{
public:

int lengthOfLastWord(string s){

    int cnt=0;
    int i=s.size()-1;

    while(i>=0 && s[i]==' '){
    i--;
    }

    while(i>=0 && s[i]!=' '){
    cnt++;
    i--;
    }

    return cnt;



}
};

int main(){

string s;
cin>>s;

Solution obj;
cout<<obj.lengthOfLastWord(s);
}
