#include<iostream>
using namespace std;
class Student {
public:    
    string name;
    int age;
    string email;
    Student(string name, int age, string email){
        this->name = name;
        this->age = age;
        this->email = email;
    }
    void studentDetails(){
        cout << name << endl;
        cout << age << endl;
        cout << email << endl;
    }
    ~Student(){
        cout << "Object Destroyed!" << endl;
    }
};
int main(){
    Student s1("Saurav", 22, "saurav@gmail.com");
    Student s2 = Student("Rahul", 22, "rahul@gmail.com");
    s1.studentDetails();
    s2.studentDetails();
    return 0;
}