using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Smash : Solo
    {
        
        public void perform()
        {
            Console.WriteLine("Smashes the Guitar");
        }
    }
}
