
// using Static keyword

class Student{
    int id;
    String name;
    int marks;
    static String schoolName = "VMMHSS";
    Student(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public void display(){
        System.out.println("Student_Id :"+ id);
        System.out.println("Student_name :"+ name);
        System.out.println("mark :"+ marks);
        System.out.println("SchoolName :"+ schoolName);
        System.out.println("-----------------------------------");
    }
    public static void main(String[] args) {
        Student sa1 = new Student(101, "Rahul", 85);
        sa1.display();
        Student sa2 = new Student(102, "Sonia", 95);
        sa2.display();

    }
}