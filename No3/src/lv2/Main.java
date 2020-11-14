package lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str=scanner.next();
        char Char[]=str.toCharArray();
        int sum1=0,sum2=0,i,j;
        for(i=0;i<Char.length-1;i++){
            if(Char[i]<='9'&&Char[i]>='0'){
                sum1=sum1*10+Char[i]-'0';
//                System.out.println(Char[i]);
            }
            else
            break;
        }
        double x=sum1;
        System.out.println("x="+x);
        char operate=Char[i];
        System.out.println("operate="+operate);
        j=i+1;
        for(;j<=Char.length-1;j++) {
            if (Char[j]<='9'&&Char[j]>='0') {
                sum2 = sum2 * 10 +Char[j]-'0';
            }
            else
                break;
        }
        double y=sum2;
        System.out.println("y="+y);
        MakeCalculate makeCalculate=new MakeCalculate();
        makeCalculate.calculate(x,operate,y);
    }
}
