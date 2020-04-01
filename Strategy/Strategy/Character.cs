using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    interface Character
    {
        Guitar Guitar { get; set; }
        Solo Solo { get; set; }

        void playGuitar();

        void performSolo();
        string getName();
    }
}
