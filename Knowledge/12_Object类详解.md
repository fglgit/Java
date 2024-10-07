[toc]

# Object类详解

> Object类是所有类的父类

类Object是类层次结构的根类，每个类都使用Object作为超类，所有对象（含数组）都实现了这个类的方法，即所有的对象理论上都能使用Object的方法。

##  ====和equals对比==

==是一个比较运算符

1. 可以判断基本类型，也可以判断引用类型
2. 如果判断**基本类型**，则判断的是**值是否相等**
3. 如果判断**引用类型**，则判断的是**地址是否相等**，即判定是不是同一个对象

---

equals是Object类中的方法，==只能判断引用类型==

`"hello".equals("abc")` "hello"为对象，equals为方法，"abc"为实参

Object源码中的方法**默认判断地址是否相等** ，即判断是否为同一个对象，但是子类往往**重写**该方法，用于**判断内容是否相等** 例如Integer String

```
//Object类	判断是否为同一个对象
public boolean equals(Object obj) {
    return (this == obj);
}
```

```
//String类	判断是否为同一个对象或对应字符串相等
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String anotherString = (String)anObject;
        int n = value.length;
        if (n == anotherString.value.length) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = 0;
            while (n-- != 0) {
                if (v1[i] != v2[i])
                    return false;
                i++;
            }
            return true;
        }
    }
    return false;
}
```

```
//Integer类	判断值是否相等
public boolean equals(Object obj) {
    if (obj instanceof Integer) {
        return value == ((Integer)obj).intValue();
    }
    return false;
}
```


> 查看jdk源码
>
> IDEA配置好JDK后，jdk的源码就配置好了，在IDEA中查看某个方法源码时，光标选中，`Ctrl + b` 查看
>
> 选中类的名称，也可以查看该类的源码

### 重写equals方法

未重写，则按照Object的方法进行判断。重写，则按照新的方法判断

特别注意在重写时，判断字符串相等用equals

> 基本数据类型==即比较其值，字符和数字可以比较
>
> 如果两者不同类型，而且没有什么关系，使用==则会报错，例如两个不同类型的对象不能比较
>
> 报错不可比较的类型: java.lang.String和java.lang.Integer

## ==hashCoed==

hashCode()是Object中的一个方法，会返回对象的哈希码值

1. hashCode提高具有哈希结构的容器的效率
2. 两个引用，如果指向的是同一个对象，则哈希值肯定一样
3. 两个引用，如果指向的不是同一个对象，则哈希值肯定不一样
4. **哈希值主要根据地址进行计算**的，但是哈希不完全等价于地址
5. 在集合中的hashCode如果需要，也会**重写**

## ==toString==

默认返回：全类名（包名+类名）+@+哈希值的十六进制

返回的是其类所在包的包名，以及其类的类名。

**子类往往会重写toString 方法，用于返回对象的属性信息**

未重写，则调用Object类的toString方法

> IDEA快捷键重写，Alt+Insert 后选中toString，就是在快捷生成构造器那里。重写后默认把对象属性输出

**当直接输出一个对象时，toString 方法会被默认调用**

```
System.out.println(obj.toString());
System.out.println(obj);
```

##  ==finalize==

1. 当对象被回收时，系统自动调用该对象的finalize方法。子类可以重写该方法，做一些释放资源的操作
2. **回收的时机** ：**当某个对象没有任何引用时，则jvm就会认为其是垃圾对象，就会使用垃圾回收机制来销毁对象，销毁该对象前，会先调用finalize方法。** 程序员可以在finalize中写自己的业务逻辑代码，断开数据库连接，打开文件。如果程序员不重写，则调用Object的方法，默认处理；重写则可以添加自己的方法，默认重写就是调用父类的finalize
3. 不是立马就回收了，有其自己的算法GC垃圾回收算法。垃圾回收机制的调用，是由系统来决定（有自己的gc算法，也可以通过`System.gc()` **主动除法垃圾回收机制** gc不会阻塞，而是并行回收了
4. 实际不动，面试问题。。。



# 断点调试 breakpoint debug

类似于C++中的调试吧

**在断点调试过程中，是运行状态，是以对象的==运行类型==来执行的。**

快捷键

```
F7	跳入	跳入方法内
alt+shift+F7	强制跳入 force step into 或者改配置
F8	跳过	逐行执行代码
shift + F8 跳出	跳出方法与F7对应
F9	执行到下一个断点
```

先加断点，再debug

调试方便追溯源代码

断点可以在debug过程中下，还可以给系统的代码下断点

* 追踪对象创建过程 1.加载类信息loadclass 2.初始化 3.返回对象地址
* 查看动态绑定机制

# OOP零钱通

> Date是java.util,Date下面的类型，表示日期date=new Date();获取当前的时间
>
> 日期格式化SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

```
Date date=null;
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
date=new Date();
System.out.println(date);
System.out.println(sdf.format(date));
```

> 代码粒度要小，一段代码完成一段功能，尽量不要嵌套一起

==**面向对象**==

主方法单独一个类，其余方法单独一个类，然后再主方法内创建一个方法的对象，完成功能、

把各个功能分为一个方法，变成类的属性



# 作业

![image-20240815122720341](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240815122720341.png)

`super` **调用父类的属性和方法的修饰词必须是public或者protect**

`this` **除了调用本类的属性和方法，还可以调用父类的属性和方法，如果子类有相同名字的属性和方法（重写），则不能调用父类的属性和方法**

![image-20240910140654402](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240910140654402.png)

> 匿名对象，没有引用，直接调用方法 new Demo().test();

> 重写——把核心代码稍微重写，使得其得到更新，而不用去修改核心代码

![image-20240911160801628](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240911160801628.png)

显然看出，向上转型不能调用子类特有的方法，但是可以调用子父类共有的方法。

而且子类本身是允许调用父类的方法的，先从子类本身找，再往上找

## ==与equals的区别

![image-20240911161035530](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240911161035530.png)



**对象数组创建：**

```
Person[] persons = new Person[4];
persons[0] = new Person("jack",'男',10,"001");
```

> 光只有`Person[] persons = new Person[4];` 实际上并没有创建对象的内存空间。

> 对象初始化可以`Person temp = null`

![image-20240913093018285](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240913093018285.png)

> `instanceof` 看的是对象的运行类型

> `getClass()` 是Object类下的一个方法，用于返回此Object的运行类型

![image-20240916203456549](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240916203456549.png)

![image-20240916203656353](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240916203656353.png)

# 房屋出租

> 分层模式——程序框架

增删改查(crud)

![image-20240916204615096](C:\Users\F\AppData\Roaming\Typora\typora-user-images\image-20240916204615096.png)

> 可以按照该模式，分成很多的子文件夹，便于管理

> 工具类Utility	提高开发效率
>
> 在实际开发中，公司会提供相应的工具类和开发库，以提高开发效率。例如专门的Utility类用于处理用户输入

**直接使用类调用方法，而没有创建对象**

==**因为当一个方法是static时，就是一个静态方法，静态方法可以直接通过类名.方法名调用。**==

> 在switch的判断语句中，case后面跟的是数字和字符有区别，1不同于'1'

> 通过创建对象实现两个不同类直接的联系。

> 对象数组可以直接赋值的，不用一个一个属性赋值

> 字符串拼接操作，其中可以化作字符串的尽量不要写成字符，不然会导致数据错误的相加，而非拼接
