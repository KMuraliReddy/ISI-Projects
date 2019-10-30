using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExercise
{
    class Robot : ITalkable
    {
        public void Talk()
        {
            Console.WriteLine("The Given Object Might Say Beep-Beep");

        }
    }
}
