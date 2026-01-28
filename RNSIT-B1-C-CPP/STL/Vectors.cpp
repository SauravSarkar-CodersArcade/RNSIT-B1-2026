#include<iostream>
#include<vector>
class Person {
    public:
    string Name;
    int Age;
    Person(string name, int age){
        Name = name;
        Age = age;
    }
};
using namespace std;
int main(){
    vector<int> numbers = {1,2,3,4,5};
    vector<int> num(3, 10); // 10,10,10
    num.push_back(5);
    num.emplace_back(100);
    for(auto x : num){
        cout << x << " ";
    }cout << endl;

    vector<Person> people;
    // The push_back() needs data source
    people.push_back(Person("Rahul", 21));
    // The emplace_back() creates the object in place
    people.emplace_back("Samar", 22); 
    return 0;
}