import java.util.Scanner;
class Student_class
{
    String name;
    int id;
    String course;
    int n;
    void courses()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        String courses[]=new String[n];
        System.out.println("Enter the courses");
        for(int i=0;i<n;i++)
        {
            courses[i]=sc.next();
        }
        
        
}
    void Student_class()
    {
        Scanner sc=new Scanner(System.in);
        name="";
        id=0;
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the id");
        id=sc.nextInt();
        
    }
    void Addcourse()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit of the new array");
        int n1=sc.nextInt();
        String course_1[]=new String[n1];
        System.out.println("Renter the courses again");
        for (int i=0;i<n1;i++)
        {
            course_1[i]=sc.next();
        }
        
        System.out.println("Enter the new representing course");
        String s=sc.next();
        course_1[n+1]=s;
        System.out.println("New courses=");
         for(int i=0;i<n1;i++)
         {
             System.out.println(course_1[i]);
             System.out.println("");
             
         }
    }
    void printinfo()

     {
         System.out.println("Student name ="+name);
         System.out.println("");
         System.out.println("Id number="+id);
         System.out.println("");
        
        }
        public static void main()
        {
            Student_class ob=new Student_class();
            ob.courses();
            ob.Student_class();
            ob.Addcourse();
            ob.printinfo();
            String Research_Area;
         String Student;
         int idd;
         
         
             Scanner sc=new Scanner(System.in);
             Research_Area="";
             Student="";
             idd=0;
             System.out.println("Enter your Registered Name");
             Student=sc.next();
             System.out.println("Enter the Research Area");
             Research_Area=sc.next();
             System.out.println("Enter your Student id");
             idd=sc.nextInt();
             System.out.println("The registered Name="+Student);
             System.out.println("");
             System.out.println("");
             System.out.println("The registered Student Id="+idd);
             System.out.println("");
             System.out.println("");
            
            
            
                System.out.println("The Graduate Student Research Area="+Research_Area);
                System.out.println("");
                
            
        }
     } 
     class Graduate_class
     {
         String Research_Area;
         String Student;
         int idd;
         void Graduate_class()
         {
             Scanner sc=new Scanner(System.in);
             Research_Area="";
             Student="";
             idd=0;
             System.out.println("Enter your Registered Name");
             Student=sc.next();
             System.out.println("Enter the Research Area");
             Research_Area=sc.next();
             System.out.println("Enter your Student id");
             idd=sc.nextInt();
             System.out.println("The registered Name="+Student);
             System.out.println("");
             System.out.println("");
             System.out.println("The registered Student Id="+idd);
             System.out.println("");
             System.out.println("");
            }
            void printinfo1(String Research_Area)
            {
                System.out.println("The Graduate Student Research Area="+Research_Area);
                System.out.println("");
                
            }
        
     }
