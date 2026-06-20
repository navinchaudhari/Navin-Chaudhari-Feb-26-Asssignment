namespace Question_2
{
    abstract class Vehicle
    {
        public string Brand { get; set; }
        public int Year { get; set; }

        public abstract void Accelerate();
        public abstract void Brake();

        public void Show()
        {
            Console.WriteLine("Brand: " + this.Brand + ", Year: " + this.Year);
        }
    }

    class Car : Vehicle
    {
        public override void Accelerate()
        {
            Console.WriteLine("Car is Accelerating");
        }

        public override void Brake()
        {
            Console.WriteLine("Car is Breaking");
        }
    }

    class Motorcycle : Vehicle
    {
        public override void Accelerate()
        {
            Console.WriteLine("Motorcycle is accelerating");
        }

        public override void Brake()
        {
            Console.WriteLine("Motorcycle Braking");
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            // CXreating instance of Car
            Console.WriteLine("************ All About cars ************");
            Car c1 = new Car() { Brand = "Mahindra", Year = 2025 };
            c1.Show();
            c1.Accelerate();
            c1.Brake();

            Console.WriteLine("************ All About Motorcycle ************");
            Motorcycle m1 = new Motorcycle() { Brand = "Royal Enfield", Year = 2026 };
            m1.Show();
            m1.Accelerate();
            m1.Brake();

        }
    }
}
