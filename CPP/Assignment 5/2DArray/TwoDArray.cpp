#include <iostream>
#include <string>
using namespace std;
class TwoDArray
{
private:
    int rowSize;
    int colSize;
    int **array;

public:
    TwoDArray() : rowSize(0) {}
    TwoDArray(int rowSize, int colSize) : rowSize(rowSize), colSize(colSize)
    {
        array = new int *[rowSize];
        for (int i = 0; i < rowSize; i++)
        {
            array[i] = new int[colSize];
        }
    }

    int **inputArrray()
    {
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < colSize; j++)
            {
                cin >> array[i][j];
            }
        }
    }

    TwoDArray &operator+(TwoDArray &second)
    {
        // TwoDArray temp(this->rowSize, this->colSize);
        for (int i = 0; i < this->rowSize; i++)
        {
            for (int j = 0; j < this->colSize; j++)
            {
                this->array[i][j] = (this->array[i][j] + second.array[i][j]);
            }
        }
        return *this;
    }

    ~TwoDArray()
    {
        for (int i = 0; i < rowSize; i++)
        {
            delete[] array[i];
        }
        delete[] array;
    }

    friend istream &operator>>(istream &is, TwoDArray &td);
    friend ostream &operator<<(ostream &os, TwoDArray &td);
    friend bool operator==(TwoDArray &lhs, TwoDArray &rhs);
};
istream &operator>>(istream &is, TwoDArray &td)
{
    cout << "Enter Elements: ";
    for (int i = 0; i < td.rowSize; i++)
    {
        for (int j = 0; j < td.colSize; j++)
        {
            is >> td.array[i][j];
        }
    }
    return is;
}

ostream &operator<<(ostream &os, TwoDArray &td)
{
    for (int i = 0; i < td.rowSize; i++)
    {
        for (int j = 0; j < td.colSize; j++)
        {
            os << td.array[i][j] << " ";
        }
        os << endl;
    }

    return os;
}

bool operator==(TwoDArray &lhs, TwoDArray &rhs)
{
    for (int i = 0; i < lhs.rowSize; i++)
    {
        for (int j = 0; j < lhs.colSize; j++)
        {
            if (lhs.array[i][j] != rhs.array[i][j])
            {
                return false;
            }
        }
    }
    return true;
}

int main(void)
{

    TwoDArray t1(2, 2);
    TwoDArray t2(2, 2);

    // Inserting element by operator>> overloading
    cin >> t1 >> t2;

    cout << "First Matrix" << endl;
    cout << t1;
    cout << "Second Matrix" << endl;
    cout << t2;

    // Compare Matrix using operator== overloading
    if (t1 == t2)
        cout << "Both matrix are same" << endl;
    else
        cout << "Both matrix are different" << endl;

    // Adding two matrix sum in third matrix using operator+ overloading
    //  cout << "Third Object using matrix+" << endl;
    //  TwoDArray t3 = t1 + t2;
    //  cout << t3;

    return 0;
}
