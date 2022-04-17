#include <stdio.h>

int main(){
	int a;
	int b;
	scanf("%d", &a);
	switch(a){
		case 5:
			b = 10;
			break;
		case 6:
			b = a+1;
			break;
		default:
			b = 3;
	}
	return 0;
}
