public class _CopyConstructors {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Anuj";
        s1.roll=1106;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        Student s2=new Student(s1);
        //s1.marks[2]=0;
        for(int i=0;i<3;i++){
            System.out.print(s2.marks[i] + " ");
        }


    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks=new int[3];
    }

    
    //Shallow Copy Contructor
    // Student(Student s1){
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }


    //Deep Copy Constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        marks=new int[3];
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
