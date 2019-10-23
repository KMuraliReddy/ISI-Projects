using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    class AnimalManager
        
    {
        public static List<Animal> animals = new List<Animal>();
      
        public static int AnimalCount { get { return animals.Count; } }
        public static void DisplayAnimalCount()
        {
            Console.WriteLine("There are " + AnimalCount + " animals alive");
        }
        public static void DisplayAllAnimals()
        {
            foreach (Animal a in animals)
                a.Display();
        }
        
    }
}
