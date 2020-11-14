package lv1;
public class Tjj {
    private String name1;
    private int gjl1;
    private int fyl1;
    private int smz1;
    //构造tell1方法
    public void tell1(){
        System.out.println("人物"+"\n"+"姓名"+name1+",攻击力"+gjl1+"，防御力"+fyl1+",生命值"+smz1);
    }
    //获取人物属性
    public String getName(){
        return name1;
    }
    public void setName(String name1) {
        this.name1=name1;
    }

    public int getGjl(){
        return gjl1;
    }
    public void setGjl(int gjl1) {
        this.gjl1=gjl1;
    }
    public int getFyl(){
        return fyl1;
    }
    public void setFyl(int fyl1){
        this.fyl1=fyl1;
    }
    public int getSmz(){
        return smz1;
    }
    public void setSmz(int smz1){
        this.smz1=smz1;
    }
}
