using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    abstract class Media
    {
        public string title { get; private set; }
        public string mediaType { get; private set; }
        public int serialNumber { get; private set; }
        public int numberOfTimesLent { get; private set; }
        public bool isAvailable { get; set; } = true;
        public string libraryMember { get;  set; }
        public Media(string title,string type)
        {
            this.title = title;
            mediaType = type;
        }

        public void addDataToDataGrid()
        {
           
        }

    }
}
