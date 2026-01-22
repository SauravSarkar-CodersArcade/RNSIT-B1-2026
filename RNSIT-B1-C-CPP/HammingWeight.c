#include<stdio.h>
int hammingWeight(int n){
    int count = 0;
    while(n != 0){
        if(n & 1){
            count++;
        }
        n = n >> 1;
    }
    return count;
}
int main(){
    printf("Hamming Weight of 11: %d\n", hammingWeight(11));
    printf("Hamming Weight of 5: %d\n", hammingWeight(5));
    return 0;
}