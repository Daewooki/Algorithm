#include <iostream>
#include <cmath>
using namespace std;
int main() {
       double num;
       double sum = 0;
       for (int i = 1; i <= 12; i++) {
              cin >> num;
              sum += num;
       }
       sum = sum / 12.0;
       cout << fixed;
       cout.precision(2);
       cout << "$" << sum;
       
       return 0;
}