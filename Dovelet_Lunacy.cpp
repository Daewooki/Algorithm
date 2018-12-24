#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       float earth = 1;
       float moon = 0.167;
       float num;
       for (float i = 0; i != -1; i++) {
              cin >> num;
              if (num == -1) {
                     return 0;
              }
              float earth = 1;
              float moon = 0.167;
              earth *= num;
              moon *= num;
              cout << fixed;
              cout.precision(2);
              cout << "Objects weighing " << earth << " on Earth will weigh " << moon << " on the moon." << endl;
       }
}