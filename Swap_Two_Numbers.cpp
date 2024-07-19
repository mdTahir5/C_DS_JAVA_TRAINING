#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int a = 5, b = 7;
    cout<<"Before Swap : "<<endl;
    cout<<"a = "<<a<<"  "<<"b = "<<b<<endl;
    int temp = a;
    a = b;
    b = temp;
    cout<<"After Swap : "<<endl;
    cout<<"a = "<<a<<"  "<<"b = "<<b;   
    return 0;
}

