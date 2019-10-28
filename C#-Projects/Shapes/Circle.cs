using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Circle : Shape
    {
        public static int circlecount = 0;
        public float radius { get; private set; }
        public Circle(float radius)
        {
            this.radius = radius;
            circlecount = ++circlecount;
        }
        
        public override float ReturnPerimeter()
        {
            return 2 * (float)Math.PI * radius;

        }
        public override float ReturnArea()
        {
            return (float)Math.PI * radius * radius;
        }
        public override void Display()
        {
            Console.WriteLine();
        }
    }
}
