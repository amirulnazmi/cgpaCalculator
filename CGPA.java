import java.util.Scanner;
 class  CGPACalculation{
    double sum=0;

    CGPACalculation(double marks[],double cHour[]){
      double grade[]=new double[marks.length];
      for(int i=0;i<marks.length;i++){
        grade[i]=(marks[i] * cHour[i]) ;
      }
      for(int i=0;i<marks.length;i++){
       sum+=grade[i];
      }
    }
}

class GradePointer{



	GradePointer(char gPointer[], double pointer[]){
		for(int i=0;i<gPointer.length;i++){
			if (gPointer[i] == 'A' || gPointer[i] == 'a')
				pointer[i] = 4.0;
			else if (gPointer[i] == 'B' || gPointer[i] == 'b')
				pointer[i] = 3.0;
			else if (gPointer[i] == 'C' || gPointer[i] == 'c')
				pointer[i] = 2.0;
			else if (gPointer[i] == 'D' || gPointer[i] == 'd')
				pointer[i] = 1.0;
			else if (gPointer[i] == 'E' || gPointer[i] == 'e')
				pointer[i] = 0;
		}

	}
}

class CGPA{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of subjects");

    int n=sc.nextInt();
    char Grade[] = new char[n];
    double[] pointer = new double[n];
    double[] marks=new double[n];
    double[] cHour=new double[n];
    double totalCHour = 0;

    System.out.println("Enter Grades");
    for(int i=0;i<n;i++){
       Grade[i]=sc.next().charAt(0);
       //assert marks[i] >= 0 : "Value cannot be negative";
    }

    System.out.println("Enter Credit hour");
	    for(int i=0;i<n;i++){
	       cHour[i]=sc.nextDouble();
	       assert cHour[i] >= 0 : "Value cannot be negative";
	       totalCHour += cHour[i];

    }

    double grade[]=new double[n];
    double cgpa,sum;

	GradePointer g = new GradePointer(Grade,pointer);
    CGPACalculation s= new CGPACalculation(pointer,cHour);
    cgpa=s.sum/totalCHour;

    System.out.println("cgpa="+cgpa);
   }

}