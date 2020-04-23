using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Lights : Decorator
    {

        public Lights(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 5;
            this.Description = tree.GetDescription() + ", Lights";
            this.Star = tree.GetStar();

        }

    }

}
