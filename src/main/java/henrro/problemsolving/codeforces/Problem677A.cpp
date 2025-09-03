#include <cmath>
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int h;
    cin >> h;
    int count = 0;
    int f;
    for (int i = 0; i < n; i++) {
        cin >> f;
        count += (int)ceil((double)f / h);
    }

    cout << count << endl;
    return 0;
}