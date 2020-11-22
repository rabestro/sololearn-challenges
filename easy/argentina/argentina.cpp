#include <iostream>
using namespace std;

int main() {
    long pesos, dollars;
    cin >> pesos >> dollars;
    
    cout << (dollars * 50 > pesos ? "Pesos" : "Dollars");
    return 0;
}
