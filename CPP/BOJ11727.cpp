#include <iostream>
using namespace std;

int main() {
    int N;
    cin >> N;

    int arr[1001];

    arr[1] = 1;
    arr[2] = 3;

    for(int i = 3; i <= N; ++i) {
        arr[i] = (arr[i - 1] + 2 * arr[i - 2]) % 10007;
    }

    cout << arr[N];

    return 0;
}