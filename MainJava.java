import javax.swing.JOptionPane;
import generator.*;

public class MainJava
{
    static StudentIdGenerator setID;
    static EmployeeIdGenerator SetID;

    public static void setID()
    {
        String decision = JOptionPane.showInputDialog(null,"Are you a student or an employee?"); 

        if(decision.equals(("student")) || decision.equals("Student"))
            setID = new StudentIdGenerator();
            
        else if(decision.equals("employee") || decision.equals("Employee"))
            SetID = new EmployeeIdGenerator();
        

    }

    public static void main(String[] args)
    {
        setID();
    }
}
