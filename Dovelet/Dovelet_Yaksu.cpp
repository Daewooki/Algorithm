#include <iostream>
#include <cmath>
using namespace std;
int main() {
       int num;
       int what;
       int realcount = 0;
       int count = 0;
       cin >> num >> what;
       int min = 0;
       for (int i = 1; i <= num; i++) {
              if (num%i == 0) {
                     realcount++;
                     if (min < i) {
                           min = i;
                           count++;
                           if (count == what)
                           {
                                  cout << min ;
                           }
                     }
              }
              
       }
       if (realcount < what)
       {
              cout << "0";
       }
       return 0;
}