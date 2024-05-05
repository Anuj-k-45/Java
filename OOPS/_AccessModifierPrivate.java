public class _AccessModifierPrivate {
    public static void main(String args[]){
        Pen p1 = new Pen(); //created a pen object p1
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setcolor("Yellow");
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor(){   //getter! => used when a property or variable is privated and still eant to be access
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setcolor(String newColor){   //setter!
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy,int chem,int maths){
        percentage=(phy + chem + maths)/3;
    }
}
