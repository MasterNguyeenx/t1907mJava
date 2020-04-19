using System;
using System.Collections.Generic;


namespace ConsoleApp1.Product2
{
    public class Product2
    {
        private int id;
        private string name;
        private int price;
        private int qty;
        private string image;
        private string desc;
        private List<String> gallery = new List<String>();
        List<Product2> listProducts = new List<Product2>();

        public Product2() {}
        public Product2(int id, string name, int price, int qty, string image, string desc)
        {
            this.id = id;
            this.name = name;
            this.price = price;
            this.qty = qty;
            this.image = image;
            this.desc = desc;
        }

        public int Id
        {
            get => id;
            set => id = value;
        }

        public string Name
        {
            get => name;
            set => name = value;
        }

        public int Price
        {
            get => price;
            set => price = value;
        }

        public int Qty
        {
            get => qty;
            set => qty = value;
        }

        public string Image
        {
            get => image;
            set => image = value;
        }

        public string Desc
        {
            get => desc;
            set => desc = value;
        }
        
        
        public void addProduct()
        {
            Console.WriteLine("Enter id : ");
            int id = Convert.ToInt16(Console.ReadLine());
            Console.WriteLine("Enter name : ");
            string name = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter price : ");
            int price = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter qty : ");
            int qty = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter image : ");
            string image = Convert.ToString(Console.ReadLine());
            Console.WriteLine("Enter desc : ");
            string desc = Convert.ToString(Console.ReadLine());


            Product2 product = new Product2(id, name, price, qty, image, desc);
            listProducts.Add(product);
        }

        public void showListProducts()
        {
            foreach (Product2 product in listProducts)
            {
                Console.WriteLine("Id : "+product.Id+" | Name : "+product.Name+" | Price : "+product.Price+" | Qty : "+product.Qty+" | Image : "+product.Image+" | Desc : "+product.Desc);
            }
        }

        public void getInStock()
        {
            if (listProducts.Count > 0) {
                Console.WriteLine("There are "+ listProducts.Count +" products in stock .");
            }
            else
            {
                Console.WriteLine("Out of stock !");
            }
        }

        public void getaddImage()
        {
            
            if(gallery.Count <10)
            {
                foreach (Product2 rProduct in listProducts)
                {
                    gallery.Add(rProduct.image);
                }
                Console.WriteLine("Add success to the gallery .");
                Console.WriteLine("Gallery List:");
                foreach (String str in gallery)
                {
                    Console.WriteLine(str);   
                }
            }
            else
            {
                Console.WriteLine("Maximum 10 photos !");
            }
            
        }
        
        public void getRemoveImage()
        {
            Console.WriteLine("Gallery List:");
            for(int i=0;i<gallery.Count;i++)
            {
                Console.WriteLine("STT:"+(i+1)+"\tImage Name: "+gallery[i]);
            }
            int index;
            Console.WriteLine("Enter the location you want to delete :");
            index = Convert.ToInt32(Console.ReadLine());
            for (int i = 0; i < gallery.Count; i++)
            {
                if (i == index)
                {
                    gallery.RemoveAt(index-1);
                    Console.WriteLine("delete successful !");
                    Console.WriteLine("Gallery List:");
                    foreach (String str in gallery)
                    {
                        Console.WriteLine(str);
                    }
                }
            }
        }
    }
}