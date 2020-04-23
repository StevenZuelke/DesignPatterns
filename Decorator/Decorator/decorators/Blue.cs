using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Blue : Decorator
    {

        public Blue(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 2;
            this.Description = tree.GetDescription() + ", Blue Balls";
            this.Star = tree.GetStar();

        }

    }

}
