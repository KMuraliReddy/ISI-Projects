using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
   abstract  class Polygon :Shape
    {
        public float polygonPerimeter { get; private set; }
        public float apothem { get; private set; }
        public int numberOfSides { get; private set; }
        public float lengthOfside { get; private set; }
        public Polygon(float polygonPerimeter,float apothem,int numberOfSide,float lengthOfside)
        {
            this.apothem = apothem;
            this.polygonPerimeter = polygonPerimeter;
            this.numberOfSides = numberOfSide;
            this.lengthOfside = lengthOfside;
        }
        public override float ReturnPerimeter()
        {
            return numberOfSides * lengthOfside;
        }
        public override float ReturnArea()
        {
            return 1 / 2 * polygonPerimeter * apothem;
        }
        public override void Display()
        {
            
        }
    }
}
