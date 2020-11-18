#include <iostream>
using namespace std;

int main() {
    int points;
    int price;
   
    cin >> points >> price;
    
    cout << (points / 12 >= price ? "Buy it!" : "Try again");
   
    return 0;
}
