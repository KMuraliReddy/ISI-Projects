using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Magazine : Book
    {
        public int PageCount;
        public Magazine(string title,string type,int pageCount) : base(title,"Magazine", pageCount)
        {
            PageCount = pageCount;
            

        }
        public override string MediaInfo()
        {
            return base.MediaInfo()+""+pageCount;
        }
    }
}
