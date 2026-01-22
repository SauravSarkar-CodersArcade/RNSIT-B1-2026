#include<stdio.h>
int * function(){
    static int a = 10; // 0x1000  // Global - only inside the same file
    return &a; // 0x1000
}
int main(){
    int *ptr = function(); // 0x1000
    printf("Value of a: %d\n", *ptr); // de-referencing
}