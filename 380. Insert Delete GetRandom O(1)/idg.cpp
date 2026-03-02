#include <bits/stdc++.h>
using namespace std;

class RandomizedSet {
private:
    vector<int> nums;                 // stores elements
    unordered_map<int, int> pos;      // value -> index

public:
    RandomizedSet() {}

    bool insert(int val) {
        if (pos.count(val)) return false;

        nums.push_back(val);
        pos[val] = nums.size() - 1;
        return true;
    }

    bool remove(int val) {
        if (!pos.count(val)) return false;

        int index = pos[val];
        int lastElement = nums.back();

        // swap with last element
        nums[index] = lastElement;
        pos[lastElement] = index;

        // remove last
        nums.pop_back();
        pos.erase(val);

        return true;
    }

    int getRandom() {
        if (nums.empty()) return -1;
        int r = rand() % nums.size();
        return nums[r];
    }
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    RandomizedSet rs;

    int n;
    cin >> n;
    cin.ignore(); // consume newline

    while (n--) {
        string op;
        cin >> op;

        if (op == "insert") {
            int x;
            cin >> x;
            cout << (rs.insert(x) ? "true" : "false") << "\n";
        }
        else if (op == "remove") {
            int x;
            cin >> x;
            cout << (rs.remove(x) ? "true" : "false") << "\n";
        }
        else if (op == "getRandom") {
            cout << rs.getRandom() << "\n";
        }
    }

    return 0;
}
