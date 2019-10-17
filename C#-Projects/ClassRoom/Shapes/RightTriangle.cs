using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class RightTriangle
    {
        public  float rightTriangle_Base,height;
        public RightTriangle(float rightTriangle_Base,float height)
        {
            this.rightTriangle_Base = rightTriangle_Base;
            this.height = height;
            CalculateArea();
            CalculatePerimeter();

        }
        public  float CalculateArea()
        {
            return (rightTriangle_Base * height) / 2;
        }
        public  float CalculatePerimeter()
        {
            return rightTriangle_Base + height +(float)(Math.Sqrt((height * height)+ (rightTriangle_Base * rightTriangle_Base)));
        }
    }
}
