using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreApp
{
    static class Store
    {
       public  static List<Merchandise> forSale = new List<Merchandise>()
        {
            new Food(20,"noodles"),
            new Food(20,"biryani"),
            new Food(30,"idly"),
            new Food(50,"Dosa"),
            new Food(60,"Poori"),
            new Clothing(20,"Denim"),
            new Clothing(30,"Shirt"),
            new Clothing(50,"T shirt"),
            new Clothing(60,"Jacket"),
            new Clothing(80,"Gloves"),
            new Electronics(250,"MacBook"),
            new Electronics(200,"IPhone"),
            new Electronics(300,"Dell Laptop"),
            new Electronics(400,"Lenovo"),
            new Electronics(120,"Redmi")
        };
        
      public   static List<Merchandise> shoppingCart = new List<Merchandise>();
        public static int totalPrice = 0;
    }
}
