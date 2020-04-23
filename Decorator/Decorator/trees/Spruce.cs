using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.trees
{
    public class Spruce : Tree
    {
        public Spruce()
        {
            this.Description = "Colorado Blue Spruce";
            this.Cost = 50;
            this.Star = false;
        }
    }
}
