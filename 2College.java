package uno;
import java.util.Scanner;
public class college {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! You are from the University of the Cordilleras");
        System.out.println("What is college are you from? \n(CAS, CBA, CEA, CITCS, CTE or COA)");
        String college = input.nextLine();
        if ((college.equals("CAS"))||(college.equals("College of Arts and Sciences"))){
            System.out.println("What academic program are you in? "
                    + "\nBachelor of Arts in English, "
                    + "\nBachelor of Arts in Political Science, "
                    + "\nBachelor of Arts in Communication, "
                    + "\nor Bachelor of Science in Psychology?");
            String CASprog = input.nextLine();
            if (CASprog.equals("Bachelor of Arts in English")){
                System.out.println("You are from the College of Arts and Sciences");
                System.out.println("You are taking the Bachelor of Arts in English");}
            else if (CASprog.equals("Bachelor of Arts in Political Science")){
                System.out.println("You are from the College of Arts and Sciences");
                System.out.println("You are taking the Bachelor of Arts in Political Science");}
            else if (CASprog.equals("Bachelor of Arts in Communication")){
                System.out.println("You are from the College of Arts and Sciences");
                System.out.println("You are taking the Bachelor of Arts in Communication");}
            else if (CASprog.equals("Bachelor of Science in Psychology")){
                System.out.println("You are from the College of Arts and Sciences");
                System.out.println("You are taking the Bachelor of Science in Psychology");}
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else if ((college.equals("CBA"))||(college.equals("College of Business Administration"))){
            System.out.println("What academic program are you in? "
                    + "\nBachelor of Science in Business Administration, "
                    + "\nBachelor of Science in Entrepreneurship, "
                    + "\nBachelor of Science in Office Administration?");
            String CBAprog = input.nextLine();
            if (CBAprog.equals("Bachelor of Science in Business Administration")){
                System.out.println("You are from the College of Business Administration");
                System.out.println("You are taking the Bachelor of Science in Business Administration");}
            else if (CBAprog.equals("Bachelor of Science in Entrepreneurship")){
                System.out.println("You are from the College of Business Administration");
                System.out.println("You are taking the Bachelor of Science in Entrepreneurship");}
            else if (CBAprog.equals("Bachelor of Science in Office Administration")){
                System.out.println("You are from the College of Business Administration");
                System.out.println("You are taking the Bachelor of Science in Office Administration");}
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else if ((college.equals("CEA"))||(college.equals("College of Engineering and Architecture"))){
            System.out.println("What academic program are you in?"
                    + "\nBachelor of Science in Architecture,"
                    + "\nBachelor of Science in Civil Engineering,"
                    + "\n Bachelor of Science in Computer Engineering,"
                    + "\nBachelor of Science in Electronics Engineering,"
                    + "\n Bachelor of Science in Environmental & Sanitary Engineering?");
            String CEAprog = input.nextLine();
            if (CEAprog.equals("Bachelor of Science in Architecture")){
                System.out.println("You are from the College of Engineering and Architecture");
                System.out.println("You are taking the Bachelor of Science in Architecture");}
            else if (CEAprog.equals("Bachelor of Science in Civil Engineering")){
                System.out.println("You are from the College of Engineering and Architecture");
                System.out.println("You are taking the Bachelor of Science in Civil Engineering");}
            else if (CEAprog.equals("Bachelor of Science in Computer Engineering")){
                System.out.println("You are from the College of Engineering and Architecture");
                System.out.println("You are taking the Bachelor of Science in Computer Engineering");}
            else if (CEAprog.equals("Bachelor of Science in Electronics Engineering")){
                System.out.println("You are from the College of Engineering and Architecture");
                System.out.println("You are taking the Bachelor of Science in Electronics Engineering");}
            else if (CEAprog.equals("Bachelor of Science in Environmental & Sanitary Engineering")){
                System.out.println("You are from the College of Engineering and Architecture");
                System.out.println("You are taking the Bachelor of Science in Environmental & Sanitary Engineering");}
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else if ((college.equals("CTE"))||(college.equals("College of Teacher Education"))){
            System.out.println("What academic program are you in?"
                    + "\nBachelor of Science in Elementary Education - General,"
                    + "\nBachelor of Science in Elementary Education,"
                    + "\nor Bachelor of Science in Secondary Education?");
            String CTEprog = input.nextLine();
            if (CTEprog.equals("Bachelor of Science in Elementary Education - General")){
                System.out.println("You are from the College of Teacher Education");
                System.out.println("You are taking the Bachelor of Science in Elementary Education - General");}
            else if (CTEprog.equals("Bachelor of Science in Elementary Education")){
                System.out.println("You are from the College of Teacher Education");
                System.out.println("You are taking the Bachelor of Science in Elementary Education");}
            else if (CTEprog.equals("Bachelor of Science in Secondary Education")){
                System.out.println("You are from the College of Teacher Education");
                System.out.println("You are taking the Bachelor of Science in Secondary Education");}
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else if ((college.equals("COA"))||(college.equals("College of Accountancy"))){
            System.out.println("What academic program are you in?"
                    + "\nBachelor of Science in Accountancy,"
                    + "\nBachelor of Science in Accounting Technology,"
                    + "\nBachelor of Science in Management Accounting,"
                    + "\nor Bachelor of Science in Forensic Accounting?");
            String CTEprog = input.nextLine();
            if (CTEprog.equals("Bachelor of Science in Accountancy")){
                System.out.println("You are from the College of Accountancy");
                System.out.println("You are taking the Bachelor of Science in Accountancy");}
            else if (CTEprog.equals("Bachelor of Science in Accounting Technology")){
                System.out.println("You are from the College of Accountancy");
                System.out.println("You are taking the Bachelor of Science in Accounting Technology");}
            else if (CTEprog.equals("Bachelor of Science in Management Accounting")){
                System.out.println("You are from the College of Accountancy");
                System.out.println("You are taking the Bachelor of Science in Management Accounting");}
            else if (CTEprog.equals("Bachelor of Science in Forensic Accounting")){
                System.out.println("You are from the College of Accountancy");
                System.out.println("You are taking the Bachelor of Science in Forensic Accounting");}
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else if ((college.equals("CITCS"))||(college.equals("College of Information Techonology and Computer Science"))){
            System.out.println("What academic program are you in? "
                       + "\nBachelor of Science in Computer Science,"
                       + "\nBachelor of Science in Information System,"
                       + "\nBachelor of Science in Information Technology,"
                       + "\nor Associate in Computer Technology?");
            String CITCSprog = input.nextLine();
            if ((CITCSprog.equals("Bachelor of Science in Computer Science"))||(CITCSprog.equals("BSCS"))){
                System.out.println("What is your major?"
                        + "\nMobile Technology Track or Digital Arts and Animation Track?");
                String MajorCS = input.nextLine();
                if (MajorCS.equals("Mobile Technology Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Mobile Techonology Track");}
                else if (MajorCS.equals("Digital Arts and Animation Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Digital Arts and Animation Track");}
                else
                    System.out.println("Make sure to type it right and Try again. Thank you!");
            }
            else if (CITCSprog.equals(("Bachelor of Science in Information Systemn"))||(CITCSprog.equals("BSIS"))){
                System.out.println("What is your major?"
                        + "\ne-Learning Technology Track or Business Process Management Track?");
                String MajorIS = input.nextLine();
                if (MajorIS.equals("e-Learning Technology Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in e-Learning Technology Track");}
                else if (MajorIS.equals("Business Process Management Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Business Process Management Track");}
                else
                    System.out.println("Make sure to type it right and Try again. Thank you!");
            }
            else if ((CITCSprog.equals("Bachelor of Science in Information Technology"))||(CITCSprog.equals("BSIT"))){
                System.out.println("What is your major?"
                        + "\nEnterprise Resource Planning Track, Network and Security Track or Web Technology Track?");
                String MajorIT = input.nextLine();
                if (MajorIT.equals("Enterprise Resource Planning Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Enterprise Resource Planning Track");}
                else if (MajorIT.equals("Network and Security Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Network and Security Track");}
                else if (MajorIT.equals("Web Technology Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Major in Web Technology Track");}
                else
                    System.out.println("Make sure to type it right and Try again. Thank you!");
            }
            else if (CITCSprog.equals("Associate in Computer Technology")){
                System.out.println("What is your major?"
                        + "\nEmphasis in Call Center Services Track or Emphasis in Computer Maintenance and Network Management Track");
                String MajorIT = input.nextLine();
                if (MajorIT.equals("Emphasis in Call Center Services Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Emphasis in Call Center Services Track");}
                else if (MajorIT.equals("Emphasis in Computer Maintenance and Network Management Track")){
                    System.out.println("You are from the College of Information Technology and Computer Science");
                    System.out.println("You are taking the Bachelor of Science in Computer Science");
                    System.out.println("Emphasis in Computer Maintenance and Network Management Track");}
                else
                    System.out.println("Make sure to type it right and Try again. Thank you!");
            }
            else
                System.out.println("Make sure to type it right and Try again. Thank you!");
        }
        else
           System.out.println("Make sure to type it right and Try again. Thank you!");
    }
}
