using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.shapes
{
    class Rectangle : Shape, IComparable
    {

        private double Width;
        private double Height;

        //Constructor

        public Rectangle(double width, double height)
        {

            Width = width;
            Height = height;

        }//end Constructor

        public override double GetArea()
        {

            double area;
            area = Width * Height;
            return area;

        }//end GetArea

        public override string GetName()
        {

            return "Rectangle";

        }//end GetName

    }//end Class

}//end NameSpace
