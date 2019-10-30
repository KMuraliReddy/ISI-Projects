using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExercise
{
    class Parrot : Animal, ITalkable
    {
        public void Talk()
        {
            Console.WriteLine("The Given Object Might Say Kuuuuuuuu");        }
    }
}
