using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class LEDs : Decorator
    {

        public LEDs(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 10;
            this.Description = tree.GetDescription() + ", LEDs";
            this.Star = tree.GetStar();

        }

    }

}
