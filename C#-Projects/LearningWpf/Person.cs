using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningWpf
{
    class Person
    {
        public string FirstName { get; private set; }
        public string LastName { get; private set; }

        public Boolean IsAlive { get; private set; } = true;
        public Person(string fName,string lName)
        {
            FirstName = fName;
            LastName = lName;

        }
    }
}
