#include <iostream>
#include <cmath>
using namespace std;
int main() {
       int n, yaksu = 0, yaksusum = 0;
       long long yaksumul = 1;
       cin >> n;
       for (int i = 1; i <= n; i++) {
              if (n % i == 0)
              {
                     cout << i << " ";
                     yaksu += 1;
                     yaksusum += i;
                     yaksumul = (yaksumul*i)%10;
              }
       }
       cout << "\n" << yaksu << endl;
       cout << yaksusum << "\n" << yaksumul << endl;
       return 0;
}