public class Student {
    int Id;
    String name;
    String edu;
    int yop;
    Student(int Id , String name, String edu , int yop){
        this.Id= Id;
        this.name= name;
        this.edu= edu;
        this.yop=yop;
    }
    @Override
    public String toString(){
        return "Id :  "+Id+ " , Name :" +name+" , Education:" +edu+", YOP : "+yop;
    }
}
class StudentDriver{
    public static void main(String[] args) {
        Student obj1 = new Student(1, "Ramesh", "BE", 2024);
        Student obj2 = new Student(2, "Suresh", "MCA", 2022);
        System.out.println(obj1);
        System.out.println(obj2);

    }
}
