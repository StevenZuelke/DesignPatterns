using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factory
{
    class Factory
    {
        IProduct create(string product)
        {
            IProduct concreteProduct;
            //Delete this v
            concreteProduct = new ConcreteProduct();
            if(product == "concrete")
            {
                concreteProduct = new ConcreteProduct();
            }
            return concreteProduct;
        }
    }
}
