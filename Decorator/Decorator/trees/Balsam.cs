using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator.trees
{
    public class Balsam : Tree
    {
        public Balsam()
        {
            this.Description = "Balsam Fir";
            this.Cost = 25;
            this.Star = false;
        }
    }
}
