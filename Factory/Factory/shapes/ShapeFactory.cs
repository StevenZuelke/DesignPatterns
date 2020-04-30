using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.shapes
{
    public class ShapeFactory
    {
        public Shape Create(string shape, double width, double height)
        {
            Shape concreteShape = new Circle(0, 0);
            if (shape.ToLower() == "circle")
            {//Circle

                concreteShape = new Circle(width, height);

            }else if(shape.ToLower() == "square")
            {//Square

                concreteShape = new Square(width, height);

            }
            else if (shape.ToLower() == "rectangle")
            {//Rectangle

                concreteShape = new Rectangle(width, height);

            }
            else if (shape.ToLower() == "triangle")
            {//Triangle

                concreteShape = new Triangle(width, height);

            }
            return concreteShape;

        }

    }

}
