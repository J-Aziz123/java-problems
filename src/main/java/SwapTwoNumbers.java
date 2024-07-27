public class SwapTwoNumbers {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void swapTwoNumbers() {

        /*
        a=1;
        b=2;
        */

        int temp;

        temp = a;
        a = b;

        b = temp;

        //System.out.println(a + ", " + b);
        //
    }

    public void swapTwoNumWithOutTemp(){

        a = a+b;// 3 , 5
        b= a-b;// 3
        a = a-b;//5


    }




}
