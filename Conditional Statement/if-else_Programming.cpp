#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int num;
    cin>>num;
    if(num > 10)
    cout<<"Entered Number is Greater than 10\n";
    else if(num == 10)
    cout<<"Entered Number is Equal to 10\n";
    else
    cout<<"Entered Number is Less than 10\n";
    return 0;
}