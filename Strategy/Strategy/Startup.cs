using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strategy
{
    class Startup
    {
        static void Main(string[] args)
        {
            Character player1 = new Slash();
            Character player2 = new Jimi();
            player1.setGuitar("SG");
            player2.setGuitar("FlyingV");
            player1.setSolo("Smash");
            player2.setSolo("Jump");
            Console.WriteLine("Player 1: " + player1.getName());
            player1.playGuitar();
            player1.performSolo();
            Console.WriteLine("Player 2: " + player2.getName());
            player2.playGuitar();
            player2.performSolo();

            Console.WriteLine("START SWITCHING");
            //Switch once
            player1 = new Jimi();
            player1.setGuitar("Fender");
            player1.setSolo("Jump");
            player2 = new Angus();
            player2.setGuitar("SG");
            player2.setSolo("Smash");
            Console.WriteLine("Player 1: "+ player1.getName());
            player1.playGuitar();
            player1.performSolo();
            Console.WriteLine("Player 2: " + player2.getName());
            player2.playGuitar();
            player2.performSolo();

            Console.WriteLine("Switching again");
            //Switch again
            player1 = new Angus();
            player1.setGuitar("FlyingV");
            player1.setSolo("Jump");
            player2 = new Slash();
            player2.setGuitar("Fender");
            player2.setSolo("Fire");
            Console.WriteLine("Player 1: " + player1.getName());
            player1.playGuitar();
            player1.performSolo();
            Console.WriteLine("Player 2: " + player2.getName());
            player2.playGuitar();
            player2.performSolo();
            Console.ReadLine();
        }
    }
}
