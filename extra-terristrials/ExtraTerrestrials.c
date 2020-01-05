#include <stdio.h>
#include <string.h>
#define MAX 80

int main() {
    char word[MAX];
    int i = strlen(fgets(word, MAX, stdin));
	
    while (i--) putchar(word[i]);
	  
    return 0;
}
