using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Rectangle : Polygon
    {
        public float length { get; private set; }
        public float width { get; private set; }
        public static int rectangleCount = 0;
        public Rectangle(float length,float width):base()
        {
            this.length = length;
            this.width = width;
            rectangleCount = ++rectangleCount;
        }
        public override float ReturnPerimeter()
        {
            return 2 * (length * width);
        }

        public override float ReturnArea()
        {
            return length * width;
        }
        public override void Display()
        {

        }
    }
}
