namespace Question_3
{
    class Employee
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public decimal Salary { get; set; }
        public virtual void Show()
        {
            Console.WriteLine("Name: " + this.Name + ", Age: " + this.Age + ", Salary: " + this.Salary);
        }

        public override string ToString()
        {
            string st = "Name: " + this.Name + ", Age: " + this.Age + ", Salary: " + this.Salary;
            return st;
        }


    }

    class Manager : Employee
    {
        public string Dept { get; set; }
        public override string ToString()
        {
            return "Name: " + this.Name + ", Age: " + this.Age + ", Salary: " + this.Salary + ", Dept: " + this.Dept;

        }
    }

    class Developer : Employee
    {
        public string ProgLang { get; set; }

        public override string ToString()
        {
            return "Name: " + this.Name + ", Age: " + this.Age + ", Salary: " + this.Salary + ", Programming Lang: " + this.ProgLang;

        }
    }

    static class CalculateSalary
    {
        public static void CalculateAnnualSalary(Employee emp)
        {
            decimal anualSalary = emp.Salary * 12;
            Console.WriteLine("Annual Salary of Employee " + emp.Name + " is " + anualSalary);
        }

        public static void CalculateBonus(Employee emp)
        {
            decimal bonus = (decimal)(emp.Age * 0.01) * emp.Salary;
            Console.WriteLine("Bonus of Employee " + emp.Name + " is " + bonus);
        }

        public static void CalculateBonus(Employee emp, decimal bonus)
        {
            Console.WriteLine("Bonus of Employee " + emp.Name + " is " + bonus);
        }
        public static void CalculateBonus(Employee emp, float percentage)
        {
            decimal bonus = (emp.Salary * (decimal)(percentage / 100));
            Console.WriteLine("Bonus of Employee " + emp.Name + " is " + bonus);
        }
    }

    interface IProject
    {
        public void StartProject(string projectName)
        {
            Console.WriteLine(projectName + " has Started");
        }
    }

    abstract class ProjectManager : IProject
    {
        public abstract void AssignTask(Employee emp, string task);
    }

    class TechnicalProjectManager : ProjectManager
    {
        public override void AssignTask(Employee emp, string task)
        {
            Console.WriteLine(task + " task has been assigned to Developer " + emp.Name);
        }
    }

    class HRProjectManager : ProjectManager
    {
        public override void AssignTask(Employee emp, string task)
        {
            Console.WriteLine(task + " task has been assigned to HR " + emp.Name);
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            // Employee instance
            Employee e1 = new Employee() { Name = "Navin", Age = 25, Salary = 40235.24M };
            // Manager Instance
            Manager m1 = new Manager() { Name = "Vinit", Age = 30, Salary = 50000.53M, Dept = "IT" };
            // Developer instance
            Developer d1 = new Developer() { Name = "Kalpesh", Age = 20, Salary = 45000.53M, ProgLang = "Javascript" };

            // calling ToString() override method
            Console.ForegroundColor = ConsoleColor.Magenta;
            Console.WriteLine(e1);
            Console.WriteLine(m1);
            Console.WriteLine(d1);
            Console.ResetColor();

            Console.WriteLine("===================================");

            Console.ForegroundColor = ConsoleColor.Green;
            // Calculating annual salary of all emps
            CalculateSalary.CalculateAnnualSalary(e1);
            CalculateSalary.CalculateAnnualSalary(m1);
            CalculateSalary.CalculateAnnualSalary(d1);
            Console.ResetColor();

            Console.WriteLine("===================================");

            Console.ForegroundColor = ConsoleColor.Green;
            // CalculateBonus is overloaded method in static CalculateSalary class
            CalculateSalary.CalculateBonus(e1);
            CalculateSalary.CalculateBonus(e1, 15000M);
            CalculateSalary.CalculateBonus(e1, 25.5f);
            Console.ResetColor();

            Console.WriteLine("===================================");

            Console.ForegroundColor = ConsoleColor.Blue;
            TechnicalProjectManager tpm = new TechnicalProjectManager();
            tpm.AssignTask(d1, "Start working on MERN stack");

            HRProjectManager hpm = new HRProjectManager();
            hpm.AssignTask(e1, "Start recruiting process");
            Console.ResetColor();
        }
    }
}
