#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int n, sum = 0;
       cin >> n;
       for (int i = 1; i < n; i++) {
              if (n%i == 0) {
                     sum += i;
              }
       }
       if (sum == n) {
              printf("%5d", n);
              printf("  PERFECT");
       }
       else if (sum > n) {
              printf("%5d", n);
              printf("  ABUNDANT");
       }
       else {
              printf("%5d", n);
              printf("  DEFICIENT");
       }
       return 0;
}