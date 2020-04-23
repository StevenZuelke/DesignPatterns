using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.trees
{
    public class Douglas : Tree
    {
        public Douglas()
        {
            this.Description = "Douglas Fir";
            this.Cost = 30;
            this.Star = false;
        }
    }
}
