using System;

namespace GeometryExample
{
    public class Cylinder
    {
        private double radius;
        private double height;
        private double baseArea;
        private double lateralArea;
        private double totalArea;
        private double volume;


        public Cylinder(double radius, double height, double baseArea, double lateralArea, double totalArea, double volume)
        {
            this.radius = radius;
            this.height = height;
            this.baseArea = baseArea;
            this.lateralArea = lateralArea;
            this.totalArea = totalArea;
            this.volume = volume;
        }

        public Cylinder()
        {
        }

        public double Radius
        {
            get => radius;
            set => radius = value;
        }

        public double Height
        {
            get => height;
            set => height = value;
        }

        public double BaseArea
        {
            get => baseArea;
            set => baseArea = value;
        }

        public double LateralArea
        {
            get => lateralArea;
            set => lateralArea = value;
        }

        public double TotalArea
        {
            get => totalArea;
            set => totalArea = value;
        }

        public double Volume
        {
            get => volume;
            set => volume = value;
        }

        public void Process(double radius, double height)
        {
             BaseArea = radius * radius * Math.PI;
             LateralArea = 2 * Math.PI * radius * height; 
             TotalArea = 2 * Math.PI * radius * (height + radius);
             Volume = Math.PI * radius * radius * height;
        }

        public void Result()
        {
            Console.WriteLine("Cylinder");
            Console.WriteLine("Radius:" + Radius + "," + "Height:" + Height);
            Console.WriteLine("Base: " + Math.Round(BaseArea,2) + "\n" + "LateraArea: " + Math.Round(LateralArea,2)+  "\n" +"Total: "  + Math.Round(TotalArea,2) + "\n" + "Vomlume: " + Math.Round(Volume,2));
        }
        
    }
}