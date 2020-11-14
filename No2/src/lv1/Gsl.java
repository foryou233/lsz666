package lv1;

public class Gsl {
        private String name2;
        private int gjl2;
        private int smz2;
        //构造tell2方法
        public void tell2(){
            System.out.println("怪兽"+"\n"+"姓名"+name2+",攻击力"+gjl2+",生命值"+smz2);
        }
        //获取怪兽属性
        public String getName(){
            return name2;
        }
        public void setName(String name2) {
            this.name2=name2;
        }

        public int getGjl(){
            return gjl2;
        }
        public void setGjl(int gjl2) {
            this.gjl2=gjl2;
        }
        public int getSmz(){
            return smz2;
        }
        public void setSmz(int smz2){
            this.smz2=smz2;
        }
    }

