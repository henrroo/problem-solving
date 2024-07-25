#include <iostream>

using namespace std;

int magnets();

int main() {
    cout << magnets() << endl;
    return 0;
}

int magnets() {
    int count = 0;
    int n;
    cin >> n;
    string magnet;
    cin >> magnet;
    string actualMagnet = magnet;
    count++;
    for (size_t i = 1; i < n; i++) {
        cin >> magnet;
        if (magnet != actualMagnet) {
            count++;
            actualMagnet = magnet;
        }
    }
    return count;
}