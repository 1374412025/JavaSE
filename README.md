[TOC]

# JAVA入门预科

##计算机硬件

**CPU 	Me mory内存	Motherboard主板**

**IO设备**	**显卡**	**风扇**

==冯诺依曼体系==
	输入设备——存储器——输出设备
		运算器		控制器			（CPU）
	

![冯诺依曼](https://pic2.zhimg.com/v2-8b5b6ff186ebb7deef6905aa71c48261_r.jpg)

##计算机软件

**系统软件：DOS，windows，linux，mac，Unix，Android，IOS**

**应用软件：WPS 	LOL**
人机交互

**DOS 命令 ——cmd**

```bash
#盘符切换 D:
#查看当前目录下所有文件 dir
#切换目录	cd (change directory)
	cd filename	 	同盘符
	cd /d f:\filename 	跨盘符/d
	cd ..返回上一级cd..
#清理屏幕 cls 		(clear screen
#exit退出
#查看电脑ip	 ip config
#打开程序	calc打开计算器 notepad记事本	mspaint图画
#ping 命令 ping www.baidu.com
#创建文件夹 md directoryname		删除文件夹 rd directoryname
#创建文件  cd>filename		 删除文件 del filename

```

-----


# 认识JAVA

1972	**C语言诞生**

> 贴近硬件，运行极快，效率极高，
> 操作系统，编译器，数据库，网络系统
> 指针和内存管理

1982	**C++**

> 面向对象
> 兼容C
> 高质量类库

1995	**JAVA**

> **没有指针和内存管理**
> **可移植性**,一次编写,到处运行(JVM )write once	run anywhere
> **面向对象**
> 类型安全
> 高质量类库
> **为服务端而生 三高:高可用	高性能	高并发**

##JAVA优势特性

==**简单性,面向对象,可移植性,高性能,分布式,动态性(反射),多线程,安全性,健壮性**==

## JAVA三大版本

JAVASE 标准版	桌面程序，控制台开发

JAVAME 无了

JAVAEE 企业版 web端，服务器开发

## JDK,JRE,JVM

JDK:	JAVA Developoment kit	Java 语言的软件开发工具包

JRE:	Java Runtime Environment		java运行环境，

JVM:	Java virtual Machine(跨平台核心，java虚拟机)

![psc (1208×505) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5hj1ooXiADjqIwX8AVEj3ryHsypaJeWaBsRDuyChwbfMxMFgjqGrgi1YCvFshi.t6Ji9ZUw2iasO4vAUjB2ni3U!/b&bo=uAT5AQAAAAADN1Y!&rf=viewer_4)



## 开发环境

**卸载JDK**
在环境变量中系统变量的JAVA_HOME中找到路径

1. 删除安装目录
2. 删除JAVA_HOME
3. 删除path下关于JAVA的目录
4. cmd查看java -version

**安装JDK**

1. 搜JDK8,Oracle
2. 下载对应电脑版本
3. 双击安装JDK
4. **记住安装路径**
5. 配置环境变量
   - 我的电脑-右键-属性-高级-环境变量
   - 系统变量
     - JAVA_HOME	D:\language_envir\JDK\jdk1.8
   - 配置系统变量中的path变量
     - %JAVA_HOME%\bin
     - %JAVA_HOME%\jre\bin
   - 测试cmd 输入java -version

**project structure中进行环境选择**

![psc (745×350) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5lfl0xt7SMHORmPmZBqWAtRZA85mq0g03m9DnZKig5Fj4pVHe3eVM.VIm1us5LZhmMz8yUOLHKjc1plJrmYpLWc!/b&bo=6QJeAQAAAAADF4Y!&rf=viewer_4)

project structure中的module可以设置资源文件夹

![psc (1275×380) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5lfl0xt7SMHORmPmZBqWAtRA6DLMzX7iSJetW3QgmVvTbyWlAnpUTunNeWOHkd6DZ7meIC8O5lZ3GOpgpRSmmlw!/b&bo=.wR8AQAAAAADF7A!&rf=viewer_4)



**Run 图标是灰色的？Add Configuration 添加配置**

1. 点击Add Configuration 并且单击＋
2. 添加Application  选择主启动类 JRE
3. 设置Use classpath of module选择运行的模块
4. apply

**字体设置**
SettingS——Editor——ColorScheme

快捷键设置

Settings——Keymap——搜索框右边按键，按下快捷键寻找

## cmd编译运行

- 新建hello.java文件
- 编写代码
- cmd 编译：==javac -encoding UTF-8 文件名.java==      生成java.class
- cmd 运行：返回到src下，==java pkg1.pkg2....filename==              

```java
public class Hello{	 						#表示一个类，类名Hello
	public static void main(String[] args){
    										#main是方法，括号内是参数，参数未使用
			System.out.print("Hello,world");
    										#输出语句“hello，world”
	}
}
```

JAVA程序运行机制

编译型（compile编译器）成“书”		操作系统、C、C++
解释型（interpret解释器）		  JAVA、JAVAScript

.java	→	编译器（javac)	→	字节码*.class	→	类装载器	→	字节码校验器	→	解释器	→	操作系统平台
**JAVA先编译再解释**

## IDEA安装和项目创建

IDE集成开发环境
integrated development environment
代码编辑器、编译器、调试器和图形用户界面 （vs)

new project 选择empty project

![psc (479×679) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5lfl0xt7SMHORmPmZBqWAtTZw2.D3BUoOczi8HjSmykYjCHXtdZe98hsIajanB7RdRBfIIF3OZqYXg6TMX4gr68!/b&bo=3wGnAgAAAAADF0k!&rf=viewer_4)

然后右键文件夹，点击新建module
project——module——src——package——class

##IDEA快捷键

**psvm 	public static void main(String[] args){}**
**a.sout**		
**fori 		for循环**		**forr**  倒循环
**foreach	增强for**
**arrays.for**	数组增强for

-----

**双击Shift打开搜索**

**ALT+ INSERT** **构造函数、setter**
**ALT+ Enter 补充语句**，cast可以强制类型转换，解决报错

-----

**Shift+F10编译运行**
**Shift+Enter下一行**

****

**Ctrl + D 复制当前行到下一行**
**Ctrl +/ 一键注释**
**Ctrl + R替换**
**Ctrl + W行尾选一行**
**Ctrl + H** **打开继承树**
**Ctrl + O** **重写方法**

-------

**Ctrl+shift+Enter 规范格式**
**Ctrl+shift+F10编译运行当前文件**

-----

**Ctrl+Alt+T** 	**自动包裹**



###版本更新

- Java1.5 Java支持传递同类型的可变参数给一个方法
- javaSE5   引入增强for，用于数组或者集合
- JavaSE7  switch开始支持String类型
- 工具类，java.util.Scanner是javaSE5的新特征



-----

# JAVA基础base

## 注释

**单行注释**：//
ctrl+/ 	用单行注释方法注释多行
**多行注释**：/*			*/
		搜	有趣的代码注释
**文档注释**：/**	*/ 可识别	JavaDoc

## 关键字

![psc (1024×734) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5lfl0xt7SMHORmPmZBqWAtRs7U0V5EKLe9TJ4Whsyjhx1Edjn.QSlWIAROl7xr.4WF6NPvnt.aDW23YTv5AM4ec!/b&bo=AATeAgAAAAADB*o!&rf=viewer_4)

## 标识符

==JAVA所有组成部分都需要名字，类名，变量名以及方法名都被称为标识符==

![psc (1415×765) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5nH*jLI6O.T0dSCtDdGFvaWwFvzhImszFKXc.C*27m3u1lsdj0HXHAGmWZ1Z3I4gK0yRvyL1BzhlRSviET2uF4s!/b&bo=hwX9AgAAAAADB18!&rf=viewer_4)

类名：public class  Hello 								**Hello**就是类名
public static void main（String[] args)  	  **main**就是方法名
String student = "jingtao"								**student**就是变量名



## 数据类型

**强类型语言(java、C++、C)**
	要求变量的使用严格符合规定、所有变量必须先定义后才能使用
	安全性高，速度稍慢

**弱类型语言(javascripe	VBps)**

 JAVA 数据类型分两大类

位(bit)：是计算机**内部数据储存最小单位**，11001100是一个八位二进制数。
字节(Byte):是计算机**数据处理的基本单位**，1B=8bit。
字符：是指计算机中使用的字母、数字、字和符号。
bps即1bits per second
1024B=1KB	2^2^	

**基本类型(primitive type)：整型、浮点型、字符型、布尔型**

- 整数类型——byte1、short2、int4、long8
  - long类型要在后面加个L

- 浮点型——float4、double8
  - float类型要在后面加个f：float num = 50.1F 
- 字符类型——char2
- 布尔类型——Boolean1(true、false)

**引用类型(reference type):接口interface、数组[ ]、类class[ ]**



==###拓展==
整数：二进制0b 十进制 八进制0   十六进制0x		0x11=17
浮点数：有精度限制，超过精度会有舍入误差，避免使用浮点数对比，使用Bigdecimal数学工具类	字符：Unicode表，(int)c1 强制数据类型转换	U0000~UFFFF  65536=2^16^	
布尔：boolean flag = ture; if(flag) 
转义：escape character![常见转义字符表](https://imgconvert.csdnimg.cn/aHR0cHM6Ly9yYXcuZ2l0aHVidXNlcmNvbnRlbnQuY29tL0pvdXJXb24vaW1hZ2UvbWFzdGVyL0phdmElRTUlOUYlQkElRTclQTElODAlRTglQUYlQUQlRTYlQjMlOTUvJUU1JUI4JUI4JUU4JUE3JTgxJUU4JUJEJUFDJUU0JUI5JTg5JUU1JUFEJTk3JUU3JUFDJUE2JUU4JUExJUE4LnBuZw?x-oss-process=image/format,png)




## 类型转换

由于JAVA是强类型语言，有些运算需要用到类型转换
从低到高:
byte	short	char	 int	long	float	double
**不同类型的数据先转换为同一类型，然后进行运算**
高到低，强制转换 	(类型)变量名
低到高，`自动转换

- 不能对布尔值转换

- 不能把对象转换为不相干的类型

- 转换时候可能存在内存溢出，或者精度问题

- 高转低，强制转换

**操作数较大，溢出问题**（JDK7新特性，数字之间可以用下划线分割
int a= 10_0000_0000;	int b =20;
溢出可能出现在**高转低，低之间的运算**eg：a\*b	
需要(long)a\*b

## 变量&常量

**变量variable**即可以变化的量，强类型语言必须声明其类型
JAVA变量是程序中最基本的存储单元，**==变量名，变量类型和作用域==**

```java
type varName [=value] [{,varName[=value]}];
```

**//数据类型	变量名 = 值；**可以使用逗号，隔开来声明多个同类变量
**变量作用域**   在使用变量时需要遵循的原则为：就近原则
首先在局部范围找，有就使用；接着在成员位置找

- 类变量			实例变量定义前加一个static	
- 实例变量		类中定义，方法外面
- 局部变量		方法中定义

==**实例变量(对象变量、类成员变量)**==
    从属于类由类生成对象时分配空间，各对象间的实例变量互不干扰，通过对象的引用来访问实例变量
	①成员变量定义在类中，在整个类中都可以被访问。被对象调用
	②**随着对象的建立而建立，随着对象被回收而释放，存在对象所在的堆内存中。**
	③成员变量有默认初始化值。

==**类变量(静态变量)：**==
    特殊的实例变量，用static修饰，类的静态变量，所有这**类生成的对象共用这个类变量，类转载时就分配存储空间。**
	①静态变量随着类的加载而存在，随着类的消失而消失。
	②静态变量可以被对象调用，还可以被类名调用。
	③静态变量数据存储在方法区(共享数据区)的静态区，所以也叫对象的共享数据。

==**局部变量**:==
	方法中或者某局部块中声明定义的变量，或者方法的参数，只存在于创建的block里（{}之间），无法在块外进行操作
	①局部变量只定义在局部范围内，如：函数内，语句内，只在所属的区域有效。
	②局部变量存在于栈内存中，作用的范围结束，变量空间会自动释放。
	③局部变量没有默认初始化值 

![20151221224044459 (629×331) (csdn.net)](https://img-blog.csdn.net/20151221224044459?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQv/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

**常量constan**t：初始化initialize后不再改变；
特殊的变量，后续不允许被改变

```java	
//final 数据类型 常量名=值
final double PI = 3.14   
```

常量名一般使用大写字符

---------

==**命名规范**==

1. 所有变量、方法、类名：见名知意
2. 类成员变量、局部变量、方法名：**首字母小写和驼峰原则**(单词首字母大写)lastName
3. 常量：**大写字母和下划线**：MAX_VALUE
4. 类名：**首字母大写和驼峰原则** BaseJava



## 运算符

- 算术运算符	+，-，*，/,%,++,--	==**%取余，模	a++后自增**==
- 赋值运算符	=
- 关系运算符    >	<	>=	<=	==	!=	instanceof
- 逻辑运算符	&&	||	!				==**与或非    短路运算**==
- 位运算符		&	|	^	~	>>	<<	>>>		==**与 或 异或 非 右移 左移 无符号右移**==
- 条件运算符	?	:
- 扩展赋值运算符	+=	-=	*=	/=

**在计算机中，负数以其正值的补码形式表示，补码为原码的反码+1；**
关于位运算参照：[博客园SunArmy](https://www.cnblogs.com/SunArmy/p/9837348.html)


复杂运算使用Math包，```double pow = Math.pow(2,3);```

```Java
//字符串连接符	+
System.out.println("后面"+a+b);   //不会计算	后面1020
System.out.println(a+b+"前面");   //会计算	30前面
```

```java
//条件运算符x?y:z		如果x++ture，则结果为y，否则为z
int socre = 80;
String output = socre < 60 ? "不及格" : "及格";
System.out.println("out = " + output);
```

```java
//显示一段代码运行时间
long start = System.currentTimeMillis(); 
//此处写要测试的代码
long end = System.currentTimeMillis(); 
System.out.println("共耗时"+（end-start）+"毫秒");
```





## 包机制

包的本质就是文件夹，为了更好地组织类，用于区别类名的命名空间

```java
package	pkg1[.pkg2[.pkg3···]]；
import package1[.pkg2···].(classname|*);
import package1[.pkg2···].* //.*通配符  导入包内所有类
```

一般利用公司域名倒置作为包名；com.kuangstudy.www




## Java.Doc

**[在线API帮助文档](https://docs.oracle.com/javase/8/docs/api/)**

javadoc命令是用来生产自己的API文档的
参数信息

- @author 作者名
- @version 版本号
- @since 指明需要最早使用的JDK版本
- @param 参数名
- @return 返回值情况
- @throws 异常抛出情况



1. **命令行CMD中生产文档**

   **javadoc -encoding UTF-8 -charset UTF-8 Doc.java**
   javadoc 参数 java文件
   生成index.html首页	可打开

2. **使用IDEA生产JavaDoc文档**

# Java 流控制

## scanner交互

工具类，java.util.Scanner是java5的新特征
**可以通过Scanner获取用户输入**

```java
Scanner s  = new Scanner(System.in);

String str = s.next();
String str2 = s.nextLine();
int i = s.nextInt();
double d = s.nextDouble();
float f = s.nextFloat();

s.close();
```

通过Scanner类的**next()**与**nextLine()**方法获取输入的字符串
输入栈

**==next()==**				**hasNext()**判断是否还有输入

- 一定读取到有效字符后才结束输入
- 对输入有效字符之前遇到的空白，next()方法会自动将其去掉
- 只有输入**有效字符后才将其后面输入的空白作为分隔符或者结束符**
- **next()不能得到带有空格的字符串**

==**nextLine()**==			**hasNextLine()**判断是否还有输入（布尔

- 以**Enter为结束符**，此方法返回的是输入回车之前的所有字符
- **可以获得空白**
- 可以用来清空scanner缓存

**==nextInt()==**			**hasNextInt()**判断是否还有整数输入（布尔

- 下一个输入必须是整数

**==nextFloat()==**		**hasNextFloat()**判断是否还有小数输入（布尔

- 下一个输入必须是小数

**==nextDouble()==**		**hasNextDouble()**判断是否还有小数输入（布尔




## 顺序结构

Java的基本结构就是顺序结构,除非特别指明，否则一步步执行
语句与语句之间，框与框之间都是从上到下的顺序执行，**任何算法离不开的基本算法结构**

## 选择结构

- if单选、双选、多选
- 嵌套if
- switch多选择

`s.equals("string")`判断s和“”是否相等

 **if单选择结构**

```java	
if(布尔表达式){
    //布尔表达式为ture将执行
}
```

 **if双选择结构**

```java	
if(布尔表达式){
    //布尔表达式为ture将执行
}else{
    //布尔表达式为flase执行
}
```

**if多选择结构**

```java	
if(布尔表达式1){
    //布尔表达式1为ture将执行
}else if(布尔表达式2){
    //布尔表达式2为ture执行
}else if (布尔表达式3){
    //布尔表达式3为ture执行
}else{
    //以上都不ture
}
```

 **嵌套if**

```java
if(布尔表达式1){
    if(布尔表达式2){
   	//2ture
    }
}
```

**switch多选择**

```java
switch(expression){
    case value://语句
        break;	//跳出switch，不加就执行下一个case
    case value://语句
        		//没有break会case穿透
   case value://语句
        break;//case穿透
    default://语句 
}
/*switch语句中的变量可以是byte short int char 
JavaSE7开始，支持String类型，case标签必须为字符串常
量或字面量*/
```

**==反编译==**：将class文件变成java，可读化（IDEA）

- 在project structure中查看 project compiler output
- 在文件夹中拷贝，在IDEA中打开

## 循环结构

**while循环**

```java
while(布尔表达式){
    //循环内容
}
//只要布尔为true一直循环，大多数情况需要使其停下来，避免死循环
//少数情况可以一直执行比如服务器的请求响应监听
```

**do...while循环**

```java
do{
    //循环
}while(布尔)
//至少先执行一次，即先执行再循环    
```

**for循环**

```java	
for(初始化;布尔表达式;更新){
   //循环
}
for(;;){}//死循环
//支持迭代的通用结构，是最有效最灵活的结构
//在结束前就确定了次数	100.for快捷100次循环
```

 **增强for循环**

```java
for(元素类型 e : 数组或集合对象)
{
    //代码句子
}
//java5引入，用于数组或者集合
//foreach快捷键
//循环次数为数组长度，会将元素依次赋值给e
```

**Break、Continue、goto**
```break;```是强制终止循环，不再执行循环中剩余语句
```continue;```终止某次循环过程，到下一次循环判定。for表达式3会     进行
```goto;```java没有goto	但是continue和break可以带标签label：

# Java方法method

## 方法定义(this)

```java 
System.out.println()
//类.对象.方法()
//设计方法的原则：一个方法只做一个功能，原子性
修饰符 返回值类型 方法名(参数类型 参数名) throws IOException{
    //方法体
    returen 返回值
}    
```

**修饰符**：可选(public、static、private)告诉编译器如何调用该方法
**返回值类型**，使用void是不返回或`return;`返回空，其他就`return 返回值`
	return可以终止方法	break可以终止循环
**方法名**：首字母小写驼峰原则，方法名和参数表
**参数类型**：有参和无参
	**形参**是定义作用，用于接收外界输入数据
	**实参**是实际传过来的参数

**异常抛出：** ······

**this关键词**:					
**==是对当前对象的引用，引用的是类当前的实例==**，静态方法中没有new实例
非静态变量可以用的原因是，在用非静态方法时需要提前new一个实例，所以后续this有引用的对象实例	所以**静态方法中不能用this**

```java
this.属性名称：//访问类中的成员变量，用来区分成员变量和局部变量，重名
	Person(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
this.方法名称	//static静态方法中不能用this
    public void setName(String name){
        this.name=name;
        this.getName();
    }
this()	//访问本类的构造方法	()如果有参数，就是调用指定的有参构造
     	//1.this() 不能使用在普通方法中 只能写在构造方法中
   		//2.必须是构造方法中的第一条语句
	public User(String name){
        this.name = name;
    }
    public User(String name,String sex,int age){
        this("哈哈");//调用上面单参数构造
        this.sex=sex;
        this.age=age;
    }    
```



## 方法调用

**调用方法**：`对象名.方法名()`
有返回值就赋值	`int larger = max(3,4)`		数据类型(int float···)
没有返回值`System.out.println("hello")`		void 

**(非)静态方法调用：**
//static静态随着类加载而创建，时间片非常早
//非静态是随着对象的创建而创建

```java
public static void say(){}
静态方法		和类一起加载的，时间片靠前
调用：
   类外： 类名.方法名() 		本类里：方法名();
===================================
public  void say(){}
非静态方法 	  		实例化后才存在
调用：
    类名 对象名 = new 类名(参数);	//实例化
	对象名.方法名();
```

**值传递**：在调用函数时，将**实际参数复制一份传递到函数中**，这样在函数中对参数进行修改，**就不会影响到原来的实际参数**；**JAVA就是值传递**
**引用传递**：在调用函数时，将实际参数的地址直接传递到函数中。这样在函数中对参数进行的修改，**就会影响到实际参数**

参考网站：[引用传递和值传递](https://blog.csdn.net/SummerOfFoam/article/details/109570841)
总结：
对于**基本数据**来说，在进行传递的时候， 将数据的值复制了一份进行的传递，是**值传递**；
对于**引用类型**，因为该对象本身指向的是它在内存中的地址，所以方法调用的时候，实际上是创建的地址的副本，所以在方法中对其值进行改变的时候，他的地址没有变，值也就跟着改变了；

而当你重新**创建一个对象**的时候`new 类名()`，它指向的便是另一个对象的地址了。这样看来跟值传递的定义便不冲突了。

## 方法重载

重载就是在一个类中，有相同的函数名称，但是形参不同

- 方法名称必须相同
- **参数列表必须不同**(个数，类型，参数排列顺序)
- 返回类型可以相同
- 仅仅返回类型不同不足以重载

实现理论:方法名称相同时，编译器会根据方法的参数个数、参数类型等匹配

## 命令行传参

有时候希望运行一个程序时再传递信息，依靠传递命令行参数给main()
在cmd中cd到java目录，javac编译.java文件，
回退到src使用java运行，`java com.jing.method.ComPara 参数`

```java
D:\Note_code\JavaCode\JavaSE\src>java base.method.CmdPara this is jingtao
//args[0]:this
//args[1]:is
//args[2]:jingtao
```

## 可变参数

Java1.5 Java支持传递同类型的可变参数给一个方法
在方法声明中，在指定参数类型后**加一个省略号(...)**
**一个方法中只能有一个可变参数，他必须是最后一个参数**，任何普通参数必须在他之前声明
**本质是数组**

```java
public void test(float a,int...i){//输出可变参数第一个
	System.out.println(i[0]);
}
test(1,2,3,3,5);//2
```

## 递归

自己调用自己，套娃，思想问题
用简单程序解决一些复杂问题，用有限的语句来定义对象的无限集合

- **递归头**：什么时候不调用自身，没有头就**死循环**
- **递归体**：什么时候调用自身方法

**栈机制**：main压在最下面，一个方法压一层，一直调用方法就会溢出
递归消耗栈，能不用递归就不用

# 数组

## 数组声明创建

**数组特征**：
数组是**相同类型数据**的集合，**长度确定**不可再改**数组.length**
**元素可以是任何数据类型**（基本类型和引用类型）
数组变量属于引用类型，**数组可以看成对象，元素看为成员变量**
**数组边界**：[0,length-1]
否则ArrayIndexOutOfBoundsExceotion数组下标越界异常

```java
dataType[] arrayRefVar;//首选
dataType arrayRefVar[];
//new操作符来创建数组
dataType[] arrayRefVar = new dataType[arraySize];
//等同下面
dataType[] arrayRefVar;//声明数组（压入栈里）数组并不存在
arrayRefVar= new dataType[arraySize]；//创建数组（堆中开辟）
//数组长度arrayRefVar.length
//使用数组下标进行访问arrayReVar[0]访问第一个元素 
```

**数组初始化Initialization**

- 静态初始化	（创建+赋值)
  - `int[] nums = {1, 2, 3};`
  - `User[] users = {new User(), new User()};`
- 动态初始化（声明、创建、默认赋值)
  - `int[] arrayVar = new int[4];arrayVar[0]=1;`
- 默认初始化

## 数组使用

- **For-each**				**arrays.for**
- 作为参数reverse(int[] arrays)、返回值

## 多维数组

数组元素中存数组对象		Multidimensional array

```java
int[][] arrays = {{1, 2}, {3, 4}, {5, 6},{7,8}};
//4*2的数组	arrays.lenth==4	arrays[0].length ==2
for (int i = 0; i <arrays.length ; i++) {
    for (int j = 0; j < arr ays[i].length; j++) {    			System.out.println(arrays[i][j]);
     }
}
```

## Arrays类

```java
//打印一维数组	toString
System.out.println(Arrays.toString(a));
//升序排序	sort
Arrays.sort(a);
//填充	fill
Arrays.fill(a,2,4,0);//第二个元素到第三个元素被0填充，默认全部
//对比	equals
Arrays.equals(a, b)//完全相等返回ture
//查找数组元素	binarySearch
binarySearch(Object[], Object key)
//找到的情况下：如果key在数组中，则返回搜索值的索引。
//2.找不到的情况下：
搜索值是数组元素，从0开始计数，得搜索值的索引值；
搜索值不是数组元素，且在数组范围内，从1开始计数，得“-插入点索引值”；
搜索值不是数组元素，且大于数组内元素，索引值为 – (length + 1);
搜索值不是数组元素，且小于数组内元素，索引值为 – 1。
```

## 稀疏数组

```java
SparseArray
当一个数组中大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来存，
处理方式：
    记录数组一共有	几行几列，有多少个不同值
    把具有不同值的元素值、、和行列值记录在一个小规模数组中 
步骤：
    //1.计算有效数总数
    //2.创建稀疏数组
	//3.遍历二维数组，将有效值放入稀疏数组
	//4.打印二维稀疏数组
```

# 面向对象编程OOP

## 面向对象

面向过程：
	**步骤清晰简单**、第一步、第二步···，适合简单问题
面向对象：
	物以类聚，**分类**的思想模式，适合复杂、多人协作的问题

对于描述复杂的事情：
从**整体**上，需要面向对象的思路分析整个系统。
具体到**微观**操作，任然需要面向过程的思路去处理。

**面向对象编程（Object-Oriented Programming）**
面向对象编程的本质：**==以类的方式组织代码，以对象的组织(封装)数据==**
**三大特征：**	**==封装、继承、多态==**

从代码运行角度考虑是先有类后有对象。**类是对象的模板**，是对对象的抽象
从认识论角度考虑是先有对象后有类。**对象是具体的事物**



## 对象创建

**类和对象的关系**:`oop.Demo01`
类是一种抽象的数据类型，他是对某一类事务整体的描述
对象是抽象概念的具体实例

一个类里面只有**==属性和方法==**两个板块

```java
修饰符 属性类型 属性名 = 属性值	//属性	
    对象名.属性名	//属性调用
修饰符	方法类型 方法名(参数){}	//方法
	对象名.方法名();
```

**使用new关键字创建对象**
使用new关键字创建的时候，会分配内存空间，会给创建好的对象默认的初始化，以及对类中构造函数的调用，

**类的构造器特征：**

- **构造函数名和类名相同**
- **没有返回类型，不能写void**

**类的构造器作用：**

- **new的本质在调用构造方法**
- **初始化对象的值**

**定义有参构造之前需要定义一个无参构造**（否则无参就没了）
**ALT+Insert** 快捷键 选择**constructor**

## new内存分析


栈	`oop.Demo02`

- 存放**基本变量类型**（8种、包含这个基本类型的具体数值）
- main()方法
- **引用对象的变量**（包含这个**引用在堆里面的具体地址**）

堆

  - **存放new对象和数组**(引用类型)
  - 可以被所有的线程共享，不会存放别的对象引用

方法区(堆)

- 包含了**所有的class类**(其方法和成员变量)       **static变量**(静态方法区)
- 可以被所有的线程共享


![psc (1281×622) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5nH*jLI6O.T0dSCtDdGFvaU9ghBiH.YQucxNJJNsD3Uq2thmn3WK7FmQ1H*O.zl9jOjOdQx1l28.sJq4V.P5Pg0!/b&bo=AQVuAgAAAAADB0o!&rf=viewer_4)



## **封装**

程序设计追求：**高内聚，低耦合**
高内聚：类的内部数据操作细节自己完成，不允许外部干涉
低耦合：仅暴露少量的方法给外部使用
**属性私有，get/set**	Alt+Insert选择setter和·getter
私有属性private，**可继承**，但是不可直接调用访问，需要调用**非私有方法来访问**，
默认public	 

1. 提高程序的安全性，保护数据
2. 隐藏代码的时限细节
3. 统一接口
4. 增加系统可维护性

## **继承**  

**extends**
继承是类和类之间的一种关系（还有依赖、组合、聚合）
**JAVA是单继承，没有多继承**，JAVA中所有类继承Object类
子类继承了父类，就会有父类的全部方法 
**Ctrl + H 打开继承树**
**不可继承final定义**，final断子绝孙

`oop.Demo03`

```java
//super	是对父类对象的引用，需要在继承中使用
//this 是对当前对象的引用，引用的是类当前的实例
this()和super()是访问本类、父类的构造方法,不能同时
只能放在第一行，结果可被覆盖
super只能出现在子类的方法/构造方法中
```

`oop.Demo04`

```java
//方法重写 区别重载		//成员属性不可重写
重载就是在一个类中，有相同的函数名称，但是形参不同
重写指的是继承类中的方法重写，是类与类之间的方法重写
//静态变量无法被重写，但是可以重新声明
alt+Insert——override	快捷重写
重写条件：
    1.方法名、参数列表必须相同
    2.修饰符范围可以扩大但不能缩小
	public > protected > default>private
    3.抛出的异常：范围可以被缩小，但不能扩大
		ClassNotFoundException < Exception
//无法被重写：
    //new是实例化过程,对非静态进行实例化,静态在声明的时候就加载
 
    static	方法属于类，他不属于实例，无法重写
	final 	常量池
	private	方法私有不让重写
```

**静态方法**跟类一起加载，是**类的方法**
**非静态方法**需要new**实例化**，是**对象的方法**

## **多态**	

`oop.Demo05`
动态编译：类型。	可扩展性。

1. 多态是**方法多态**，而不是属性多态
2. **类型转换有联系**，否则ClassCastException!
3. **存在条件**：
   - **继承条件**
   - **方法需要重写**
     	- **父类的引用指向子类对象**
     	`Father  a = new Son();`
     	**==一个对象的实际类型是确定的，但可以指向对象的引用类型有很多==（父类、有关系的类）**

```java
public class A extends B{...}//子类
A a = new A();
B b = new B();//可以指向的引用类型不确定
B c = new A();//父类引用指向子类对象	也可以B c = a ;
//A d = new B();反之不行
a.father();
b.father();
c.father();
//对象能执行哪些方法，取决于对象类型，跟new关系不大
a.son();
b.son();//报错：父类的引用没有son方法
c.son();//报错
//子类能调用自己的和继承父类的方法，
//父类只能调用自己的，不能调用子类独有的方法son()【强制类型转换可以解决】
((A)c).son();//强制转换c为，向下转型，高-低
```

## **instanceof**

`oop.Demo06`
它的作用是测试它**左边的对象**实例是否是它**右边的类的实例**，返回 boolean 的数据类型。
`X instanceof Y`
左边 X 是对象，右边 Y 是类.
当 X的实例 是右边 Y 或 Y 的子类所创建对象时，true；否则，false

1. **类的实例**包含**本身的实例**  和 **直接或间接子类的实例**

2. instanceof**左边显式声明的类型**（引用）与右边必须是**同种类或存在继承关系**，也就是说需要位于**同一个继承树**，否则会**编译错误**
3. **左边的对象实例不能是基础数据类型**，eg 0.01、“love"

```java
Object>String
Object>Person>Student
Object>Person>Teacher
	Object ob = new Student();
   		ob instanceof Student;//true
		ob instanceof Person;//true
		ob instanceof Object;//true
		ob instanceof Teacher;//false
		ob instanceof String;//false
	Person pe = new Student();
		pe instanceof Student;//true
		pe instanceof Person;//true
		pe instanceof Object;//true
		pe instanceof Teacher;//false
		pe instanceof String;//
	//编译报错1，因为pe和String不在一个继承树上
	Student st = new Student();
		st instanceof Student;//true
		st instanceof Person;//true
		st instanceof Object;//true
		st instanceof Teacher;//报错
		st instanceof String;//报错
```

## **对象类型转换**

`oop.Demo07`

```java
//父（高）              子（低）
Person obj = new Student();//父类引用指向子类的对象,反之不行

Student student = (Student)obj;
student.go();
//等同下一行
((Student) obj).go();
//将person强制转换成Student类型，就可以使用Student类型的方法

Student student = new Student();
student.go();

Person person = student;//子类转父类，低转高默认转换，不用()强制
person.go()//报错，子类转父类可能丢失 方法
((Student) person).go();
```

1. **父类引用指向子类的对象**
2. **把子类转换为父类，向上转型     丢失子类独有方法**
3. **把父类转换为子类，向下转型     高转低，强制转换，**
4. 方便方法调用，减少重复代码，简洁

## 静态Static

`oop.Demo08`

静态方法，静态属性
**静态方法**跟类一起加载，是**类的方法**
**非静态方法**需要new**实例化**，是**对象的方法**

```java
    private static int age;//静态的变量，可被多个类实例操作(多线程)
    private double score;//非静态的变量

    public static void go(){
        System.out.println("静态方法");
    }
    public void run(){
        System.out.println("非静态方法");
        //go();非静态方法可以直接调用静态方法
    }
    public static void main(String[] args) {

        Demo08 s1 = new Demo08();
        Demo08 s2 = new Demo08();

        System.out.println(Demo08.age);//使用类名访问
        //System.out.println(Demo08.score);//non-static field
        System.out.println(s1.age);
        System.out.println(s1.score);
//======================================================
        go();
        Demo08.go();
        //run();//non-static method
        s2.run();
        new Demo08().run();//匿名内部类
//======================================================
    }
```

```java
//代码块
public class Demo08{
    
{//第2个加载 用来赋初值
	System.out.println("匿名代码块");
}
    
static{//第1个加载  且只执行一次
	System.out.println("静态代码块");
}
    
public Demo08(){//第3个加载
	System.out.println("无参构造方法");
}
public static void main(String[] args) {
	Demo08 s1 = new Demo08();
	Demo08 s2 = new Demo08();
/*
静态代码块
匿名代码块
无参构造方法
匿名代码块
无参构造方法
*/
}
}
```

```java
//静态导入包
import static java.lang.Math.random;
import static java.lang.Math.PI;

System.out.println(random());
System.out.println(PI);
```

静态方法中不能用this
static静态随着类加载而创建，时间片非常早
非静态是随着对象的创建而创建

静态变量无法被重写，但是可以重新声明

## 抽象类

`oop.Demo09`

`Abstract`  `Action`
抽象类abstract

1. **不能被new实例化**，只能靠子类去实现他：约束！
2. 抽象类中**可以写普通的方法**(包括构造方法)
3. **抽象方法必须在抽象类中**

抽象的抽象：约束
抽象类还是类，只能单继承。提高开发效率，

```java
//abstract 抽象类	类extends单继承
public abstract class Abstract {//抽象类
    int a = 5;
    //约束    有人帮我们实现
    //abstract 抽象方法 有方法名，没有方法实现，方法体
    public abstract void dpSomethiing();//抽象方法
    public Abstract(){a++;}//普通方法
}
```

```java
//抽象类的所有方法，子类都必须要实现父类的方法，除非子类也是抽象类
public class Action extends Abstract {
    @Override
    public void dpSomethiing() {}
    public Action (){super();}
    public static void main(String[] args) {
        Action action = new Action();
        System.out.println(action.a);//6
}}
```

## **接口**

`oop.Demo10`

普通类：只有具体实现
抽象类：具体实现和规范(抽象方法)都有
接口：只有规范，专业的约束，约束和实现分离：**面向接口编程**

接口就是规范，定义的是一组规则，**接口本质是契约**，制定好后大家都遵守
OO的精髓，是对对象的抽象——接口

1. 约束
2. 定义一些方法(没有方法体)，让不同人实现
3. 接口中定义的方法都是    **public   abstract**
4. 接口中定义的常量都是    **public   static   final**关键词
5. **接口不能被实例化、接口中没有构造方法**
6. 类可以实现多个接口(**implement**)，但是必须**重写接口的方法**

```java
//interface 定义的关键字，接口都需要有实现类
public interface UserService {
    //常量，public,static,final
    int AGE = 99;
    //接口中的所有定义其实都是抽象的、 abstract 且 public
    public void run();//{}不让写实现
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
```

```java
//接口实现伪多继承 implement
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void run() {}
    @Override
    public void add(String name) {}
    @Override
    public void delete(String name) {}
    @Override
    public void update(String name) {}
    @Override
    public void query(String name) {}
    @Override
    public void timer() {}
}
```

## 内部类及OOP实战

`Demo11`

内部类就是在一个类的内部再定义一个类，比如A类中定义了一个B类，那B类相对A类来说就是称为内部内，A类对于B类来说就是外部类

1. 成员内部类
2. 静态内部类
3. 局部内部类
4. 匿名内部类

```java
public class Outer  {

        private static int id = 10;
        public void out(){
            System.out.println("这是外部类的方法");
        }
        public static void read_id(){
            System.out.println(id);
        }

        public class Inner{//成员内部类
            public void in(){
                System.out.println("这是内部类的方法");
            }
            //访问外部类的私有属性
            public void getID(){
                System.out.println(id);
            }
            //访问外部类的方法(私有公有都可以访问）
            public void getout(){
                out();
            }
        }
        public static class StaticInner{//静态内部类
            public void inStatic(){
                System.out.println("这是静态内部类的方法");
            }
            public void getIDStatic(){
                System.out.println(id);
            }
            public void getoutStatic(){
                //out();静态内部类无法直接访问费静态属性
                read_id();
            }
        }

        public void method(){//在方法里面写内部类
            class PartInner{//局部内部类
                public void inPart(){
                    System.out.println("局部内部类的方法");
                }
            }
        }

    public static void main(String[] args) {
        System.out.println("1");
        //没有名字初始化类，不用将实例保存在比那两种
        new Apple().eat();//匿名内部类
        TestService testService = new TestService(){
            @Override
            public void Hello() {
            }
        };
    }
}
class Apple{
    public void eat(){
        System.out.println("吃苹果");
    }
    public static void main(String[] args) {
        System.out.println("2");
    }
}

interface TestService{
    void Hello();
}
```

静态内部类无法直接访问非静态属性；
一个java类中可以有多个class类，但只能有一个public class

# 异常机制

## Error 和 Exception

分类：
**检查性异常，运行时异常，错误**
异常体系结构
`java.lang.Throwable`作为所有异常的超类
![psc (1191×740) (qpic.cn)](http://m.qpic.cn/psc?/V51sMwIM2ofv2G2B7Riv0XVQh31yQw7M/ruAMsa53pVQWN7FLK88i5qqc8PKmtJbeBCCPwX.jdbzJhB*CPtaArf3LeCrFPgxVYtB*wDVEjnhU.1xLJq1kj.OsxD965mxOXMNZfSwMwqk!/b&bo=pwTkAqcE5AIBByA!&rf=viewer_4)

捕获异常

**Error**
error类对象由Java虚拟机生成抛出，大多数错误与代码编写者所执行的操作无关
Java虚拟机运行错误(Virtual MachineError)，

- 当JVM不在有继续执行操作所需要的内存资源时，将出现`OutOfMemoryError`，Error发生时，JVM会选择线程终止
- 类定义错误(NoClassDefFoundError)，链接错误(LinkageError)

**Exception**
RuntimeException运行时异常

- ArrayIndexxOutOfBoundsException(数组下标越界异常)
- NullPointerException(空指针异常)
- ArithmeticException(算术异常)
- MissingResourceException(丢失资源)
- ClassNotFoundException(找不到类)

两者区别：Error通常是致命的错误，是程序无法控制和处理的，当出现这些异常，JVM会终止线程，Exception通常情况下是可以被程序处理，并且在程序中处理异常。

##异常处理

**关键字**：`try` `catch` `finally` `throw` `throws`

可以先出现异常，然后方法抛出，调用的时候catch
也可以在方法处直接catch，调用的时候直接调用

**捕获**异常try能使程序在检查到该错误后，任然继续进行

```java
try{//监控区域
    
}catch(想要捕获的异常类型){//捕获异常
    
}catch(Throwable ){//可捕获多个异常，从小到大
	//System.exit(1);//手动程序结束
    //处理异常
   e.printStackTrace(); 
}...
finally{//善后处理，一定执行
    //释放资源
}
//finally可以不要,IO,资源，关闭！
```

**自动包裹Ctrl+Alt+T**

**抛出**异常（主动抛出异常,使得程序继续运行）`throw` `throws`

- **throws**用于方法头，表示的只是异常的申明，而**throw**用于方法内部，抛出的是`异常对象`
- **throws**可以一次性抛出多个异常，而**throw**只能一个
- **throw**要么和**try-catch-finally**语句配套使用，要么与**throws**配套使用。但**throws**可以单独使用，然后再由处理异常的方法捕获。

```java
public class Demo01 {
    public static void main(String[] args) {
        try {//当前抛出异常的方法中处理异常
            new Demo01().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
}
//throw语法：
//  throw <异常对象>
//throws语法：
//	[<修饰符>]<返回值类型><方法名>（[<参数列表>]）[throws<异常类>]
public void test(int a, int b) throws ArithmeticException{//方法上抛出异常
        //主动抛出异常方法2
    	if (b == 0) {
            throw new ArithmeticException();
        }
        //或者直接：System.out.println(a/b);
    }
}
```

throw总是出现在函数体中，用来抛出一个Throwable类型的异常。程序会在throw语句后立即终止，它后面的语句执行不到，然后在包含它的所有try块中（可能在上层调用函数中）从里向外寻找含有与其匹配的catch子句的try块。

## 自定义异常

- 创建**自定义异常类**
- 在**方法中通过throw关键字抛出异常对象**
- 如果**在当前抛出异常的方法中处理异常**，可以用try-catch捕获并处理
- 否则**在方法声明处throws关键字指明要抛出方法调用者的异常**，继续下一步
- 在出现异常方法的调用者中捕获并处理异常

```java
//自定义异常类
public class MyException extends Exception{
    //传递数字>10;
    private int detail;
    public MyException(int detail) {//构造函数
        this.detail = detail;
    }

    //toString:异常的打印信息
    @Override
    public String toString() {
        return "MyException{" + "detail=" + detail + '}';
    }
}
```

```java
public class Test {
    //可能会存在异常的方法
    public void way1(int a) throws MyException{
        System.out.println("传递的参数"+a);
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");//出错不会打印

    }

    static void way2(int a )  {
        System.out.println("传递的参数"+a);
        if (a > 10) {
            try {
                throw new MyException(a);
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        System.out.println("OK");//出错也会打印，因为try是监督，不会打断
    }

    public static void main(String[] args)  {
        try {
            new Test().way1(11);//方法内只是发现并抛出，调用的时候catch
        }catch (MyException e){
            System.out.println("way1出现错误");
        }
        
        way2(11);//方法内catch处理，且是静态方法，就直接调用方法
        System.out.println("go on ");
    }
}
```

异常处理经验总结

- 处理运行时异常时，采用逻辑去合理规避同时辅助`try-catch`处理，防止打断
- 在多重`catch`块里，可以加一个`catch（Exception）`来处理可能会被遗漏的异常
- 对于不确定的代码，可以加上`try-catch`，处理潜在异常
- 尽量去处理异常，切忌只是简单调用`printStackTrace()`去打印输出
- 具体如何处理异常，要根据不同业务需求和异常类型去决定
- 尽量添加`finally`语句块去释放占用的资源JB
