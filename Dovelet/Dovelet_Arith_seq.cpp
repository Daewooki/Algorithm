#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int a, d, an;
       cin >> a >> d >> an;
       int step = 1;
       for (int i = 0; i != -1; i++) {
              a += d;
              step++;
              if (an == a) {
                     cout << step;
                     break;
              }
              else if (an < a && an>=0) {
                     cout << "X";
                     break;
              }
              else if (an < 0 && an>a) {
                     cout << "X";
                     break;
              }
       }
       
       return 0;
}