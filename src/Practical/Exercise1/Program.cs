using System;

namespace GeometryExample
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            double radius;
            double height;
            Cylinder c = new Cylinder();
            Console.WriteLine("Enter Radius: ");
            radius = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Enter Height: ");
            height = Convert.ToDouble(Console.ReadLine());
            c.Process(radius , height);
            c.Result();
        }
    }
}