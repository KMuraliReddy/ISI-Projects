using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    class Animal
    {
        
        protected string Name { get; private set ;  }

        protected int Age
        {
            get
            {
                return Age;
            }
            private set
            {
                if (value < 0)
                    Age = 0;
                else
                    Age = value;

            }
        }
        protected string Species { get; private set; }

    public Animal(int age, string name, string species)
        {
            this.Age = age;
            this.Name = name;
            this.Species = species;

        }
       
      
        public void Display()
        {
            Console.WriteLine(Name + " is of the species " + Species + " and is " + Age + " years old");
        }

    }
}
