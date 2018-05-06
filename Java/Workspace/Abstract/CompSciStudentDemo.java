public class CompSciStudentDemo{
    public static void main(String[] args){
        CompSciStudent csStudent = new CompSciStudent("Ben Diegel", "167w98337", 2018);

        csStudent.setMathHours(12);
        csStudent.setCsHours(20);
        csStudent.setGenEdHours(40);

        System.out.println(csStudent);

        System.out.println("Hours remaining: " + csStudent.getRemainingHours());
    }
}