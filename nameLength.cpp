#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    string name;
    getline(cin,name);
    int l=0, i=0;
    while(name[i] != '\0'){
        l++;
        i++;
    }
    cout<<l;
    return 0;
}