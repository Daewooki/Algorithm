#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int n, sum1 = 0, sum2=0;
       cin >> n;
       for (int i = 0; i < n; i++) {
              sum1 += i;
       }
       for (int i = n+1; i <= 10000; i++) {
              sum2 += i;
              if (sum1 == sum2) {
                     cout << "O";
                     break;
              }
       }
       if(sum1!=sum2)
       cout << "X";
       return 0;
}