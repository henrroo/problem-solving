#include <iostream>

using namespace std;

int main() {
    long long x;
    cin >> x;
    if (x % 2 == 0) {
        cout << x / 2 << endl;
    } else {
        cout << -1 * (x / 2 + 1) << endl;
    }
    return 0;
}