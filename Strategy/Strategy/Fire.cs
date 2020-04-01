using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Fire : Solo
    {
        
        public void perform()
        {
            Console.WriteLine("Puts the Guitar on Fire");
        }
    }
}
