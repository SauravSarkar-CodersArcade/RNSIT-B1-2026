#include<iostream>
#include<forward_list>
using namespace std;
int main(){
    // Singly Linked List
    // No insertion via tail
    forward_list<int> flist = {10, 20, 30};
    flist.push_front(5);
    flist.push_front(0);
    for(auto x : flist){
        cout << x << " ";
    }
    cout << endl;
    // Write the actual meaning of the auto keyword :
    for(forward_list<int>::iterator it = flist.begin();
    it != flist.end(); ++it){
        cout << *it << " ";
    }cout << endl;
}