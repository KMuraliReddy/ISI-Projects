using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FinalPRoject_Group9
{
    class Movie : Media
    {
        public string Title { get; private set; }
        public Boolean IsAvailable { get;  set; }
        public string Type { get; private set; }
        public float runTime { get; private set; }
        public Movie(string movieTitle,string type,bool isAvilable)
        {
            Title = movieTitle;
            Type = type;
            IsAvailable = isAvilable;


        }
    }
}
