int main(){
    
    int a, b;
	printf("Please enter the number:\n");
	printf("a: ");
	scanf("%d", &a);
	printf("b: ");
	scanf("%d", &b);
    
    if(a%2 == 0) {
    	printf("a is an even number\n"); 
    	b +=a;
    }
    if (b%2 != 0) {
    	if(a >= b) {
    		a-=b; 
    		printf("a: %d\n", a);
    		printf("b: %d\n", b);
    	}
    	else {
    		a = b+1; 
    		printf("a: %d\n", a);
    		printf("b: %d\n", b);
    	}
    }
    else {
    	a = 120; 
    	printf("a: %d\n", a);
    	printf("b: %d\n", b);
    }

    return 0;
}
