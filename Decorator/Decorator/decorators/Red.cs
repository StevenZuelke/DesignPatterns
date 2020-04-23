using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Red : Decorator
    {

        public Red(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 1;
            this.Description = tree.GetDescription() + ", Red Balls";
            this.Star = tree.GetStar();

        }

    }

}
