package lv2;

public class MakeCalculate implements Calculate{
    @Override
    public  void calculate(double x, char operate, double y) {
        switch (operate){
            case'+':
                System.out.println(x+y);
                break;
            case'-':
                System.out.println(x-y);
                break;
            case'*':
                System.out.println(x*y);
                break;
            case'/':
                System.out.println(x/y);
                break;
        }
    }
}
