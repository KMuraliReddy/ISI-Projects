using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    class Animal
    {
        public static int AnimalCount { get; private set; }
        private int age;
        public int Age { get { return age; } private set { age = value < 0 ? 0 : value; } }
        protected string Name { get; private set; }
        protected string Species { get; private set; }
        public static void DisplayAnimals()
        {
            Console.WriteLine("There are " + AnimalCount + " animals alive currently");
        }
        //---------------------------------------
        public Animal(int age, string name, string species)
        {
            this.Age = age;
            this.Name = name;
            this.Species = species;
            AnimalManager.animals.Add(this);
            AnimalCount++;
        }
       
        public void Display()
        {
            Console.WriteLine(Name+" "+Species+" "+Age);
        }
        public void Born()
        {
            AnimalManager.animals.Add(this);
        }
        public void Die()
        {
            AnimalManager.animals.Remove(this);
        }





    }
}
