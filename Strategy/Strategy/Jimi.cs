using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Jimi : Character
    {
        public Guitar Guitar { get; set; }
        public Solo Solo { get; set; }

        public string getName()
        {
            return "Jimi Hendrix";
        }
    }
}
