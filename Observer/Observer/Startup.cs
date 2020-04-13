using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class Startup
    {
        public static void Main(string[] args)
        {
            EyeOfSauron eye = new EyeOfSauron();
            BadGuy saruman = new BadGuy("Saruman", eye);
            BadGuy witchKing = new BadGuy("Witch King", eye);
            eye.AddEnemy(new Elf());
            eye.AddEnemy(new Man());
            eye.AddEnemy(new Dwarf());
            eye.AddEnemy(new Man());
            eye.AddEnemy(new Hobbit());
            eye.SetEnemies();
            saruman.Defeated();
            eye.SetEnemies();
            Console.ReadLine();

        }
    }
}
