using System;

namespace ConsoleApp1.Product2
{
    public class Test
    {
        public static void Main(string[] args)
        {
            Product2 product2 = new Product2();
            while (true)
            {
                Console.WriteLine("----------  Product ---------- ");
                Console.WriteLine("1 . add ");
                Console.WriteLine("2 . display ");
                Console.WriteLine("3 . In stock");
                Console.WriteLine("4 . add image in gallery ");
                Console.WriteLine("5 . remove image in gallery ");
                Console.WriteLine("Enter  : ");
                switch (Convert.ToInt32(Console.ReadLine()))
                {
                    case 1:
                        product2.addProduct();
                        break;
                    case 2:
                        product2.showListProducts();
                        break;
                    case 3:
                        product2.getInStock();
                        break;
                    case 4:
                        product2.getaddImage();
                        break;
                    case 5:
                        product2.getRemoveImage();
                        break;
                    default:
                        Console.WriteLine("the end !");
                        break;
                }
            }
        }
    }
}