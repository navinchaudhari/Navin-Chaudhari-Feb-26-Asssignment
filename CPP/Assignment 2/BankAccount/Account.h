#include <iostream>
#include <string>
using namespace std;

class Account
{
    int accNo;
    string name;
    double balance;
   

public:
    Account();
    // Setters
    void setAccNo(int accNo);
    void setName(string name);
    void setBalance(double balance);

    // Getters
    int getAccNo() const;
    string getName() const;
    float getBalance() const;

    // Behaiviors
    void deposit(int amount);

    void withdraw(int amount);

    void createAccount();
    void displayAccountDetails();
    void accountMenuDrive();
};