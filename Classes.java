public class Classes{
        public static void main(String args[]){
     Pen p1 = new Pen();
     p1.setColor("Blue");
     p1.seTip(5);
     System.out.println(p1.Color);
     System.out.println(p1.tip);
    }
}
    class Pen{        //ye class Classes k scope k bahr h chk for reason latter that static non-static
        String Color;
        int tip;
    void setColor(String newColor){
        Color = newColor;
    }
    void seTip(int newTip){
        tip = newTip;
    }
    }
