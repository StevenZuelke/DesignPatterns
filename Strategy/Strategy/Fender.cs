using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Fender : Guitar
    {
    
        public void play()
        {
            Console.WriteLine("Fender Telecaster");
        }
    }
}
