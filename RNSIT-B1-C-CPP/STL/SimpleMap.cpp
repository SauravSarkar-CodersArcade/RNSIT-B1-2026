#include<iostream>
#include<unordered_map>
using namespace std;
int main(){
    // States - Languages
    unordered_map<string, string> stateLanguages;
    stateLanguages.insert(pair<string, string>("Karnataka", "Kannada"));
    stateLanguages.insert(pair<string, string>("Maharashtra", "Marathi"));
    stateLanguages.insert(pair<string, string>("Kerala", "Malayalam"));
    stateLanguages.insert(pair<string, string>("Assam", "Assamese"));
    stateLanguages["West Bengal"] = "Bengali";
    stateLanguages.erase("Kerala");
    // stateLanguages.clear(); // Deletes everything
    for(auto data : stateLanguages){
        cout << "State: " << data.first << ", Language: " << data.second << endl;
    }

}