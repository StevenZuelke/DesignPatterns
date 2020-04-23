using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Silver : Decorator
    {

        public Silver(Tree tree)
        {

            this.Tree = tree;
            this.Cost = tree.GetCost() + 3;
            this.Description = tree.GetDescription() + ", Silver Balls";
            this.Star = tree.GetStar();

        }

    }

}
