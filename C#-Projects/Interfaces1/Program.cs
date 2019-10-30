using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
    class Program
    {
        static void Main(string[] args)
        {
            TimeManager.timePassables.Add(new Person(7));
            TimeManager.timePassables.Add(new Person(9));
            TimeManager.timePassables.Add(new Person(15));
            TimeManager.timePassables.Add(new Person(42));
            TimeManager.timePassables.Add(new BankAccount(500));
            TimeManager.timePassables.Add(new BankAccount(5000));
            TimeManager.timePassables.Add(new BankAccount(50));
            TimeManager.TimePasses(3); 

            foreach(ITimePassable iTP in TimeManager.timePassables)
            {
                if (iTP is Person)
                    ((Person)iTP).Display();
                if (iTP is BankAccount)
                    ((BankAccount)iTP).Display();
            }


            Console.ReadKey();
        }
    }
}
