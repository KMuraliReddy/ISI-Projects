using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    class Animal
    {
         public string name;
         public int age;
         public string species;

        public Animal(int age,string name,string species)
        {
            this.age = age;
            this.name = name;
            this.species = species;                       

        }
        public void Display()
        {
            Console.WriteLine(name + " is of the species " + species + " and is "+age+" years old");
        }
    }
}
