int main(){
	int a, b;
	printf("Please enter the number:\n");
	printf("a: ");
	scanf("%d", &a);
	printf("b: ");
	scanf("%d", &b);
	if(a>b) printf("a is bigger than b.\n");
	if(a<b) printf("b is bigger than a.\n");
	if(a==b) printf("a and b are equal.\n");
	
	return 0;
}
