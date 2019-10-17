using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Rectangle
    {
        public  float length, width;
        public Rectangle(float length,float width)
        {
            this.length = length;
            this.width = width;
            CalculateArea();
            CalculatePerimeter();
        }
        public   float CalculateArea()
        {
            return length * width;

        }
        public  float CalculatePerimeter()
        {
            return 2 * (length + width);
        }
    }
}
