using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interfaces1
{
    class BankAccount : ITimePassable
    {
        static decimal interestRate = .05m;
        public decimal Balance { get; private set; }
       
        public BankAccount(decimal initialBalance)
        {
            Balance = initialBalance;
        }

        public void TimePasses(int years)
        {
            Balance += Balance * interestRate * years;
        }
        public void Display()
        {
            Console.WriteLine(  "Bank Account Balance"+Balance);
        }
    }
}
