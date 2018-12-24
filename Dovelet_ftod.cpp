#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int a, b, c;
       int num=0;
       cin >> a >> b >> c;
       for (int i = 0; i < c; i++) {
              if (i == 0) {
                     cout << "0." << a * 10 / b;
                     num = a * 10 % b;
              }
              else {
                     cout << num * 10 / b;
                     num = num * 10 % b;
              }
       }
       return 0;
}