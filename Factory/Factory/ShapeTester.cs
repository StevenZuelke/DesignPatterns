using Factory.shapes;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{

    class ShapeTester
    {

        public static void Main(string[] args)
        {

            ShapeFactory factory = new ShapeFactory();
            ArrayList list = new ArrayList();

            list.Add(factory.Create("circle", 5, 5));
            list.Add(factory.Create("rectangle", 3, 3));
            list.Add(factory.Create("triangle", 3, 1));
            list.Add(factory.Create("circle", 2, 2));
            list.Add(factory.Create("circle", 1, 1));
            list.Add(factory.Create("square", 5, 5));
            list.Add(factory.Create("triangle", 10, 3));
            list.Add(factory.Create("square", 2, 2));
            list.Add(factory.Create("rectangle", 1, 3));
            list.Add(factory.Create("rectangle", 1, 9));
            list.Add(factory.Create("square", 1, 1));
            list.Add(factory.Create("rectangle", 10, 3));
            list.Add(factory.Create("triangle", 1, 3));
            list.Add(factory.Create("rectangle", 3, 1));
            list.Add(factory.Create("triangle", 3, 3));

            PrintList(list);
            list.Sort();
            Console.WriteLine();
            Console.WriteLine("SORTED LIST:");
            PrintList(list);
            //Wait for input so you can see the results
            Console.ReadLine();

        }//end Main

        private static void PrintList(ArrayList list)
        {
            for(int i = 0; i < list.Count; i++)
            {
                Shape shape = (Shape)list[i];
                Console.WriteLine(shape.GetName() + ", Area: " + shape.GetArea()) ;

            }
        }//end PrintList

    }//end Class

}//end namespace
