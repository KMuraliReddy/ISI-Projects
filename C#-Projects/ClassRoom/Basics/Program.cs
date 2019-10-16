using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bascis
{
    class Program
    {

        static void Main(string[] args)
        {
            int number = GetUserInt("Enter a number to find the factorial");
            int fact = Factorial(number);
            DisplayFunction("Factorial is : " + fact);
            GetUserInt("Enetr a number between these two numbers", 10, 20);
            DisplayFunction("murali");
            DisplayFunction("The Max Is : " + ReturnMax(1, 2, 6, 3, 4, 8, 500).ToString());
            DisplayFunction("The Min Is : " + ReturnMin(1, 2, 6, 3, 4, 8, 50).ToString());
            DisplayFunction("The Average Is : " + ReturnAvg(3, 4).ToString());
           // below block of code changes the original value of the variables
            int myMin = 0;
            int myMax = 0;
            float myAvg = 0;
            MaxMinAvg(out myMax, out myMin, out myAvg, 7, 66, 9);
            Console.WriteLine(myMax);
            Console.WriteLine(myMin);
            Console.WriteLine(myAvg);

            // code ends
            int x = 5;
            int y = 10;
            Console.WriteLine("Before Swapping : " + x + " " + y);
            SwapInt(ref x, ref y);
            Console.WriteLine("After Swapping : " + x + " " + y);

            int[] array1 = {1, 2, 3};
            int[] array2 = { 1, 2, 3};
           
            Console.WriteLine( CompareIntArrays(array1,array2));

            Console.WriteLine(PrimeCheck(15));

            int[] array=MakeIntArray(5);
            DisplayArray(array);
            PrimeNumbers(6);
            Console.WriteLine("The Divisibility Check Is: "+DivisibilityCheck(8, 2));
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);

        }
        //This Method takes an integer input from the user
        static int GetUserInt(string message)
        {
            DisplayFunction(message);

            bool valid = false;
            int number = 0;
            while (valid == false)
            {
                string Input = Console.ReadLine();//reading line from user
                if (int.TryParse(Input, out number))//parsing string to integer
                {
                    number = Int32.Parse(Input);//if parsing is success then stroing the value
                    valid = true;//setting the boolean value to true so the method will return the int to calling method
                }
                //This else block will execute if the parsing is failed
                else
                {
                    Console.WriteLine("Not an integer, please try again.");
                }
            }
            return number;
        }
        //This method takes an integer input and returns the factorial of that number
        static int Factorial(int number)
        {
            int factorial = 1;
            for (int i = 1; i <= number; i++)
            {
                factorial = factorial * i;
            }
            return factorial;
        }
        //This method takes a string and two integer values and asks the user to enter an integer between the min and max
        static int GetUserInt(string message, int min, int max)
        {
            int number = 0;
            do
            {
                number = GetUserInt("Enetr a number between" + " " + min + " and " + max);//taking an input from the user
            }
            while (number < min || number > max);//this while condition check the input range between min and max
            return number;
        }//This method takes the string input and displayes that
        static void DisplayFunction(params string[] strings)
        {
            for (int i = 0; i < strings.Length; i++)
            {
                Console.WriteLine(strings[i]);
            }
        }//this method takes an array of integers and returns the min value
        static int ReturnMin(params int[] numbers)
        {
            int min = numbers[0];
            for (int i = 0; i < numbers.Length; i++)
            {
                if (numbers[i] < min)
                {
                    min = numbers[i];
                }
            }
            return min;
        }
        //this method takes an array of integers and returns the max value
        static int ReturnMax(params int[] numbers)
        {
            int max = numbers[0];
            for (int i = 0; i < numbers.Length; i++)
            {
                if (numbers[i] > max)
                {
                    max = numbers[i];
                }

            }
            return max;
        }
        //this method takes an array of integers and returns the avg value of the numbers in the array
        static float ReturnAvg(params int[] numbers)
        {
            return ReturnSum(numbers) / numbers.Length;
        }
        //this method takes an array of integers and returns the sum  of the numbers in the array
        static float ReturnSum(params int[] numbers)
        {
            float sum = 0;
            for (int i = 0; i < numbers.Length; i++)
            {
                sum = sum + numbers[i];
            }
            return sum;
        }
        static void MaxMinAvg(out int max, out int min, out float avg, params int[] numbers)
        {
            max = ReturnMax(numbers);
            min = ReturnMin(numbers);
            avg = ReturnAvg(numbers);
        }
        static void SwapInt(ref int x, ref int y)
        {
            x = x + y;
            y = x - y;
            x = x - y;
        }
        static bool CompareIntArrays(int[] arr1, int[] arr2)
        {
            bool result = true;

            if (arr1.Length == arr2.Length)
            {
                for (int i = 0; i < arr1.Length; i++)
                {
                    if (arr1[i] != arr2[i])
                    {
                        result = false;
                    }
                }
            }
            else
            {
                result = false;
            }

            return result;
        }
        static bool PrimeCheck(int number)
        {
            bool result = false;
            int count = 0;
            for (int i = 1; i <= number; i++)
            {
                if (DivisibilityCheck(number,i))
                    count++;
            }
            if (number == 1 || count == 2)
            {
                result = true;
            }
            return result;
        }
        static int[] MakeIntArray(int number)
        {
            
            int[] inputArray = new int[number];
            for (int i = 0; i < number; i++)
            { 
                inputArray[i] = GetUserInt("Enetr an element into the array");
            }
            return inputArray;
        }
        static void PrimeNumbers(int number)
        {
        
            for (int i = 1; i <= number; i++)
            {
                if (PrimeCheck(i))
                  Console.WriteLine("The number " + i + " is a prime number");
            }
        }
        static void DisplayArray(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                 Console.WriteLine(arr[i]);

            }
        }
        static bool DivisibilityCheck(int n1,int n2)
        {
            bool divisible = false;
            if (n1 % n2 == 0)
               divisible = true; 
            return divisible;
        }
    }
}
