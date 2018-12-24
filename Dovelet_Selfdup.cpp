#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;
int main() {
       int n, z = 1, i, t = 10;
       for (i = 1; i <= 10000; i++)
       {
              n = i * i;
              if (n % 1 == i)
                     printf("%d\n", i);
              else if (n % 10 == i)
                     printf("%d\n", i);
              else if (n % 100 == i)
                     printf("%d\n", i);
              else if (n % 1000 == i)
                     printf("%d\n", i);
              else if (n % 10000 == i)
                     printf("%d\n", i);
       }
       return 0;
}