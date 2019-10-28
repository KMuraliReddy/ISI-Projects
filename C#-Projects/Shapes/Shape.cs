using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    abstract class Shape
    {
        public float surfaceArea=0;
        public float perimeter=0;
        public virtual float ReturnArea() {
            return surfaceArea;
        }
        public virtual float ReturnPerimeter() {

            return perimeter;
        }
        public virtual void Display() {
            Console.WriteLine("The Area Is : " + surfaceArea);
            Console.WriteLine("The Perimeter Is :" + perimeter);
        }
            
    }
}
