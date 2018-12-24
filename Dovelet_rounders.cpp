#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int a, t;
       cin >> a;
       t = a;
       if (a > 0) {
              a = a;
       }
       if (a > 10) {
              a = a % 10;
              if (a < 5) { a = t / 10 * 10; }
              else { a = (t / 10 + 1) * 10; }
              t = a;
       }
       if (a > 100) {
              a = a % 100;
              if (a < 50) { a = t / 100 * 100; }
              else { a = (t / 100 + 1) * 100; }
              t = a;
       }
       if (a > 1000) {
              a = a % 1000;
              if (a < 500) { a = t / 1000 * 1000; }
              else { a = (t / 1000 + 1) * 1000; }
              t = a;
       }
       if (a > 10000) {
              a = a % 10000;
              if (a < 5000) { a = t / 10000 * 10000; }
              else { a = (t / 10000 + 1) * 10000; }
              t = a;
       }
       if (a > 100000) {
              a = a % 100000;
              if (a < 50000) { a = t / 100000 * 100000; }
              else { a = (t / 100000 + 1) * 100000; }
              t = a;
       }
       if (a > 1000000) {
              a = a % 1000000;
              if (a < 500000) { a = t / 1000000 * 1000000; }
              else { a = (t / 1000000 + 1) * 1000000; }
              t = a;
       }
       if (a > 10000000) {
              a = a % 10000000;
              if (a < 5000000) { a = t / 10000000 * 10000000; }
              else { a = (t / 10000000 + 1) * 10000000; }
              t = a;
       }
       printf("%d", a);
       return 0;
}