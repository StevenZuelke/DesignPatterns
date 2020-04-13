using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class BadGuy : IObserver<List<GoodGuy>>
    {
        private IDisposable Unsubscriber;
        private List<GoodGuy> Enemies = new List<GoodGuy>();
        private string Name;

        public BadGuy(string name, IObservable<List<GoodGuy>> eye)
        {
            Name = name;
            Subscribe(eye);
        }

        public void OnCompleted()
        {
            throw new NotImplementedException();
        }

        public void OnError(Exception error)
        {
            throw new NotImplementedException();
        }

        public void OnNext(List<GoodGuy> enemies)
        {
            Enemies = enemies;
            PrintEnemies();
        }

        public virtual void Subscribe(IObservable<List<GoodGuy>> eye)
        {
            Unsubscriber = eye.Subscribe(this);
        }

        public virtual void Defeated()
        {
            Console.WriteLine(Name + " defeated");
            Unsubscriber.Dispose();
        }
        
        private void PrintEnemies()
        {
            Console.WriteLine(Name + ": ");
            foreach(GoodGuy enemy in Enemies)
            {
                Console.WriteLine("   " + enemy.GetName());
            }
        }
    }
}
