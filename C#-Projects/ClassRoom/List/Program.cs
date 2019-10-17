using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace List
{
    class Program
    {
        static void Main(string[] args)
        {
            List<string> words=new List<string>();
            words.Add("Hi");
            words.Add("Murali");
            words.Add("typing......");
            words.Add("Bye");
            foreach (string s in words)
            Console.WriteLine(s);
            List<string> stringList = new List<string>() { "murali", "isi", "college", "montreal", "quebec", "canada" };
            stringList.Add("hey");
            stringList.AddRange(words);
            stringList.Remove("college");
            stringList.RemoveAt(4);
            string[] stringArray=stringList.ToArray();

            Console.WriteLine(stringList.Count());
            Console.WriteLine(stringList.Contains("isi"));
            string[] stringArray1 = new string[stringList.Count()];
            for (int i = 0; i < stringList.Count(); i++)
            {
                stringArray1[i] = stringList.ElementAt(i);
            }
            foreach (string s in stringArray1)
            {

                Console.WriteLine(s+"array");
            }
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);
        }
    }
}
