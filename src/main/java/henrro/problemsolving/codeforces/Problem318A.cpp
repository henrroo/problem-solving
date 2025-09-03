#include <iostream>
using namespace std;

int main() {
    long long n, k;
    cin >> n >> k;
    long long count_odds = (n + 1) / 2;
    if (k <= count_odds) {
        cout << (2 * k - 1) << endl;
    } else {
        long long k_even = k - count_odds;
        cout << (2 * k_even) << endl;
    }
    return 0;
}
