using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Book : Media
    {
       
        public int pageCount { get; private set; }
       
        
        public Book(string title,string type,int pagecount):base(title,type)
        {
            pageCount = pagecount;
         
            
        }
        public override string MediaInfo()
        {
            return base.MediaInfo() +""+pageCount;
        }
    }
}
