namespace Assignment2
{
    abstract class Shape
    {
        public string Name { get; set; }
        public float Area { get; set; }
        public abstract float CalculateArea();
    }

    class Circle : Shape
    {
        public float Radius { get; set; }

        public override float CalculateArea()
        {
            this.Area = (float)Math.PI * this.Radius * this.Radius;
            return Area;
        }
    }

    class Rectangle : Shape
    {
        public float Length { get; set; }
        public float Breadth { get; set; }

        public override float CalculateArea()
        {
            this.Area = this.Length * this.Breadth;
            return this.Area;
        }
    }

    internal class Program
    {
        static void Main(string[] args)
        {
            // Instance of Circle
            Circle c1 = new Circle() { Name = "Circle", Radius = 10.5f };
            c1.CalculateArea();
            Console.WriteLine("Shape: " + c1.Name + ", Area: " + c1.Area);

            //Instance of Rectangle
            Rectangle r1 = new Rectangle() { Name = "Rectangle", Length = 15.3f, Breadth = 10.2f };
            r1.CalculateArea();
            Console.WriteLine("Shape: " + r1.Name + ", Area: " + r1.Area);

        }
    }
}
