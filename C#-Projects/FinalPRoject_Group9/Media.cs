using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    abstract class Media
    {
        public int title { get; private set; }
        public string mediaType { get; private set; }
        public int serialNumber { get; private set; }
        public int numberOfTimesLent { get; private set; } =0;
        public bool isAvailable { get; private set; } = true;
        public string libraryMember { get; private set; }
        public Media()
        {

        }

        public void addDataToDataGrid()
        {

        }

    }
}
