#include <bits/stdc++.h>
using namespace std;

class  Solution{
public:
        string convert(string s, int numRows){
            if(numRows==1 || s.size()<=numRows) return s;

            vector<string> rows(numRows);

            int currentRow=0;
            int direction=1;

            for(char c: s){

                row[currentRow]+=c;

                if(currentRow ==0) direction=1;
                else if(direction ==numRow -1) direction=-1;

                currentRow+=direction;
            }

            string result="";

            for(string row: rows){
                result+=row;
            }

            return result;

        }

};

int main() {

    string s;
    int numRows;

    cin >> s;
    cin >> numRows;

    Solution obj;

    cout << obj.convert(s, numRows);

}
