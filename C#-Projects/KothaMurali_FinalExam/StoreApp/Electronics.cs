using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StoreApp
{
    class Electronics : Merchandise
    {
      
        public Electronics(int _price,string _type) : base(_price, _type)
        {
            
        }

        public override string ReturnItemInfo()
        {
            return base.ReturnItemInfo() + ": Type Is : Electronics";
        }
    }
}
