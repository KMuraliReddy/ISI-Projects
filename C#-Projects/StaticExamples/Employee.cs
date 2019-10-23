using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticExamples
{

    class Employee
    {
        static int nextUniqueId = 0;
        public int uniqueID;
        public Employee()
        {
            uniqueID = nextUniqueId++;
        }
    }
      
    }

  

