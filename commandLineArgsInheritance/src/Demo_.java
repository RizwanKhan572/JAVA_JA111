public class Demo_ {

    public static void main(String[] args) {
        Student[] students= new Student[3]; //  students array created.
       Student s1= new Student("rizwan",30);  // object created using constructor
       Student s2= new Student("Ravi",50);
       Student s3= new Student("Shivam",45);

       students[0]=s1;   // pushing objects in the array.
       students[1]=s2;
       students[2]=s3;

        for (Student s: students     // iterating thorough array and printing its inner key and values.
             ) {
            System.out.println(s.name+" "+s.marks);
        }
    }
}
