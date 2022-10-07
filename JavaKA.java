class JavaKA
{
static String course="java" ;
void notes()
{
System.out.println(course);
}
String computer()
{
 course ="html";
return course;

}
public static void main(String args[]){
JavaKA m=new JavaKA();
m.notes();
m.computer();
System.out.println(course);
}
}
