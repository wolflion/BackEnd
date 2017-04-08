using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace FirstCSharp
{
    class firstCsharp
    {
        static void Main(string[] args)   // static
        {
            #region firstCsharp
            if (args.Length == 2)
            {
                System.Console.WriteLine("args.Length is 2");
            }
            else
            {
                Console.WriteLine("args.Lenght is not 2 ");
            }

            Console.WriteLine("parameter count = {0}", args.Length);

            for (int i = 0; i < args.Length; i++)
            {
                Console.WriteLine("Arg[{0}] = [{1}]", i, args[i]);
            }

            foreach (string s in args)  // IEnumerable接口
            {
                Console.WriteLine(s);
            }

            Console.WriteLine("Please enter your name:");
            Console.ReadLine();//读取用户输入
            Console.WriteLine("Welcome to you !");
            #endregion firstCsharp
        }

        public int puls(int a, int b)
        {
            return a + b;
        }
    }

}
