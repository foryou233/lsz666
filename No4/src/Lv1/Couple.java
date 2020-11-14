package Lv1;

import java.util.Scanner;

public class Couple{
    public static void main(String []args){
        Couple couple = new Couple();
        System.out.print("宝贝帮我计算一下这个数的阶乘:");
        couple.count();
        System.out.print("宝贝帮我计算一下斐波那契数列中这一项：");
        couple.fb();
        System.out.println("\n");
        System.out.println("有对象是不是很幸福，可惜想像总是很美好的，可惜你没有对象，哈哈哈！！！");
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void count(){
        //使用有b格的方式输入需要求的阶乘数
        Scanner scanner =new Scanner(System.in);
        String n=scanner.nextLine();
        char Char[]=n.toCharArray();
        int x=0,j;
        for(j=0;j<= Char.length-1;j++){
            if (Char[j]<='9'&&Char[j]>='0'){
                x=x*10+Char[j]-'0';
            }
            //到此需要求的阶乘数已经输入完毕
//            System.out.println("x="+x);
        }
        //开始计算阶乘并计数
        int i,sum;
        for(i=1,sum=0;i<=x;i++,count++){
            sum=sum+i*i;
            System.out.println("现在计算到了"+count+"的阶乘");
        }
        System.out.println("好嘞,"+x+"的阶乘为"+sum+"。");
    }

    public void fb(){
        //输入，懂得都懂
        Scanner scanner =new Scanner(System.in);
//        String n=scanner.nextLine();
//        char Char[]=n.toCharArray();
//        int x=0,j;
//        for(j=0;j<= Char.length-1;j++){
//            if (Char[j]<='9'&&Char[j]>='0'){
//                x=x*10+Char[j]-'0';
//            }
////            System.out.println("x="+x);
//        }
        int x= scanner.nextInt();
        System.out.print("行吧行吧，"+"斐波那契数列第"+x+"项为");
        long y = count(x);
        System.out.println(y);
    }
    //使用递归的方法计算斐波那契数列
    public static long count(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return count(n - 1) + count(n - 2);
    }
}




//含有敏感词汇还请多多担待
//最后祝学姐们早日脱单



