using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Magazine : Book
    {
        public string Title { get; private set; }
        public Boolean IsAvailable { get;  set; }
        public string Type { get; private set; }
        public Magazine(string magazineTitle,string type,bool isAvilable) : base(magazineTitle,type,isAvilable)
        {
            Title = magazineTitle;
            Type = type;
            IsAvailable = isAvilable;

        }
    }
}
