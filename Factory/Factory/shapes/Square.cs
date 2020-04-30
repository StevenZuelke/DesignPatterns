using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.shapes
{
    class Square : Shape, IComparable
    {

        private double Width;
        private double Height;

        //Constructor

        public Square(double width, double height)
        {

            Width = width;
            Height = height;

        }//end Constructor

        public override double GetArea()
        {

            double area;
            area = Math.Pow(Width, 2);
            return area;

        }//end GetArea

        public override string GetName()
        {

            return "Square";

        }//end GetName

    }//end Class

}//end NameSpace
