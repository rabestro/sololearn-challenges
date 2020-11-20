#include <iostream>
using namespace std;

int main() {
   for (int i = 0; i < 6; ++i) {
   	   int n;
   	   cin >> n;
   	   cout << (n % 3 ? n % 2 ? "Snap " : "Crackle " : "Pop ");
   }
	return 0;
}
