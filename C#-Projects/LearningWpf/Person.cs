using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningWpf
{
    public enum Occupation { Juvenile, Student, Professional, Retired }
    class Person
    {
        public string FirstName { get; private set; }
        public string LastName { get; private set; }
       
        public Boolean IsAlive { get; private set; } = true;
        public Occupation CurrentOcuupation { get; private set; }
        public Person(string fName,string lName,Occupation occupation)
        {
            FirstName = fName;
            LastName = lName;
            CurrentOcuupation = occupation;

        }
    }
}
