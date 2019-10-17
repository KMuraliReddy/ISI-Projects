using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Circle
    {
         public  float radius;
        public Circle(float radius)
        {
            this.radius = radius;
            CalculateArea();
            CalculatePerimeter();

        }
        public  float CalculateArea()
        {
            return (float)((Math.PI) * radius * radius);
        }
        public   float CalculatePerimeter()
        {
            return (float)(2 * (Math.PI) * radius);
        }
    }
    
}
