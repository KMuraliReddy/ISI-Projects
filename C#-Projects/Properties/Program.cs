using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Properties
{
    class Program
    {
        private static float angle;

        public static float Angle
        {
            get

            { return angle > 0 ? angle % 360 : (angle % 360) + 360; }private set { angle = value; }
        }
        public static float Radians
        {
            get

            { return Angle * (float)(Math.PI / 180); }

        }

        static void Main(string[] args)
        {
            Angle = -1084;
            Console.WriteLine(Angle);
            Console.WriteLine(Radians);
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);
        }
    }
}
