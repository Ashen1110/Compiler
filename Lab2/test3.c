int main(){
    int a=5;
    int b=10;
    
    if(a==5) b=11;
    if (b==10) {
    	if(a+1==6) a=6;
    	else a = b+1;
    }
    else a = 12;

    return 0;
}
