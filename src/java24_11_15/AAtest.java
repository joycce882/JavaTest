package java24_11_15;


public class AAtest {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.i);
        System.out.println(bb.sum());
        System.out.println(bb.sum2());

        AA aa = bb;
        System.out.println("-----------------");
        System.out.println(aa.i);
        System.out.println(aa.sum());
        System.out.println(aa.sum2());
    }
}

class AA{
    int i=10;
    public int sum(){ return i+10;}
    public int sum2(){ return getI()+20;}
    public int getI(){return i;}

}

class BB extends AA{
    int i=20;
    public int sum(){return i+20;}
//    public int sum2(){return getI()+30;}s
    public int getI(){return i;}
}
