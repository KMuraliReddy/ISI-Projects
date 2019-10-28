using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    static class ShapeManager
    {

       public static List<Circle> circle = new List<Circle>();
        public static List<Rectangle> rectangle = new List<Rectangle>();
        public static List<RightTriAngle> rightTriangle = new List<RightTriAngle>();
        public static List<Square> square = new List<Square>();
        public static List<Polygon> polygon = new List<Polygon>();

        static void Main(string[] args)
        {
           


             
            float circle_area = 0;
            float circle_perimeter = 0;
            float square_area = 0;
            float square_perimeter = 0;
            float rectangle_area = 0;
            float rectangle_perimeter = 0;
            float RightTriangle_area = 0;
            float RightTriangle_perimeter = 0;
            float polygon_area = 0;
            float polygon_perimeter = 0;

            //circle.Add(new Circle(float.Parse(circle[0].ToString())).CalculateArea());
            circle.Add(new Circle(5));
            circle.Add(new Circle(6));
            circle.Add(new Circle(7));
            circle.Add(new Circle(8));


            rectangle.Add(new Rectangle(5, 6));
            rectangle.Add(new Rectangle(7, 8));
            rectangle.Add(new Rectangle(9, 10));
            rectangle.Add(new Rectangle(11, 12));

            rightTriangle.Add(new RightTriAngle(5, 6));
            rightTriangle.Add(new RightTriAngle(7, 8));
            rightTriangle.Add(new RightTriAngle(9, 10));
            rightTriangle.Add(new RightTriAngle(11, 12));

            square.Add(new Square(5));
            square.Add(new Square(8));
            square.Add(new Square(13));
            square.Add(new Square(15));

            for(int i = 0; i < circle.Count; i++)
            {
                square_area = square_area + circle[i].ReturnArea();
            }
           


            foreach (Square s in square)
            {

                square_area = square_area + s.ReturnArea();
                square_perimeter = square_perimeter + s.ReturnPerimeter();
            }
            foreach (Circle c in circle)
            {
                circle_area = circle_area + c.ReturnArea();
                circle_perimeter = circle_perimeter + c.ReturnPerimeter();
            }
            foreach (Rectangle r in rectangle)
            {
                rectangle_area = rectangle_area + r.ReturnArea();
                rectangle_perimeter = rectangle_perimeter + r.ReturnPerimeter();
            }
            foreach (RightTriAngle rt in rightTriangle)
            {
                RightTriangle_area = RightTriangle_area + rt.CalculateArea();
                RightTriangle_perimeter = RightTriangle_perimeter + rt.CalculatePerimeter();
            }
           


            Console.WriteLine("Circle Area And Perimeters Are : " + circle_area + " :" + circle_perimeter);
            Console.WriteLine("Rectangle Area And Perimeters Are : " + rectangle_area + " :" + rectangle_perimeter);
            Console.WriteLine("RightTriangle Area And Perimeters Are : " + RightTriangle_area + " :" + RightTriangle_perimeter);
            Console.WriteLine("Square Area And Perimeters Are : " + square_area + " :" + square_perimeter);
            Console.WriteLine("Number Of Circles Are : " + Circle.circlecount);
            Console.WriteLine("Number Of Squares Are : " + Square.squareCount);
            Console.WriteLine("Number Of Rectangles Are : " + Rectangle.rectangleCount);
            Console.WriteLine("Number Of RightTriangles Are : " + RightTriAngle.rightTriangleCount);
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);

        }
        public static float ReturnTotalArea(List<Shape> list)
        {
           
            return 0;
        }
        public static float ReturnTotalPerimeter()
        {

        }
    }
}