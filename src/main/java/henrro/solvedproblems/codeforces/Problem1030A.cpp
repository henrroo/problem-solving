#include <iostream>

using namespace std;

string difficulty();

int main() {
    cout << difficulty() << endl;
    return 0;
}

string difficulty() {
    int n;
    cin >> n;
    int k;
    for (int i = 0; i < n; i++) {
        cin >> k;
        if (k == 1) {
            return "HARD";
        }
    }
    return "EASY";
}