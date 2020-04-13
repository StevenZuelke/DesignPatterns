using System;
using System.Collections.Generic;

namespace Observer
{
    class EyeOfSauron : IObservable<List<GoodGuy>>
    {
        List<IObserver<List<GoodGuy>>> Observers = new List<IObserver<List<GoodGuy>>>();
        List<GoodGuy> Enemies = new List<GoodGuy>();

        public IDisposable Subscribe(IObserver<List<GoodGuy>> observer)
        {
            if (!Observers.Contains(observer))
            {
                Observers.Add(observer);
            }
            return new Unsubscriber<List<GoodGuy>>(Observers, observer);
        }
        public void AddEnemy(GoodGuy enemy)
        {
            Enemies.Add(enemy);
        }
        public void SetEnemies()
        {
            foreach(var observer in Observers)
            {
                observer.OnNext(Enemies);  
            }
        }

        internal class Unsubscriber<List> : IDisposable
        {
            private List<IObserver<List<GoodGuy>>> _observers;
            private IObserver<List<GoodGuy>> _observer;
            internal Unsubscriber(List<IObserver<List<GoodGuy>>> observers, IObserver<List<GoodGuy>> observer)
            {
                this._observers = observers;
                this._observer = observer;
            }
            
            public void Dispose()
            {
                if (_observers.Contains(_observer))
                {
                    _observers.Remove(_observer);
                }
            }
        }
    }
}