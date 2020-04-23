using Decorator.decorators;
using Decorator.trees;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Decorator
{

    public class Startup
    {

        public static void Main(string[] args)
        {

            Tree tree = new Douglas();
            tree = new Star(tree);
            tree = new Ruffles(tree);
            tree = new Star(tree);
            tree = new Blue(tree);
            tree = new Red(tree);
            tree = new Silver(tree);
            tree = new LEDs(tree);
            tree = new Lights(tree);
            tree = new Ribbons(tree);
            tree.PrintTree();
            //Wait for user to read the output
            Console.ReadLine();

        }

    }

}
