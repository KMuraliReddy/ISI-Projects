using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
    class Person : ITimePassable
    {
        public int Age { get; private set; }
        public Person(int initialAge)
        {
            Age = initialAge;
        }
        public void TimePasses(int years)
        {
            Age += years;

        }
        public void Display()
        {
            Console.WriteLine("Age" + Age);
        }
    }
}
