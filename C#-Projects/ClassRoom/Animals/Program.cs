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
            Animal a = new Animal( 8, "test", "nancy");
            Animal b = new Animal(8, "test", "nancy");
            Animal c = new Animal(8, "test", "nancy");
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);
        }
        
    }
}
