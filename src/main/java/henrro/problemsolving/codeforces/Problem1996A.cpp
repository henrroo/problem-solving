#include <math.h>

#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    int n;
    int count = 0;
    for (size_t i = 0; i < t; i++) {
        cin >> n;
        while (n != 0) {
            if (n == 2) {
                n -= 2;
            } else {
                n -= 4;
            }
            count++;
        }
        cout << count << endl;
        count = 0;
    }

    return 0;
}