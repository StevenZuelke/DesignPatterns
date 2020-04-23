using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Ruffles : Decorator
    {

        public Ruffles(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 1;
            this.Description = tree.GetDescription() + ", Ruffles";
            this.Star = tree.GetStar();

        }

    }

}
