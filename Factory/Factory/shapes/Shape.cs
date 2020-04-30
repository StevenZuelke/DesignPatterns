using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory.shapes
{

    public abstract class Shape : IComparable
    {

        public int CompareTo(Object otherObj)
        {

            Shape other = (Shape)otherObj;
            if (this.GetName().CompareTo(other.GetName()) < 0) return -1;
            else if (this.GetName().CompareTo(other.GetName()) > 0) return 1;
            else if (this.GetArea() < other.GetArea()) return -1;
            else if (this.GetArea() > other.GetArea()) return 1;
            else return 0;

        }//end CompareTo

        public abstract double GetArea();

        public abstract string GetName();

    }

}
