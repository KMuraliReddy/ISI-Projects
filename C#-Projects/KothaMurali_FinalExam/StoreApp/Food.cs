using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreApp
{
    class Food : Merchandise
    {
      
        public Food(int _price,string type) : base(_price, type)
        {
            
        }

        public override string ReturnItemInfo()
        {
            return base.ReturnItemInfo() + ": Type Is : Food";
        }
    }
}
