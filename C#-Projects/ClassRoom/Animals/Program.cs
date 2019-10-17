using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Animals
{
    class Program
    {

      
        static void Main(string[] args)
        {
            List<Animal> animals = new List<Animal>();
            // Animal a = new Animal(8,"nancy","frog");
            //  Animal b = new Animal(6, "harry", "duck");
            animals.Add(new Animal(8, "nancy", "frog"));
            animals.Add(new Animal(6, "harry", "duck"));
            foreach (Animal a in animals)
                a.Display();
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);
        }
        
    }
}
