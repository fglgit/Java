# JDK

## JDK安装

**配置环境变量**

> Win10系统会在当前目录下查找输入的执行文件

> 如果不存在，则会在path的环境变量中查找

把对应路径存到环境变量中去就行

`where java`

查看环境变量对应可执行文件对应的路径

> 环境变量可以设置为单个用户或者全体

## Java快速入门

> Java语句结束带上分号;

编译`Javac hello.java`

运行`java hello`  不用带上`.class`

由于有中文，所以存在编码问题 *save with encoding Chinese*

因为从控制台属性看出控制台的编码为gbk，所以编写的.java文件应该为gbk编码

| .java文件  | .class文件     |
| ---------- | -------------- |
| ==源文件== | ==字节码文件== |

.java -> .class -> 结果

javac编译	  java运行(把.class装载到jvm机执行)



## Java开发细节

* java源文件为.java，源文件的基本组成部分是类class
* java应用程序的执行入口是main()，格式固定
* java严格区分大小写
* java函数由语句组成，语句必须要有;
* {{}}

* **一个源文件中最多只能有一个public类，其他的个数不限** 
* 编译后每一个类都对于一个.class文件，一个文件多个类，多个.class文件
* **如果源文件包含一个public类，则文件名必须为其类名**
* main方法可以写在非public类，然后指定运行非public类，`java dog`

## 快速学习技术知识点

先快速入门，接着再深入细节
