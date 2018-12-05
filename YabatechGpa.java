import java.io.*;
import javax.swing.JOptionPane;

public class YabatechGpa
{
	static  int course,scs,course_unit;
    static double grade_unit,weighed_grade;
    static String course_name;
 
 public static void main(String[] args)throws IOException
 {
// a program to find the GPA of a particular student;
  int end_sem;
  double gpaa=0;
  double gpa;
  double gp=0;
  double total_unit =0,cgpa=0;
  int num_sem;

       
          JOptionPane.showMessageDialog(null, "YABATECH GPA CALCULATOR","CREATED BY MACANTHONY", JOptionPane.INFORMATION_MESSAGE);
          JOptionPane.showMessageDialog(null, "Please you are to notice the following instructions.\n"+ 
          	"Your score will determine your weigth grade, weigth unit.\n" + 
          	"And which will help to generate  your \"GPA\"\n" + 
          	">> If score is 75 and above you will have A1 as your grade unit\n" + 
          	">> Score is within the range of 70-74 is A2\n" + 
          	">> Score is within the range of 65-69 is B1\n" + 
          	">> Score is within the range of 60-64 is B2\n" + 
          	">> Score is within the range of 55-59 is C1\n" + 
          	">> Score is within the range of 50-54 is C2\n" + 
          	">> Score is within the range of 45-49 is D1\n" + 
          	">> Score is within the range of 40-44 is D2 \n" + 
          	">> Score is less than 40 is 0 ", "SPECIFICATIONS", JOptionPane.PLAIN_MESSAGE);
       
 String sur_name, middle_name, last_name, full_name,result;
     
  sur_name = JOptionPane.showInputDialog("Enter Your Sur Name: ", "Sur Name");
    
    middle_name = JOptionPane.showInputDialog("Enter Your Middle Name: ", "Middle Name" );
      
  last_name = JOptionPane.showInputDialog("Enter Your Last Name: ", "Last Name");
     
   full_name = sur_name + " " + middle_name + " " + last_name;
         result = full_name.toUpperCase();
  
      end_sem = Integer.parseInt(JOptionPane.showInputDialog("How Many Semester Do You Want To Calculate?", "Semesters"));
        for(num_sem=0;num_sem<end_sem;num_sem++)
        {
 
      int lp_vl,end_vl;
          
end_vl=Integer.parseInt(JOptionPane.showInputDialog("How Many Course Do You Offer?", "Courses"));
        for(lp_vl=0;lp_vl<end_vl;lp_vl++)
        {
            course_name =JOptionPane.showInputDialog("Enter Your Course Name");
         
   scs=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Score"));
   
  course_unit=Integer.parseInt(JOptionPane.showInputDialog("Enter Course Unit"));

      
  if (scs >= 75)
  {
         JOptionPane.showMessageDialog(null,"Your Grade is\"AA\"and Grade unit is\"A1\"");
      
          grade_unit=4.0;
  }
 else if(scs>=70&&scs <= 74)
 {
 JOptionPane.showMessageDialog(null,"Your Grade is \"A\"and Grade unit is\"A2\"");
                  
grade_unit=3.5;
         } 
else if(scs>=65&&scs<=69){
            JOptionPane.showMessageDialog(null,"Your Grade is\"AB\"and Grade unit is \"B1\"");
          
  grade_unit=3.25;
                  } 
else if (scs>=60&&scs<=64){
            JOptionPane.showMessageDialog(null,"Your Grade is\"B\"and Grade unit is\"B2\"");
           
 grade_unit=3.0;
         } 
else if (scs>=55&&scs<=59){
                 JOptionPane.showMessageDialog(null,"Your Grade is \"BC\"and Grade unit is\"C1\"");
      
           grade_unit=2.5;
         }
else if (scs>=50&&scs<=54){
                 JOptionPane.showMessageDialog(null,"Your Grade is \"C\"and Grade unit is\"C2\"");
      
           grade_unit=2.0;
         }
 else if (scs>=45&&scs<=49){
                 JOptionPane.showMessageDialog(null,"Your Grade is \"D\"and Grade unit is\"D1\"");
      
           grade_unit=1.5;
         }
 else if (scs>=40&&scs<=44){
                 JOptionPane.showMessageDialog(null,"Your Grade is \"E\"and Grade unit is\"D2\"");
   
              grade_unit=1.0;
         }
            
 else
             {
                JOptionPane.showMessageDialog(null, " Your Grade is \"F\" and Grade unit is \"0\""); 
        
        grade_unit=0;
             }
   
  weighed_grade=grade_unit*course_unit;
  
   total_unit=total_unit+course_unit;
   
  gp=gp+weighed_grade;
      }
         
 gpa=gp/total_unit;
          gpaa=gpa;
      
   JOptionPane.showMessageDialog(null, result + " YOUR CGPA IS: " + gpaa);
   gpaa=gpaa+1;
   double cmt;
   cmt=gpaa;

   if (cmt>=3.5) {
    JOptionPane.showMessageDialog(null,  result + "  CONGRATULATION....YOU ARE ON DISTINCTION.");
  }
   else if(cmt>=3.0&&cmt<=3.4){
      JOptionPane.showMessageDialog(null, result + "  KEEP IT UP YOU ARE ON UPPER CLASS. ");
    }
    else   if(cmt>=2.0&&cmt<=2.9){
        JOptionPane.showMessageDialog(null, result + "  YOU ARE ON LOWER CLASS. ");
      }
  else if(cmt>=1.0&&cmt<=1.9){
        JOptionPane.showMessageDialog(null, result + "  YOU CAN STILL DO IT....PASSED. ");
      }
    else 
      
{
      JOptionPane.showMessageDialog(null, result + "YOU FAILED ");
    
   
    }
}

  
    
  }
