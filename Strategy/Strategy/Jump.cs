using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Jump : Solo
    {
        
        public void perform()
        {
            Console.WriteLine("Jumps off the Stage");
        }
    }
}
