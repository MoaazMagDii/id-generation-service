package entities;



public class Employee extends Person
{
   private   int  Employee_id;
   private   int  Salary;
   private   String  jobtitle;
   private   String  e_mail;

    public Employee(){}


    public int getEmployee_ID()
    {
        return Employee_id;
    }

    public void setEmployee_ID(int ID)
    {
        Employee_id = ID;
    }

    public int getSalary()
    {
        return Salary;
    }

  public void setSalary(int salary)
    {      
        this.Salary = salary;
    }


    public void setjobtitle(String jobTitle)
    {
        this.jobtitle = jobTitle;
    }

    public String getjobtitle()
    {
        return jobtitle;
    }

    public void setE_mail(String e_mail)
    {
        this.e_mail=e_mail;
    }

    public String getE_mail()
    {
        return e_mail;
    }

}
