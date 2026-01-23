#include<iostream>
using namespace std;
class Demo {
    
    
    double d; // 8 bytes
    int i; // 4 bytes
    short s; // 2 bytes
    char c; // 1 byte
};
int main(){
    Demo obj;
    cout << "Size of the class: " << sizeof(obj) << " Bytes" << endl; 
    return 0;
}