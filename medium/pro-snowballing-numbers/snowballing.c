#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    
    for (int i, sum = 0; n--; sum += i) {
    	scanf("%d", &i);
    	if (i <= sum) {
    		puts("false");
    		return 0;
    	}
    }
    puts("true");
    return 0;
}
