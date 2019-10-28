using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class RightTriAngle :Polygon
    {
        public float rightTriangle_Base { get; private set; }
            public float height { get; private set; }
        public static int rightTriangleCount = 0;
        public RightTriAngle(float rightTriangle_Base, float height) : base() 
        {
            this.rightTriangle_Base = rightTriangle_Base;
            this.height = height;
            rightTriangleCount = ++rightTriangleCount;
            CalculateArea();
            CalculatePerimeter();

        }
        public float CalculateArea()
        {
            return (rightTriangle_Base * height) / 2;
        }
        public float CalculatePerimeter()
        {
            return rightTriangle_Base + height + (float)(Math.Sqrt((height * height) + (rightTriangle_Base * rightTriangle_Base)));
        }

    }
}
