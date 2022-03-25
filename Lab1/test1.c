#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(){
	string s1;
	scanf("%s", s1);
	int len = s1.length();
	int flag=0;
	for(int i=len-1; i>=0; i--){
		if(s1[len-i-1] != s1[i]){
			flag=1;
			break;
		}
	}
	if(flag==0) printf("YES \n ");
	else printf("NO \n");
	return 0;
}
