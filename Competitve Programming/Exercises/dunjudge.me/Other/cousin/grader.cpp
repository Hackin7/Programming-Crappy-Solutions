#include <bits/stdc++.h>
#include "cousin.h"
using namespace std;

int main() {
	int N, Q;
	scanf("%d%d", &N, &Q);
	int P[N];
	for (int i = 0; i < N; i++) scanf("%d", &P[i]);
	init(N, P);
	for (int i = 0; i < Q; i++) {
		int a, b;
		scanf("%d%d", &a, &b);
		printf("%d\n", count_cousins(a, b));
	}
}

