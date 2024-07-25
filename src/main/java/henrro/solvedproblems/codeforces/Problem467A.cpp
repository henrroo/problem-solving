#include <iostream>

using namespace std;

int checkRoomCapacity();

int main() {
    cout << checkRoomCapacity() << endl;
    return 0;
}

int checkRoomCapacity() {
    int n;
    cin >> n;
    int count = 0;
    int p, q;
    for (size_t i = 0; i < n; i++) {
        cin >> p;
        cin >> q;
        if (p <= q - 2) {
            count++;
        }
    }
    return count;
}