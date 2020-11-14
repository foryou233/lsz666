package Lv2;

import java.util.Scanner;

class Caozuo{
    public static void caozuo() {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        char Char[] = n.toCharArray();
        for (int i = 0; i < Char.length; i++) {
            if (Char[i] == 'a') {
                System.out.println("向左移动一步");
            } else if (Char[i] == 'w') {
                System.out.println("向前移动一步");
            } else if (Char[i] == 's') {
                System.out.println("向下移动一步");
            } else if (Char[i] == 'd') {
                System.out.println("向右移动一步");
            }
        }
    }
}

public class Move {
    public static void main(String [] args){
        Scanner m = new Scanner(System.in);
        Renwu me=new Renwu();
        System.out.println("设置自己的昵称：");
        String name=m.nextLine();
        me.setName(name);
        System.out.println("设置自己的年龄:");
        int age =m.nextInt();
        me.setAge(age);
        System.out.println("现在你可以通过键盘来控制自己的移动：");
        System.out.println("w——>上"+"\n"+"s——>下"+"\n"+"a——>左"+"\n"+"d——>右"+"\n");
        System.out.println("请输入你需要移动的方向");
        Caozuo x=new Caozuo();
        x.caozuo();
    }
}

class Renwu{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}




//剧情部分可能有亿点点单调，学姐们原谅我暂时能力有限呜呜呜