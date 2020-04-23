using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.decorators
{
    public class Star : Decorator
    {

        public Star(Tree tree)
        {

            if (tree.GetStar())
            {

                Console.WriteLine("Tree already has a star.");
                this.Description = tree.GetDescription();
                this.Cost = tree.GetCost();
                this.Star = true;
            }
            else
            {

                this.Tree = tree;
                this.Cost = tree.GetCost() + 4;
                this.Description = tree.GetDescription() + ", Star";
                this.Star = true;

            }
            
        }

    }

}
