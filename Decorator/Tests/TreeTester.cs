using Microsoft.VisualStudio.TestTools.UnitTesting;
using Decorator;
using Decorator.trees;
using Decorator.decorators;

namespace Tests
{

    [TestClass]
    public class TreeTester
    {

        [TestMethod]
        public void CreateBareTree_Works()
        {

            //Arrange
            Tree tree = new Fraser();
            //Act
            string description = tree.GetDescription();
            int cost = tree.GetCost();
            //Assert
            Assert.AreEqual<string>("Fraser Fir", description);

        }
    }
}
