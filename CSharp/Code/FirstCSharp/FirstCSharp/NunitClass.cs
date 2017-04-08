using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;

namespace FirstCSharp
{
    [TestFixture]
    class NunitClass
    {
        [Test]
        public void plusTest()
        {
            firstCsharp firstCsharpobj = new firstCsharp();
            int result = firstCsharpobj.puls(1, 2);
            Assert.AreEqual(4, result);
        }

        [Test]
        public void plusTestTrue()
        {
            firstCsharp firstCsharpobj = new firstCsharp();
            int result = firstCsharpobj.puls(1, 2);
            Assert.AreEqual(3, result);
        }
    }
}
