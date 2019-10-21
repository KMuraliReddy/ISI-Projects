using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Shapes
{
    class Program
    {
        static void Main(string[] args)
        {
            string name = null;
            int[] arr = new int[5];
            Console.WriteLine(arr[0]+"murali");
            float d = 6.555f;
            
           
            List<Circle> circle = new List<Circle>();
            List<Rectangle> rectangle = new List<Rectangle>();
            List<RightTriangle> rightTriangle = new List<RightTriangle>();
            List<Square> square = new List<Square>();
            float circle_area = 0;
            float circle_perimeter = 0;
            float square_area = 0;
            float square_perimeter = 0;
            float rectangle_area = 0;
            float rectangle_perimeter = 0;
            float RightTriangle_area = 0;
            float RightTriangle_perimeter = 0;

            //circle.Add(new Circle(float.Parse(circle[0].ToString())).CalculateArea());
            circle.Add(new Circle(5));
            circle.Add(new Circle(6));
            circle.Add(new Circle(7));
            circle.Add(new Circle(8));


            rectangle.Add(new Rectangle(5, 6));
            rectangle.Add(new Rectangle(7, 8));
            rectangle.Add(new Rectangle(9, 10));
            rectangle.Add(new Rectangle(11, 12));

            rightTriangle.Add(new RightTriangle(5, 6));
            rightTriangle.Add(new RightTriangle(7, 8));
            rightTriangle.Add(new RightTriangle(9, 10));
            rightTriangle.Add(new RightTriangle(11, 12));

            square.Add(new Square(5));
            square.Add(new Square(8));
            square.Add(new Square(13));
            square.Add(new Square(15));


            foreach (Square s in square)
            {

               square_area = square_area + s.CalculateArea();
               square_perimeter= square_perimeter + s.CalculatePerimeter();
            }
            foreach (Circle c in circle)
            {
                circle_area= circle_area+ c.CalculateArea();
                circle_perimeter= circle_perimeter+c.CalculatePerimeter();
            }
            foreach (Rectangle r in rectangle)
            {
                rectangle_area= rectangle_area+r.CalculateArea();
                rectangle_perimeter= rectangle_perimeter+r.CalculatePerimeter();
            }
            foreach (RightTriangle rt in rightTriangle)
            {
                RightTriangle_area= RightTriangle_area+rt.CalculateArea();
                RightTriangle_perimeter = RightTriangle_perimeter + rt.CalculatePerimeter();
            }
            Console.WriteLine("Circle Area And Perimeters Are : " + circle_area + " :" + circle_perimeter);
            Console.WriteLine("Rectangle Area And Perimeters Are : " + rectangle_area + " :" + rectangle_perimeter);
            Console.WriteLine("RightTriangle Area And Perimeters Are : " + RightTriangle_area + " :" + RightTriangle_perimeter);
            Console.WriteLine("Square Area And Perimeters Are : " + square_area + " :" + square_perimeter);
            Console.WriteLine("Square Area And Perimeters Are : " + square_area + " :" + square_perimeter+"murali git");
            Console.WriteLine("Square Area And Perimeters Are : " + square_area + " :" + square_perimeter + "murali git");
            Console.WriteLine("Square Area And Perimeters Are : " + square_area + " :" + square_perimeter + "murali git new");
            Console.WriteLine("Press any key to continue...");
            Console.ReadKey(true);

        }
    }
}
