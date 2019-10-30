using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
   static class TimeManager
    {
        public static List<ITimePassable> timePassables = new List<ITimePassable>();
    public  static void TimePasses(int years)
        {
            foreach(ITimePassable iTP in timePassables)
            {
                iTP.TimePasses(years);
            }
        }
    }
}
