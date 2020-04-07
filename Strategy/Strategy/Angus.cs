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

        public void setGuitar(string guitar)
        {
            if (guitar == "FlyingV")
            {
                this.Guitar = new FlyingV();
            }
            if (guitar == "SG")
            {
                this.Guitar = new SG();
            }
            if (guitar == "Fender")
            {
                this.Guitar = new Fender();
            }
        }

        public void setSolo(string solo)
        {
            if (solo == "Fire")
            {
                this.Solo = new Fire();
            }
            if (solo == "Jump")
            {
                this.Solo = new Jump();
            }
            if (solo == "Smash")
            {
                this.Solo = new Smash();
            }
        }
    }
}
