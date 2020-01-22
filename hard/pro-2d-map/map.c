#include <stdio.h>
#include <math.h>
#define MAX 32

int main() {
    char map[MAX];
    char *c = fgets(map, MAX, stdin);
	int p[2], i = 0;
	
	while (i < 2) if (*c++ == 'P') p[i++] = c - map;
	int path = p[1] / 6 - *p / 6 + abs(*p % 6 - p[1] % 6);
	
	printf("%d", path);
    return 0;
}
