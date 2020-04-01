using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Angus : Character
    {
        public Guitar Guitar { get; set; }
        public Solo Solo { get; set; }

        public string getName()
        {
            return "Angus Young";
        }

        public void performSolo()
        {
            Solo.perform();
        }

        public void playGuitar()
        {
            Guitar.play();
        }
    }
}
