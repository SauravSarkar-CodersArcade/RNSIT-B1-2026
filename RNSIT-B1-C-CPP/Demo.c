#include<stdio.h>
#include<stdbool.h>
#define rnsit main 
#define PI 3.14
enum boolean {
    FALSE=10, TRUE
};
int rnsit(){
    bool status = true;
    printf("%d\n", status);
    enum boolean data = TRUE;
    printf("%d\n", data);
    printf("The size of enum: %d\n", sizeof(data));
    printf("The size of enum: %llu\n", sizeof(data));
    printf("Address of status: %p\n", &status);
    printf("Address of status: %x", &status);
    return 0;
}