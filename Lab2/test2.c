int main(){
	int a = 5;
	int b = 10;
	while(a--){
		b+1;
		printf("b:%d, ", b);
	}
	int i;
	for(i=a; i<=5; i++){
		printf("i=%d, ", i);
	}
	return 0;
}
