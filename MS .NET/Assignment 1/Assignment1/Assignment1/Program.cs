using Microsoft.VisualBasic;
using System.ComponentModel;

namespace Assignment1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            question9();
        }

        static void question1()
        {

            /*   Q1.Implicit Numeric Conversion
               Write a C# program to:
                Declare an int variable
                Assign it to a long variable using implicit conversion
                Display both values
   */
            int intNum = 67;
            long longNum = intNum;

            Console.WriteLine("int: " + intNum);
            Console.WriteLine("long: " + longNum);
        }

        static void question2()
        {
            /* Q2.Explicit Numeric Casting
             Write a program that:
              Converts a double value to int using explicit casting
              Displays both original and converted values*/

            double doubleNum = 1452.3;
            int intNum = (int)doubleNum;

            Console.WriteLine("doubleNum: " + doubleNum);
            Console.WriteLine("intNUm: " + intNum);
        }

        static void question3()
        {
            /*
             * Q3. Widening Conversion
               Write a program to convert:
                byte → int → long → double
                Display values at
             */

            byte byteNum = 123;
            int intNum = byteNum;
            long longNum = intNum;
            double doubleNum = longNum;

            Console.WriteLine("byteNum: " + byteNum);
            Console.WriteLine("intNum: " + intNum);
            Console.WriteLine("longNum: " + longNum);
            Console.WriteLine("doubleNum: " + doubleNum);

        }

        static void question4()
        {
            /*
             * Q4. Narrowing Conversion
               Write a program to convert:
                double → int → short
                Use explicit casting and display results
            */

            double d = 212.3156;
            int i = (int)d;
            short s = (short)i;
            Console.WriteLine("double: " + d);
            Console.WriteLine("int: " + i);
            Console.WriteLine("short: " + s);
        }

        static void question5()
        {
            /*
             * Q5. Decimal to Integer Conversion
               Write a program that:
                Converts a decimal value to int
                Shows the effect of data loss during conversion
             */

            decimal d = 4563.1245M;
            int i = (int)d;
            Console.WriteLine("decimal value before conversion: " + d);
            Console.WriteLine("decimal value after conversion: " + i);
        }

        static void question6()
        {
            /*
             * Q6. Char to Integer Conversion
                Write a program that:
                 Converts a char value to int
                 Displays the ASCII/Unicode value
             */

            char c = 'A';
            int i = c;

            Console.WriteLine("char is " + c);
            Console.WriteLine("Ascii value is " + i);
        }

        static void question7()
        {
            /* Q7.Integer to Char Conversion
             Write a program that:
              Converts an int value to char
              Displays the corresponding character*/

            int i = 110;
            char c = (char)i;

            Console.WriteLine("Int is " + i);
            Console.WriteLine("Char is " + c);
        }

        static void question8()
        {
            /* Q8.String to Value Type using Parse
             Write a program that:
             Accepts a numeric string
             Converts it to int using int.Parse()*/

            Console.WriteLine("Enter Numeric String");
            string s = Console.ReadLine();
            int i = int.Parse(s);

            Console.WriteLine("Numeric String is " + s);
            Console.WriteLine("Number is " + i);
        }

        static void question9()
        {
            /*Q9.String to Value Type using TryParse
                Write a program that:
                 Accepts user input
                 Converts it to double using double.TryParse()
                 Displays success or failure message
            */

            Console.Write("Enter Number: ");
            string s = Console.ReadLine();
            double d;
            if (double.TryParse(s, out d))
            {
                Console.ForegroundColor = ConsoleColor.Green;
                Console.WriteLine("Successfully Converted: " + d);
                Console.ResetColor();
            }
            else
            {
                Console.ForegroundColor = ConsoleColor.Red;
                //Console.BackgroundColor = ConsoleColor.Yellow;
                Console.WriteLine("Failed to convert: " + s);
                Console.ResetColor();
            }

        }

        static void question10()
        {
            /* Q10.Boolean Conversion
             Write a program that:
              Converts a string value "true" or "false" to bool
              Displays the converted result*/

            Console.Write("Enter true or false: ");
            string s = Console.ReadLine();

            bool b = bool.Parse(s);
            Console.WriteLine("Input String: " + s);
            Console.WriteLine("Boolean converted: " + b);

        }
    }

}
