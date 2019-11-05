using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreApp
{
    class Clothing : Merchandise
    {
        
   
        public Clothing(int _price,string _type) : base(_price,_type)
        {
            

        }

        public override string ReturnItemInfo()
        {
            return base.ReturnItemInfo()+ " :  Type Is : Clothing";
        }
    }
}
