public class Teacher {
    int Tid;
    String Tname;
    String Tsubject;
        
    
    Teacher(int Tid , String Tname , String Tsubject)
    {
        super();
        this.Tid = Tid;
        this.Tname = Tname;
        this.Tsubject = Tsubject;
    }
    void displayTeacher(){
        System.out.println("Teacher Details");
        System.out.println("Name:" +Tname);
        System.out.println("ID:" + Tid);
        System.out.println("Subject:" +Tsubject);
    }
}
class DriverTeacher
{
    public static void main(String[] args) {
        Teacher obj = new Teacher( 101, "Vikas"," SQL");
        obj.displayTeacher();
        Teacher obj1 = new Teacher(102, "Shrikant", "JAVA");
        obj1.displayTeacher();
    }
}
