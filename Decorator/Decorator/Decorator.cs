using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator
{
    public abstract class Decorator : Tree
    {

        protected Tree Tree;

        public Tree GetTree()
        {
            return Tree;
        }
    }
}
