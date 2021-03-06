##  缘起
+ 2018-01-14左右开始写的这部分代码，觉得光敲代码不行，还是得结合书一起看。
+ Part2内容包含chap9-13，以及chap17。
    + chap9-10：如何使用对象和类进行程序设计 
    + chap11：继承，多态
    + chap12：异常处理，文件I/O
    + chap13：抽象类、接口
    + chap17：二进制I/O

##  内容
###  chap9 对象和类
+ 2018-01-16开始看的，2018-01-18看完，用了2个小时左右看完，但习题还没做。
+ 9.1 引言
+ 9.2 为对象定义类
    + 对象的状态（特征或属性）
    + 对象的行为（动作）
    + **构造方法**
    + 要能读懂**UML**表示的话，*这样技能想学很久了，也看了一段时间，觉得就是没掌握啊*
+ 9.3 定义类和创建对象
    + [E901TestSimpleCircle.java]()
    + **源代码中每个类被编译成一个.class文件**，这样写在一个文件或多个文件没啥区别，同时他们没有`#include的概念`，所以只要共用一个命名空间，都没有问题。
    + [E902SimpleCircle.java]()，在一个类里实现了901的功能。
    + [E903TV.java]()，对电视机的相关操作
    + [E904TestTV.java]()
    + **复习题**
        + 如何定义一个类？如何创建一个对象？
        + 描述对象和它的定义类之间的关系。如何声明一个对象引用变量？
+ 9.4 使用构造方法构造对象
    + 构造方法三个特征
        + 具备和所在类相同的名字
        + 没有返回值，**可以重载**
        + **构造方法在使用new操作符创建对象的时候被调用**
    + 之前代码里`new Circle()`和`new Circle(25)`用的是不同的构造方法。
    + 区分**无参构造函数**`new Circle()`和**默认构造函数**【当且仅当类中没有明确定义任何构造方法时才会自动提供它】。
    + **复习题**
        + 构造方法和普通方法之间的区别？什么时候类将有一个默认构造方法。
+ 9.5 通过引用变量访问对象
    + 引用变量和引用类型 
        + `Circle myCircle = new Circle()`，变量myCircle中放的是对circle对象的一个引用。【**对象引用变量和对象是不同的**】
        + **数组是用new操作符创建的。一个数组变量实际上是一个包含数组引用的变量。**
    + 访问对象的数据和方法
        + `.`点操作符（对象成员访问操作符）
        + `Math.pow(3,2.5)`能用的原因是Math的所有方法都是用关键字static定义的静态方法。`Circle.getArea()`这样的调用是不对的，必须用`myCircle.getArea()`这种。
        + **用变量来引用对象**，`new Circle(5).getArea()`这种属于**匿名对象**。
    + 引用数据域和null值  *lionel 没看呢*
    + 基本类型变量和引用类型变量的区别
    + **复习题**
+ 9.6 使用Java库中的类
    + Date类 `java.util.Date`
    + Random类 `java.util.Random`
        + **创建Random对象时，必须指定一个种子或者使用默认的种子**
    + Point2D类 `javafx.geometry`
    + **复习题**
        + 如何为当前时间创建一个Date？如何显示当前时间？
        + 如何创建一个Point2D？
+ 9.7 静态变量、常量和方法 *还没看*
    + [E906CircleWithStaticMembers.java]()
    + **复习题**
+ 9.8 可见性修饰符
    + **默认类、方法和数据域可以被同一个包中的任何一个类访问的**。【包私有、包内访问】
    + **包可以用来组织类。** `package packageName`
+ 9.9 数据域封装
    + 将数据域声明为私有的，**数据域封装**。
        + 数据可能被篡改。
        + 使类变得难于维护，同时容易出现错误。
    + **为了能够访问私有数据域，可以提供一个get方法和set方法**，被称为“访问器和修改器”。
    + [E908CircleWithPrivateDataFields.java]()
    + [E909TestCircleWithPrivateDataFields.java]()
    + **复习题**
+ 9.10 向方法传递对象参数
    + 可以将对象传递给方法，**同传递数组一样，传递对象实际上是传递对象的引用**。
    + **Java只有一种参数传递方式：值传递（pass-by-value）**。
    + [E910TestPassObject.java]()
        + 传递基本类型值和传递引用值的差异。
    + **引用上的传值在语义上最好描述为传共享（pass-by-sharing），也就是说，在方法中引用的对象和传递的对象是一样的。**
    + **复习题**
        + 描述传递基本类型参数和传递引用类型参数的区别，并给出下面程序的输出：
+ 9.11 对象数组
    + `Circle[] circleArray = new Circle[10];`**对象的数组实际上是引用变量的数组**。
    + [E911TotalArea.java]()
+ 9.12 不可变对象和类
    + **String类就是不可变的**，把类里的set方法删掉，该类就变成不可变类。
    + 要使类成为不可变类，必须满足下面的要求：
        + 所有数据域都是私有的。
        + 没有修改器方法，即set方法。
        + 没有一个返回指向可变数据域的引用的访问器方法。
    + **复习题**
+ 9.13 变量的作用域
    + **实例变量和静态变量的作用域是整个类**。
    + 局部变量和一个类变量同名，那么局部变量优先，而同名的类变量将被隐藏。
+ 9.14 this引用
    + **this关键字引用对象的实例成员**，但一般会省略。`this.getArea()`等价于`getArea()`。
    + 使用this引用隐藏数据域
    + 使用this调用构造方法
        + `public Circle(){this(1.0)//this关键字用于调用另外一个构造方法}`
    + **复习题**
        + 描述this关键字的角色。
+ 本章小结
+ 编程练习题【设计类并画出UML类图；实现UML中的类；使用类开发应用程序】

###  chap10 面向对象思考
+ 10.1 引言
    + **类的设计**
+ 10.2 类的抽象和封装
    + **类的抽象**：是指将类的实现和类的使用分离开。
    + **类的封装**：实现的细节被封装并且对用户隐藏。
    + [10-1 TestLoanClass.java]()
    + [10-2 Loan.java]()
    + **类应该通过构造方法、属性和方法提供各种方式的定制**。
    + **复习题**
        + 重新定义10.2中的Loan类，去掉其中的设置方法，这个是不可改变的吗？
+ 10.3 面向对象的思考
    + **使用面向对象范式的软件设计重点在对象以及对对象的操作上**。
    + [10-3 UseBMIClass.java]()
    + [10-4 BMI.java]()
    + **复习题**
        + 10-4中的BMI类是不可改变的吗？
+ 10.3 类的关系
    + **类中间的关系通常是关联、聚合、组合以及继承**。
    + 关联 
    + 聚集和组合 【聚集和组合，都算组合】
        + *空心菱形*和*实心菱形*
    + **复习题**
        + 类之间的常用关系是什么？
        + 聚集和组合的UML图标识是什么？
+ 10.5 示例学习：设计Course类
    + [10-5 TestCourse.java]()
    + [10-6 Course.java]()
+ 10.6 示例学习：设计栈类
    + [10-7]()
    + [10-8]()
+ 10.7 将基本数据类型值作为对象处理
    + **Java中基本数据类型值不是一个对象，但是可以使用Java API中的包装类来包装成一个对象**。
+ 10.8 基本类型和包装类类型之间的自动转换
+ 10.9 BigInteger和BigDecimal类
+ 10.10 String类
+ 10.11 StringBuilder和StringBuffer类