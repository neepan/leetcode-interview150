#include <bits/stdc++.h>

using namespace std;


class Solution {
public:

void reverseStr(string &s, int left, int right){
while(left < right){
swap(s[left],s[right]);
left++;
right--;
}
}

string reverseWords(string s){


int n =s.size();

//step 1 reverse first string
reverseStr(s,0,n-1);

int start=0, end=0;
while(start<n){

 while(start< n && s[start]==' ')start++;

 if(start>n)break;

 end=start;

 while(end < n && s[end] !=' ')end++;

 //step 2 : reverse word
 reverseStr(s,start,end-1);

 start=end;

}

//step 3: remove extra spaces
int i=0,j=0;

while(j<n){
while(j<n && s[j]==' ')j++;

while(j<n && s[j] != ' ')s[i++]=s[j++];

while(j<n && s[j]==' ')j++;

if(j<n)s[i++]=' ';
}

return s.substr(0,i);



}
};

int main(){
string s;
cin>>s;

Solution obj;
cout<<obj.reverseWords(s);

}
