#include <stdio.h>
#include <stdlib.h>

using namespace std;

int rometonumber(char c){
    int ans=0;
    switch (c){
        case 'I':
            ans = 1; break;
        case 'V':
            ans = 5; break;
        case 'X':
            ans = 10; break;
        case 'L':
            ans = 50; break;
        case 'C':
            ans = 100; break;
        case 'D':
            ans = 500; break;
        case 'M':
            ans = 1000; break;
    }
    return ans;
}

int main(){
    string s;
    scanf("%s", s);
    int sum=0, len=s.length(), counter=0;
    while(counter<len){
        int current = rometonumber(s[counter]);
        if(counter+1<len && current<rometonumber(s[counter+1])){
            sum+= rometonumber(s[counter+1]) - current;
            counter++;
        }
        else sum+=current;
        counter++;
    }
    printf("%s\n");
    return 0;
}
