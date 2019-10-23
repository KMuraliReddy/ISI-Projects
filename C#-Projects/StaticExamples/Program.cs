using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticExamples
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int i = 0; i < 10; i++)
            {
                Employee e = new Employee();
                Console.WriteLine(e.uniqueID);
              
            }
            Console.ReadKey();

        }
    }
}
