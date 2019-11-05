using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreApp
{
    abstract class Merchandise
    {
       public int Price { get; set; }
        public string Item { get; set; }
        public int SerialNumber { get; set; }
        public static int UniqueId=0;
        public Merchandise(int _price,string _item)
        {
            Price = _price;
            Item = _item;

            SerialNumber = UniqueId + 1;
            UniqueId++;
        }
        public virtual  string ReturnItemInfo()
        {
            return Item+": Price Is "+ Price.ToString();
        }
    }
}

