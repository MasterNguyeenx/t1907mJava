namespace GeometryExample.Exercise2
{
    public class Program
    {
        public static void Main(string[] args)
        {
            string name;
            int weight;
            Lion l = new Lion("Lion", 100);
            Tiger t =new Tiger("Tiger", 200);
            l.Show();
        //    t.SetMe("Tiger" , 200);
            t.Show();
        }
    }
}