using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Book : Media
    {
        public string Title { get; private set; }
        public string pageCount { get; private set; }
        public Boolean IsAvailable { get;  set; }
        public string Type { get; private set; }
        public Book(string bookTitle,string type,bool isAvilable)
        {
            Title = bookTitle;
            Type = type;
            IsAvailable = isAvilable;
        }
    }
}
