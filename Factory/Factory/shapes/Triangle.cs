using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.shapes
{
    class Triangle : Shape, IComparable
    {

        private double Width;
        private double Height;

        //Constructor

        public Triangle(double width, double height)
        {

            Width = width;
            Height = height;

        }//end Constructor

        public override double GetArea()
        {

            double area;
            area = (Width * Height) / 2;
            return area;

        }//end GetArea

        public override string GetName()
        {

            return "Triangle";

        }//end GetName

    }//end Class

}//end NameSpace
