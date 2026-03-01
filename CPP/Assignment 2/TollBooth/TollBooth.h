#include <iostream>
#include <string>
using namespace std;

class TollBooth
{

    int totalVehicle;
    double totalRevenue;
    int Cars;
    int Buses;
    int trucks;

public:
    TollBooth();

    // void setTotalVehivle(int totalVehicle);
    // void setTotalRevenue();

    int getTotalVehicles();
    double getTotalRevenue();

    void reset();
    void vehiclePayingToll(int vehicleType, double tollAmount);
    void displayTollrates();

    void tollBoothMenuDrivenFunctions();
};