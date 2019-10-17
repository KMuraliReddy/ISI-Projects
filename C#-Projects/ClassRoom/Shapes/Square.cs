using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Square
    {
        public  float sideLength;
        public Square(float sideLength)
        {
            this.sideLength = sideLength;
            CalculateArea();
            CalculatePerimeter();

        }
        public  float CalculateArea()
        {
            return sideLength * sideLength;
        }
        public  float CalculatePerimeter()
        {
            return 4 * sideLength;
        }
    }
}
