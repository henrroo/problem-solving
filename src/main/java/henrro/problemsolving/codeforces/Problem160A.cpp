#include <algorithm>
#include <iostream>

using namespace std;

int twins();

int main() {
    cout << twins() << endl;
    return 0;
}

void show(int a[], int array_size) {
    for (int i = 0; i < array_size; i++) {
        cout << a[i] << " ";
    }
}

int twins() {
    int n;
    cin >> n;
    int arr[100];
    int totalSum = 0;
    for (size_t i = 0; i < n; i++) {
        cin >> arr[i];
        totalSum += arr[i];
    }
    sort(arr, arr + n, greater<int>());
    int sum = 0;
    int count = 0;
    for (size_t i = 0; i < n; i++) {
        sum += arr[i];
        totalSum -= arr[i];
        count++;
        if (sum > totalSum) {
            break;
        }
    }
    return count;
}