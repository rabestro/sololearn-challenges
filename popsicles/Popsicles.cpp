#include <iostream>
using namespace std;

int main() {
    int siblings, popsicles;
    //take input
    cin>>siblings>>popsicles;

    //your code goes here
    
    cout << (popsicles % siblings ? "eat them yourself" : "give away");
        
    return 0;
}
