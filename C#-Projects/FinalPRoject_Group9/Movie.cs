using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Movie : Media
    {
      
        
        public float runTime { get; private set; }
        
        public Movie(float Runtime,string Title,string type):base(Title,"Movie")
        {
            runTime = Runtime;
           


        }
    }
}
