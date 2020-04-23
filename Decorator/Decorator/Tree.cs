using Decorator.decorators;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator
{

    public abstract class Tree
    {

        protected string Description;
        protected int Cost;
        protected bool Star;

        public int GetCost()
        {

            return Cost;

        }

        public string GetDescription()
        {

            return Description;

        }


        public bool GetStar()
        {

            return Star;

        }

        public void PrintTree()
        {

            string text = Description + ". Price: " + Cost;
            Console.WriteLine(text);

        }
    }

}
