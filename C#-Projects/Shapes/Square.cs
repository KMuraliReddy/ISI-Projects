using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Square : Shape 
    {
        public float sideLength { get; private set; }
        public static int squareCount = 0;
        public  Square(float sideLength)
        {
            this.sideLength = sideLength;
            squareCount = ++squareCount;
            ReturnArea();
            ReturnPerimeter();

        }
        public override float ReturnArea()
        {
            return sideLength * sideLength;
        }
        public override float ReturnPerimeter()
        {
            return 4 * sideLength;
        }
    }
}
