#include <iostream>
#include <string>
#include <iomanip>
#include "TollBooth.h"
using namespace std;

TollBooth::TollBooth()
{
    totalVehicle = 0;
    totalRevenue = 0.0;
    Cars = 0;
    Buses = 0;
    trucks = 0;
}

int TollBooth::getTotalVehicles()
{
    return totalVehicle;
}
double TollBooth::getTotalRevenue()
{
    return totalRevenue;
}

void TollBooth::reset()
{
    totalVehicle = 0;
    totalRevenue = 0.0;
    Cars = 0;
    Buses = 0;
    trucks = 0;
}
void TollBooth::vehiclePayingToll(int vehicleType, double tollAmount)
{
    totalRevenue += tollAmount;
    totalVehicle++;
    vehicleType == 1 ? Cars++ : vehicleType == 2 ? trucks++
                                                 : Buses++;
}

void TollBooth::displayTollrates()
{
    cout << "Numbers    " << "Vehicle Type   " << "Amount" << endl;
    cout << "1" << setw(14) << "Cars" << setw(17) << "Rs 180" << endl;
    cout << "2" << setw(15) << "Truck" << setw(16) << "Rs 300" << endl;
    cout << "3" << setw(15) << "Buses" << setw(16) << "Rs 350" << endl;
}

void TollBooth::tollBoothMenuDrivenFunctions()
{

    TollBooth t;
    int num;
    do
    {
        cout << "------------------------------------------------" << endl;
        cout << endl;
        cout << "        Toll Rates       " << setw(5) << endl;
        t.displayTollrates();
        cout << "------------------------------------------------" << endl;
        cout << "------------------------------------------------" << endl;
        cout << "4 Display total cars passed" << endl;
        cout << "5 Display total revenue collected" << endl;
        cout << "6 Reset booth statistics" << endl;
        cout << "7 for Exit Program" << endl;
        cout << "------------------------------------------------" << endl;

        cout
            << "Enter Number: ";
        cin >> num;

        switch (num)
        {
        case 1:
            t.vehiclePayingToll(num, 180);
            break;

        case 2:
            t.vehiclePayingToll(num, 300);
            break;

        case 3:
            t.vehiclePayingToll(num, 350);
            break;

        case 4:
            cout << "Total Number of  Vehicle: " << t.getTotalVehicles() << endl;
            break;

        case 5:
            cout << "Total Revenue Collected: Rs " << t.getTotalRevenue() << endl;
            break;

        case 6:
            t.reset();
            break;

        case 7:
            cout << "EXIT" << endl;
            break;

        default:
            cerr << "Invalid Number" << endl;
            break;
        }

    } while (num != 7);
}