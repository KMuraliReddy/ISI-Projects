using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
    class Tree :ITimePassable
    {
        static float growthRate = 3;
        public float height { get; private set; }

        public void TimePasses(int years)
        {
            throw new NotImplementedException();
        }
    }
}
