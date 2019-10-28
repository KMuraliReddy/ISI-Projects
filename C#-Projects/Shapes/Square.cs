using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Square : Rectangle 
    {
        public float sideLength { get; private set; }
        public static int squareCount = 0;
       
        public override float ReturnArea()
        {
            return sideLength * sideLength;
        }
        public override float ReturnPerimeter()
        {
            return 4 * sideLength;
        }
        public Square(float sideLength,float width):base(sideLength, width)
        {
            this.sideLength = sideLength;
            squareCount = ++squareCount;
            ReturnArea();
            ReturnPerimeter();

        }
    }
}
