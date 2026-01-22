#include<iostream> // Continuous flow of 1s & 0s (Stream)
using namespace std;
namespace mohith{
    int x = 100;
void add(int a, int b){
    cout << a+b << endl;
}
}
namespace sangeetha{
    int x = 200;
void add(int a, int b){
    cout << a+b << endl;
}
}
int main(){
    cout << "RNSIT" << endl;
    mohith::add(1,2);
    sangeetha::add(2,3);
    string name;
    cout << "Enter your name: " << endl;
    getline(cin, name);
    cout << name << endl;
    cout << "Max Integer Value: " << INT_MAX << endl;
    cout << "Min Integer Value: " << INT_MIN << endl;
    cout << "Max Integer Value + 1: " << INT_MAX + 1 << endl;
    cout << "Min Integer Value - 1: " << INT_MIN - 1 << endl;
    return 0;
}