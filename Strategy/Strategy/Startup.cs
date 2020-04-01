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
            player1.Guitar = new SG();
            player2.Guitar = new FlyingV();
            player1.Solo = new Smash();
            player2.Solo = new Jump();
            Console.WriteLine("Player 1: " + player1.getName());
            player1.playGuitar();
            player1.performSolo();
            Console.WriteLine("Player 2: " + player2.getName());
            player2.playGuitar();
            player2.performSolo();

            Console.WriteLine("START SWITCHING");
            //Switch once
            player1 = new Jimi();
            player1.Guitar = new Fender();
            player1.Solo = new Fire();
            player2 = new Angus();
            player2.Guitar = new SG();
            player2.Solo = new Smash();
            Console.WriteLine("Player 1: "+ player1.getName());
            player1.playGuitar();
            player1.performSolo();
            Console.WriteLine("Player 2: " + player2.getName());
            player2.playGuitar();
            player2.performSolo();

            Console.WriteLine("Switching again");
            //Switch again
            player1 = new Angus();
            player1.Guitar = new FlyingV();
            player1.Solo = new Jump();
            player2 = new Slash();
            player2.Guitar = new Fender();
            player2.Solo = new Fire();
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
