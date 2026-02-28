#include <iostream>
#include <string>
#include "Account.h"
using namespace std;

Account::Account()
{
    balance = 0;
}

// Setters
void Account::setAccNo(int accNo)
{
    this->accNo = accNo;
}
void Account::setName(string name)
{
    this->name = name;
}
void Account::setBalance(double balance)
{
    this->balance = balance;
}

// Getters
int Account::getAccNo() const
{
    return accNo;
}
string Account::getName() const
{
    return name;
}
float Account::getBalance() const
{
    return balance;
}

// Behaiviors
void Account::deposit(int amount)
{
    balance += amount;
    cout << "Success" << endl;
}

void Account::withdraw(int amount)
{
    if (amount > balance)
    {
        cerr << "Insufficient Balance" << endl;
        cerr << "Failed" << endl;
        return;
    }
    else
    {
        balance -= amount;
        cout << "Success" << endl;
        cout << "Collect your Money" << endl;
    }
}

void Account::createAccount()
{
    cout << "Create Account" << endl;
    cout << "Account No : ";
    cin >> accNo;
    cout << "Name       :";
    cin >> name;
}
void Account::displayAccountDetails()
{
    cout << "Account Details" << endl;
    cout << "Account No   :" << accNo << endl;
    cout << "Account name :" << name << endl;
    cout << "Balance      :" << balance << endl;
}
void Account::accountMenuDrive()
{
    Account a;
    a.setAccNo(1234);
    a.setName("Navin");
    a.setBalance(0);
    int num;
    do
    {
        cout << "------------------------------------------------" << endl;
        cout << "1 Deposite Money" << endl;
        cout << "2 Withdraw Money" << endl;
        cout << "3 Display the Account Details" << endl;
        cout << "4 Exit Program" << endl;
        cout << "------------------------------------------------" << endl;
        cout << endl;

        cout
            << "Enter Number: ";
        cin >> num;

        int amount;

        switch (num)
        {
        case 1:
            cout << "Enter Amount: ";
            cin >> amount;
            a.deposit(amount);
            break;

        case 2:
            cout << "Enter Amount: ";
            cin >> amount;
            a.withdraw(amount);
            break;

        case 3:
            a.displayAccountDetails();
            break;

        case 4:
            cout << "EXIT" << endl;
            break;

        default:
            cerr << "Invalid Number" << endl;
            break;
        }

    } while (num != 4);
}
