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
            bool star = tree.GetStar();
            //Assert
            Assert.AreEqual<string>("Fraser Fir", description);
            Assert.AreEqual<int>(35, cost);
            Assert.IsTrue(!star);
            //All other kinds of trees are made same way (more or less copy/paste) so they work the same way
            //Each is used in a different test as well

        }

        [TestMethod]
        public void CreateStar_WorksOnlyOnce()
        {

            //Arrange
            Tree tree = new Spruce();
            tree = new Star(tree);
            tree = new Star(tree);
            tree = new Star(tree);
            //Act
            string description = tree.GetDescription();
            int cost = tree.GetCost();
            bool star = tree.GetStar();
            //Assert
            Assert.AreEqual<string>("Colorado Blue Spruce, Star", description);
            Assert.AreEqual<int>(54, cost);
            Assert.IsTrue(star);
        }

        [TestMethod]
        public void CreateDecorators_WorksWithStar()
        {

            //Arrange
            Tree tree = new Balsam();
            tree = new Star(tree);
            tree = new Ruffles(tree);
            tree = new Star(tree);
            tree = new Ruffles(tree);
            //Act
            string description = tree.GetDescription();
            int cost = tree.GetCost();
            bool star = tree.GetStar();
            //Assert
            Assert.AreEqual<string>("Balsam Fir, Star, Ruffles, Ruffles", description);
            Assert.AreEqual<int>(31, cost);
            Assert.IsTrue(star);
        }

        [TestMethod]
        public void CreateAllDecorators_WorksWithStars()
        {

            //Arrange
            Tree tree = new Douglas();
            tree = new Star(tree);
            tree = new Ruffles(tree);
            tree = new Star(tree);
            tree = new Blue(tree);
            tree = new Red(tree);
            tree = new Silver(tree);
            tree = new LEDs(tree);
            tree = new Lights(tree);
            tree = new Ribbons(tree);
            //Act
            string description = tree.GetDescription();
            int cost = tree.GetCost();
            bool star = tree.GetStar();
            //Assert
            Assert.AreEqual<string>("Douglas Fir, Star, Ruffles, Blue Balls, Red Balls, Silver Balls, LEDs, Lights, Ribbons", description);
            Assert.AreEqual<int>(58, cost);
            Assert.IsTrue(star);

        }

    }

}
