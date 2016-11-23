package tjjava.seven;
class A{  
    public static int k = 0 ;  
    static {  
        System.out.println("父类静态方法1") ;  
    }  
    {  
        System.out.println("父类非静态方法3") ;  
    }  
    public A(){  //构造  
        System.out.println("父类构造4");  
    }  
}  
class B extends A{  
    static {  
        System.out.println("子类静态方法2") ;  
    }  
    {  
        System.out.println("子类非静态方法5") ;  
    }  
    public B(){  //构造  
        System.out.println("子类构造6");  
    }  
}  
public class StaticDemo {  
    public static void main(String args[]){  
        B b = new B() ;  
    }  
} 

//也就是说此时的运行顺序为：
//父类静态块
//自身静态块
//父类块
//父类构造器
//自身块
//自身构造器 

//程序的赋值步骤为
//父类的静态变量赋值
//自身的静态变量赋值
//父类成员变量赋值
//父类块赋值
//父类构造器赋值
//自身成员变量赋值
//自身块赋值
//自身构造器赋值