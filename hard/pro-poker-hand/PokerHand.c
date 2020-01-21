#include <stdio.h>
#include <string.h>
#define MAX 21

int main() {
  char poker_hand[MAX];
  char *c = fgets(poker_hand, MAX, stdin);
  int v[5], p[3], q=0, flush=1;
  char suit;
  
  for(int i = 0; i < 5; ++i, c+=2) {
  	switch (*c) {
  		case 'J': v[i] = 11; break;
  		case 'Q': v[i] = 12; break;
  		case 'K': v[i] = 13; break;
  		case 'A': v[i] = 14; break;
  		case '1': v[i] = 10; ++c; break;
  		default: v[i] = *c - '0';
  	}
  	++c; 
  	if (!i || (flush && (flush = suit == *c))) suit = *c;
  	for (int t, *k=v+i; k>v && *k < *--k; *k=k[1], k[1]=t) t=*k;
  }
  int *k = v, t = *v;
  int stright = *++k == ++t && *++k == ++t && *++k == ++t && *++k == ++t;
  k = v + 4;
  while (k > v) if (*k == *--k) ++q; else if (q) p[--q]++, q=0;
  if (q) p[--q]++;
  
  if (flush && stright) printf("%s Flush", *v==10?"Royal":"Straight");
  else if (flush) puts("Flush");
  else if (stright) puts("Straight");
  else if (p[2]) puts("Four of a Kind");
  else if (p[1]) puts(*p?"Full House":"Three of a Kind");
  else if (*p) puts(*p==2?"Two Pairs":"One Pair");
  else puts("High Card");
  
  return 0;
}
