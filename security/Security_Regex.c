#include <stdio.h>
#include <regex.h> 
#define MAX 200

int main() {
    char floor[MAX];
    fgets(floor,MAX,stdin);
    
    regex_t safeRegex;
    regcomp(&safeRegex, "[$T].*G.*[$T]", 0);
    
    int isSafe = regexec(&safeRegex, floor, 0, NULL, 0) == 0;
    
    puts(isSafe ? "quiet" : "ALARM");
    regfree(&regex);
    return 0;
}
