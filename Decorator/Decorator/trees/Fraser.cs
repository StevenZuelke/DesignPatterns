using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.trees
{
    public class Fraser : Tree
    {
        public Fraser()
        {
            this.Description = "Fraser Fir";
            this.Cost = 35;
        }
    }
}
