using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InterfaceExercise
{
    class Human : Animal, ITalkable
    {
        public virtual void Talk()
        {
            throw new NotImplementedException();
        }
    }
}
