/*1.Employee
 
eid
ename
esalary
 
array of employees  to add employees using setters
 
display the employee information using getters
 
validations:
 
5 employee id is unique 7 digit
length greater than 5
esalary length greater than 5 to 10characters*/
import java.util.*;
class Employee {
public int eid;
public String ename;
public int esalary;
//setter
}

class SetGet extends Employee{ 

void setEid(int eid) {
  if(this.eid==7 ){
     this.eid=eid;
}
  else{
    System.out.println("Id should be 7 numbers");
    
  }
}
void setEname(String ename) {
     this.ename=ename;
}
void setEsalary(int esalary) {
  if(this.esalary<5 && this.esalary>10){
     this.esalary=esalary;
  }
  else{
    System.out.println("Invalid salary details");
  }
}

//getter
int getEid() {
     return this.eid;
}
String getEname() {
     return this.ename;
}
  
int getEsalary() {
  
     return this.esalary;
}
}


public class EmployeeSetGet {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
    SetGet p=new SetGet();

      SetGet e[]=new SetGet[3];
      for(int i=0;i<e.length;i++){
        e[i]=new SetGet();
     System.out.println("Enter the Employee Id ");
    e[i].setEid(sc.nextInt());
     System.out.println("Enter the Employee Name ");
      sc.nextLine();
    e[i].setEname(sc.nextLine());

      
       System.out.println("Enter the Employee Salary ");
    e[i].setEsalary(sc.nextInt());
        
      }
     for(int i=0;i<e.length;i++){ 
   System.out.println(e[i].getEid()+" "+e[i].getEname()+" "+e[i].getEsalary());
     }
    }
    
}