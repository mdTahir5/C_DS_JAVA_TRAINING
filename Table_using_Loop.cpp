#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    cout<<"Enter the Number"<<endl;
    int num;
    cin>>num;
    for(int i=1; i<=10; i++){
        cout<<num<<" X "<<i<<" = "<<num*i<<endl;
    }   
    return 0;
}