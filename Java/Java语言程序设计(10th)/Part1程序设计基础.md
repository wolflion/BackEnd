##  缘起
+ 这是《Java语言程序设计(10th)》的Part1，计划2017-12-31之前全部整理完。
+ 2017-12-23开始想看这本书的，并同时开始实践起Java来的。
+ Part的内容包含(chap1-chap8)【L(12/679】


##  内容
###  chap1 计算机、程序和Java概述  1(24/679)
+ 2017-12-23自己用JDK+Eclipse搭建了一个开发环境。

###  chap3 选择 64(87/679)
+ 2017-12-25开始学习的。
+ 3.2 boolean数据类型
    + 六种关系操作符(relational operator)或者叫(comparison operator)
    + `true`和`false`都是直接量，就像10这样的数字。它们被当作保留字一样，不能用做程序中的标识符。*但他们应该不是关键字或保留字。*
    + [AdditionQuiz.java]()
        + `import java.util.Scanner`以及`Scanner input = new Scanner(System.in)` 类似C里的`scan()`。
        + 创建`Scanner`对象何时释放的问题，代码里没写，但Eclipse里提示了。
        + 产生随机数的方法`System.currentTimeMillis()`。
    + 复习题 66(89/679)    
        + 3.3 **至少在java里int类型和boolean类型无法强制转换** `int i = 1; boolean b =(boolean)i `这种IDE会报错。
+ 3.3 if语句
    + [SimpleIfDemo.java]
        + 在Eclipse里输入`sysout`就是相当于`System.out.println();`
        + 同样`Alt+/`组合键
        + `input.nextInt()`是取得用户输入的一个int值，如果不是int值报错。
    + 复习题 68(91/679)
+ 3.4 双分支if-else语句
    + 复习题 69(92/679)     
+ 3.5 嵌套的if语句和多分支if-else语句
    + 复习题 70(93/679)         
        + 3.8-3.10
+ 3.6 **常见错误和陷阱**  71(94/679)
    + 常见错误5：两个浮点数值的相等测试
    + 复习题 73(96/679)         
        + 3.11 - 3.14 
+ 3.7 产生随机数    
    + `Math.random()`产生一个0.0到1.0之间的随机double值，不包括1.0。
    + [SubtractionQuiz.java]()  75(98/679)
    + 复习题 75(98/679) 
+ 3.8
+ 3.9 
+ 3.10 逻辑操作符
+ 3.11 
+ 3.12 
+ 3.13 switch语句
    + 3-9[ChineseZodiac.java]()
    + *switch相对用得较少一些，都不太记得语法结构了*
    + 复习题 88(111/679)         
        + 3.29 - 3.32 
+ 3.14 条件表达式
    + 复习题 89(112/679)         
        + 3.33 - 3.36 
+ 3.15 操作符的优先级    
    + 复习题 90(113/679)         
        + 3.37 - 3.40
+ 3.16 调试
    + JDK包含了一个命令行调试器jdb。
+ 本章小结  91(114/679)    
+ 编程练习题  92(115/679)


###  chap4 数学函数、字符和字符串  100(123/679)
+ 4.2 常用数学函数
    + `Math.PI`和`Math.E`
    + 三角函数方法 
    + 指数函数方法
    + [ComputeAngles]()
    + 复习题  104(127/679)
        + 4.1 - 4.7
+ 4.3 字符数据类型和操作
    + 复习题  108(131/679)
        + 4.8 - 4.15
+ 4.4 String类型
    + `String`实际上与System类和Scanner类一样，都是Java库中一个预定义的类。**String类型不是基本类型，而是引用类型（reference type）**。
    + `length()`
    + `charAt(index)`从字符串中获取字符
        + **注意越界，每一个字符的下标值是0**。
    + `concat()`连接字符串
    + `toLowerCase()`和`toUpperCase()`字符串的转换
    + Scanner对象上的`next()`方法，从控制台读取字符串
    + Scanner对象上的`nextLine()`方法，从控制台读取字符串
    + 字符串比较
        + [OrderTwoCities]()
    + `substring()`获得子字符串
    + `indexOf()`和`lastIndexOf()`获取字符串中的字符或子串
    + `Integer.parseInt()`和`Double.parseDouble()`字符串和数字间的转换
    + 复习题  116(139/679)
        + 4.16 - 4.20
+ 4.5 示例学习
    + [GuessBirthday]()
    + [HexDigit2Dec]()
    + [LotteryUsingStrings]()
+ 4.7 格式化控制台输出
    + `System.out.printf()`
    + [FormatDemo]()

###  chap5 循环  133(156/679)


###  chap6  方法 171(194/679)
+ 6.2 定义方法
    + **本章的所有方法都使用静态修饰符static**,但原因在chap9描述了，*那是不是每个方法都要有static呢？*
    + **定义**（指被定义的条目是什么）与**声明**（指为被声明的条目分配内存来存储数据）的区别。
+ 6.3 调用方法
    + [601TestMax.java]()
    + **main()方法在于它由Java虚拟机调用的**。
    + 每当调用一个方法时，系统会创建一个活动记录（也称为活动框架），用于保存方法中的参数和变量。活动记录置于一个内存区域中，称为**调用堆栈（call stack）**。175(198/679)
+ 6.4 void方法示例
    + [602TestVoidMethod.java]()
    + [603TestReturnGradeMethod.java]()
    + 复习题 177(200/679)
        + 6.1 - 6.10
+ 6.5 通过传值进行参数传递
    + [604Increment.java]()
    + [605TestPassByValue.java]()
    + 复习题 180(203/679)
        + 6.11 - 6.14
+ 6.6 模块化代码
    + [606GreatestCommonDivisorMethod.java]()
    + [607PrimeNumberMethod.java]()

+ 6.7 示例代码 
    + [608Hex2Dec.java]()

+ 6.8 重载方法
    + [609TestMethodOverloading.java]()
    + 复习题 187(210/679)
        + 6.15 - 6.17
+ 6.9 变量的作用域
    + **局部变量**
+ 6.10 示例学习
    + [610RandomCharacter.java]()
    + [611TestRandomCharacter.java]()
+ 6.11 方法抽象和逐步求精
    + **方法抽象（method abstraction）**是通过将方法的使用和它的实现分离来实现的。
    + **“分治”（divid-and-conquer）**策略，也称为逐步求精（stepwise refinement）。
        + 自顶向下的设计、实现
        + **待完善方法（stub）是方法的一个简单但不完整的版本**。
        + [612PrintCalendar.java]()
    + 逐步求精的优势
        + 更简单的程序
        + 重用方法
        + 易于开发、调试和测试
        + 更方便团队合作
+ 编程练习题 197(220/679)

###  chap7 一维数组  207(230/679)           

###  chap8 多维数组  242(265/679)
+ 8.2 二维数组的基础知识
+ 8.3 处理二维数组
+ 8.4 
    + [801PassTwoDimensionalArray]()