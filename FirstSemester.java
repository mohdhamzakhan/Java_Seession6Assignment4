package session6;

abstract class Student
{
	protected String roll;
	protected String Name;
	protected String reg_no;
}
interface Result
{
	void getSubject();
	void showResult();
	void setMarks(float mark1,float mark2);
}
public  class FirstSemester extends Student implements Result {
private String sub1, sub2;
private float mark1, mark2, grade1, grade2,credit1,credit2;

public FirstSemester(String name, int roll, int reg) {
super();
}
@Override
public void setMarks(float mark1,float mark2) {
this.mark1=mark1;
this.mark2=mark2;
}

@Override
public void getSubject() {
sub1="Introduction to Computer System";
sub2="Structured Programming Language";
credit1=(float)2.0;
credit2=(float)3.0;
}

@Override
public void showResult() {
System.out.println("\nName: " + Name + "\nRoll = " + roll +  "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2);
}
public class SecondSemester extends Student implements Result {
private String sub1, sub2;
private Float mark1, mark2, grade1, grade2,credit1,credit2;

public SecondSemester(String name, int roll, int reg) {
super();
}
@Override
public void setMarks(float mark1,float mark2) {
this.mark1=mark1;
this.mark2=mark2;
}

@Override
public void getSubject() {
sub1="Data Structure";
sub2="Discrete Mathematics";
credit1=(float)3.0;
credit2=(float)2.0;
}

@Override
public void showResult() {
System.out.println("\nName: " + Name + "\nRoll = " + roll +  "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 );
}
}
public class Assignment4 {

/**
* @param args the command line arguments
*/
public void main(String[] args) {
// TODO code application logic here
FirstSemester std1 = new FirstSemester("Shufol", 127, 149);
std1.setMarks(60,70);
System.out.println("\nEnter First Semester Student's Info:");
std1.getSubject();
std1.showResult();

SecondSemester std2 = new SecondSemester("Fakhrul", 227, 249);
std2.setMarks(70,80);
System.out.println("\n\nEnter Second Semester Student's Info:");
std2.getSubject();
std2.showResult();
}
}
public  class FirstSemester extends Student implements Result {
private String sub1, sub2;
private float mark1, mark2, grade1, grade2,credit1,credit2;

public FirstSemester(String name, int roll, int reg) {
super();
}
@Override
public void setMarks(float mark1,float mark2) {
this.mark1=mark1;
this.mark2=mark2;
}

@Override
public void getSubject() {
sub1="Introduction to Computer System";
sub2="Structured Programming Language";
credit1=(float)2.0;
credit2=(float)3.0;
}

@Override
public void showResult() {
System.out.println("\nName: " + Name + "\nRoll = " + roll +  "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2);
}
public class SecondSemester extends Student implements Result {
private String sub1, sub2;
private Float mark1, mark2, grade1, grade2,credit1,credit2;

public SecondSemester(String name, int roll, int reg) {
super();
}
@Override
public void setMarks(float mark1,float mark2) {
this.mark1=mark1;
this.mark2=mark2;
}

@Override
public void getSubject() {
sub1="Data Structure";
sub2="Discrete Mathematics";
credit1=(float)3.0;
credit2=(float)2.0;
}

@Override
public void showResult() {
System.out.println("\nName: " + Name + "\nRoll = " + roll +  "\n" + sub1 + " grade: " + grade1+ "\n" + sub2 + " grade: " + grade2 );
}
}
public class Assignment4 {

/**
* @param args the command line arguments
*/
public void main(String[] args) {
// TODO code application logic here
FirstSemester std1 = new FirstSemester("Shufol", 127, 149);
std1.setMarks(60,70);
System.out.println("\nEnter First Semester Student's Info:");
std1.getSubject();
std1.showResult();

SecondSemester std2 = new SecondSemester("Fakhrul", 227, 249);
std2.setMarks(70,80);
System.out.println("\n\nEnter Second Semester Student's Info:");
std2.getSubject();
std2.showResult();
}
}
}
}