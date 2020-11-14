package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //输入人物属性
        Tjj tjj = new Tjj();
        Scanner a = new Scanner(System.in);

        System.out.println("请输入人物名称:");
        String name1 = a.nextLine();
        tjj.setName(name1);

        System.out.println("请输入人物攻击力:");
        int gjl1 = a.nextInt();
        tjj.setGjl(gjl1);

        System.out.println("请输入人物防御力:");
        int fyl1 = a.nextInt();
        tjj.setFyl(fyl1);

        System.out.println("请输入人物生命值:");
        int smz1 = a.nextInt();
        tjj.setSmz(smz1);
        //调用tell1方法
        tjj.tell1();
        //输入怪兽属性
        Gsl gsl = new Gsl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入怪兽名称:");
        String name2 = scanner.nextLine();
        gsl.setName(name2);

        System.out.println("请输入怪兽攻击力:");
        int gjl2 = scanner.nextInt();
        gsl.setGjl(gjl2);


        System.out.println("请输入怪兽生命值:");
        int smz2 = scanner.nextInt();
        gsl.setSmz(smz2);
        //调用tell2方法
        gsl.tell2();
        //人物对怪兽伤害
        int x = tjj.getGjl();
        Pk.atk1(x);
        //怪兽对人物伤害
        int y = gsl.getGjl() - tjj.getFyl();
        Pk.atk2(y);
        //人物剩余生命值
        int hp1 = tjj.getSmz() - y;
        if(hp1<=0) {
            hp1 = 0;
        }
        System.out.println("人物剩余血量"+hp1);
        //怪兽剩余生命值
        int hp2 = gsl.getSmz() - x;
        if(hp2<=0){
            hp2=0;
        }
        System.out.println("怪兽剩余血量"+hp2);
        while(hp1>0){
            while(hp2>0){
                Pk.atk1(x);
                Pk.atk2(y);
                hp1=hp1-y;
                hp2=hp2-x;
                if(hp1<=0){
                    hp1=0;
                }
                if(hp2<=0){
                    hp2=0;
                }
                System.out.println("人物剩余血量"+hp1);
                System.out.println("怪兽剩余血量"+hp2);
                }
                break;
            }
        if(hp1>0&&hp2<=0) {
            System.out.println("You win!");
        }
        if(hp2>0&&hp1<=0){
            System.out.println("You lose!");
        }
    }
}














