using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LearningWpf
{
    class PeopleManager
    {
     public  static List<Person> people = new List<Person>()
        {
        new Person("Eric","ttttt",Occupation.Juvenile),
        new Person("PEric","sdkbdjk",Occupation.Student),
        new Person("askf","asfasbfj",Occupation.Professional),
        new Person("asbasf","askcbasjkfggggggggggggggg",Occupation.Retired)
    };
}
}
