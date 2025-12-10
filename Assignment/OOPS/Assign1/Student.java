
class Student{
    int id;
    String name;
    double marks;

    Student(int id, String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Student_Id : " + id);
        System.out.println("Student_Name : " + name);
        System.out.println("Mark : " + marks);
    }
    public void calculateGrade(){
        if(marks >=90){
            System.err.println("Grade A");
        }else if (marks>=75) {
            System.out.println("Grade B");
        }else if (marks >=50) {
            System.out.println("Grade C");
        }else{
            System.err.println("Fail");
        }
    }
    public static void main(String[] args) {
        Student stud1 = new Student(101, "Rahul", 85);
        Student stud2 = new Student(102, "Sonia", 95);
        Student stud3 = new Student(103, "Priya", 55);
        stud1.displayDetails();
        stud1.calculateGrade();
        System.out.println("--------------------------------");
        stud2.displayDetails();
        stud2.calculateGrade();
         System.out.println("--------------------------------");
        stud3.displayDetails();
        stud3.calculateGrade();
        System.out.println("--------------------------------");


    }
}