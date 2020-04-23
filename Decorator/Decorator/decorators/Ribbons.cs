using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Ribbons : Decorator
    {

        public Ribbons(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 2;
            this.Description = tree.GetDescription() + ", Ribbons";
            this.Star = tree.GetStar();

        }

    }

}
