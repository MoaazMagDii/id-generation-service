package generator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.*;
import entities.*;

public class EmployeeIdGenerator extends JPanel implements ActionListener
{

    Label LHead, LName, LDOB, LGender, LSS, LPBirth, LPResidence,
    LAddress, LNumber, LID, LSalary, LJTitle, LEmail;

    JLabel LName2, LDOB2, LGender2, LSS2, LPBirth2, LPResidence2, LAddress2,
    LNumber2, LID2, LSalary2, LJTitle2, LEmail2, LPic, SSN, LPic2;

    JTextField TName, TDOB, TGender, TSS, TPBirth, TPResidence,
    TAddress, TNumber, TID, TSalary, TJTitle, TEmail;

    Button BName, BDOB, BGender, BSS, BPBirth, BPResidence,
    BAddress, BNumber, BID, BSalary, BJTitle, BEmail, ViewID;

    JFrame frame, frame2;
    JPanel panel, panel2;

    ImageIcon img, img2;
    Employee employee = new Employee();

    public EmployeeIdGenerator() {
        frame = new JFrame("ID Form for employees");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(null);

//**********************************************************************************************************************************************/
        LHead = new Label("Enter your Data");
        LHead.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LName = new Label("Name ");
        LName.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LDOB = new Label("Date of birth ");
        LDOB.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LGender = new Label("Gender ");
        LGender.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LSS = new Label("Social status ");
        LSS.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LPBirth = new Label("Place of birth ");
        LPBirth.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LPResidence = new Label("Place of residence ");
        LPResidence.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LAddress = new Label("Address ");
        LAddress.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LNumber = new Label("Number ");
        LNumber.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LID = new Label("Job ID ");
        LID.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LSalary = new Label("Salary ");
        LSalary.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        LJTitle = new Label("Job title ");
        LJTitle.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        
        LEmail = new Label("Email ");
        LEmail.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

//************************************************************************************************************************************************ */
        TName = new JTextField();
        TName.setToolTipText("your full name");
        TName.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TName.setHorizontalAlignment(JTextField.CENTER);

        TDOB = new JTextField();
        TDOB.setToolTipText("numbers with special characters");
        TDOB.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TDOB.setHorizontalAlignment(JTextField.CENTER);

        TGender = new JTextField();
        TGender.setToolTipText("Male or Female");
        TGender.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TGender.setHorizontalAlignment(JTextField.CENTER);

        TSS = new JTextField();
        TSS.setToolTipText("Enter Single or Married");
        TSS.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TSS.setHorizontalAlignment(JTextField.CENTER);

        TPBirth = new JTextField();
        TPBirth.setToolTipText("which country where were you born in");
        TPBirth.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TPBirth.setHorizontalAlignment(JTextField.CENTER);

        TPResidence = new JTextField();
        TPResidence.setToolTipText("which country you are living in now");
        TPResidence.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TPResidence.setHorizontalAlignment(JTextField.CENTER);


        TAddress = new JTextField();
        TAddress.setToolTipText("Your Address");
        TAddress.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TAddress.setHorizontalAlignment(JTextField.CENTER);

        TNumber = new JTextField();
        TNumber.setToolTipText("your Number");
        TNumber.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TNumber.setHorizontalAlignment(JTextField.CENTER);

        TID = new JTextField();
        TID.setToolTipText("Numbers");
        TID.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TID.setHorizontalAlignment(JTextField.CENTER);

        TSalary = new JTextField();
        TSalary.setToolTipText("your monthly salary");
        TSalary.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TSalary.setHorizontalAlignment(JTextField.CENTER);

        TJTitle = new JTextField();
        TJTitle.setToolTipText("Job Title");
        TJTitle.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TJTitle.setHorizontalAlignment(JTextField.CENTER);

        TEmail = new JTextField();
        TEmail.setToolTipText("String with numbers with special characters");
        TEmail.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));
        TEmail.setHorizontalAlignment(JTextField.CENTER);

        

//************************************************************************************************************************************************* */
        ViewID = new Button("View employee ID Card");
        ViewID.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BName = new Button("check");
        BName.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BDOB = new Button("check");
        BDOB.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));


        BGender = new Button("check");
        BGender.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BSS = new Button("check");
        BSS.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));


        BPBirth = new Button("check");
        BPBirth.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BPResidence = new Button("check");
        BPResidence.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BAddress = new Button("check");
        BAddress.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BNumber = new Button("check");
        BNumber.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BID = new Button("check");
        BID.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BSalary = new Button("check");
        BSalary.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BJTitle = new Button("check");
        BJTitle.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

        BEmail = new Button("check");
        BEmail.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,15));

       
//************************************************************************************************************************************************** */

        LHead.setBounds(170, 0, 200, 20);

        LName.setBounds(0, 30, 100, 30);
        TName.setBounds(130, 30, 200, 30);
        BName.setBounds(350, 33, 100, 23);

        LDOB.setBounds(0, 60, 100, 30);
        TDOB.setBounds(130, 60, 200, 30);
        BDOB.setBounds(350, 63, 100, 23);

        LGender.setBounds(0, 90, 100, 30);
        TGender.setBounds(130, 90, 200, 30);
        BGender.setBounds(350, 93, 100, 23);

        LSS.setBounds(0, 120, 100, 30);
        TSS.setBounds(130, 120, 200, 30);
        BSS.setBounds(350, 123, 100, 23);

        LPBirth.setBounds(0, 150, 100, 30);
        TPBirth.setBounds(130, 150, 200, 30);
        BPBirth.setBounds(350, 153, 100, 23);


        LPResidence.setBounds(0, 180, 127, 30);
        TPResidence.setBounds(130, 180, 200, 30);
        BPResidence.setBounds(350, 183, 100, 23);

        LAddress.setBounds(0, 210, 100, 30);
        TAddress.setBounds(130, 210, 200, 30);
        BAddress.setBounds(350, 213, 100, 23);

        LNumber.setBounds(0, 240, 100, 30);
        TNumber.setBounds(130, 240, 200, 30);
        BNumber.setBounds(350, 243, 100, 23);

        LID.setBounds(0, 270, 100, 30);
        TID.setBounds(130, 270, 200, 30);
        BID.setBounds(350, 273, 100, 23);

        LSalary.setBounds(0, 300, 100, 30);
        TSalary.setBounds(130, 300, 200, 30);
        BSalary.setBounds(350, 303, 100, 23);

        LJTitle.setBounds(0, 330, 100, 30);
        TJTitle.setBounds(130, 330, 200, 30);
        BJTitle.setBounds(350, 333, 100, 23);

        LEmail.setBounds(0, 360, 100, 30);
        TEmail.setBounds(130, 360, 200, 30);
        BEmail.setBounds(350, 363, 100, 23);

    
        ViewID.setBounds(150, 440, 170, 30);

//************************************************************************************************************************************************** */

        panel.add(LHead);

        panel.add(LName);
        panel.add(TName);
        panel.add(BName);

        panel.add(LDOB);
        panel.add(TDOB);
        panel.add(BDOB);

        panel.add(LGender);
        panel.add(TGender);
        panel.add(BGender);

        panel.add(LSS);
        panel.add(TSS);
        panel.add(BSS);

        panel.add(LPBirth);
        panel.add(TPBirth);
        panel.add(BPBirth);

        panel.add(LPResidence);
        panel.add(TPResidence);
        panel.add(BPResidence);

        panel.add(LAddress);
        panel.add(TAddress);
        panel.add(BAddress);


        panel.add(LNumber);
        panel.add(TNumber);
        panel.add(BNumber);

        panel.add(LID);
        panel.add(TID);
        panel.add(BID);

        panel.add(LSalary);
        panel.add(TSalary);
        panel.add(BSalary);

        panel.add(LJTitle);
        panel.add(TJTitle);
        panel.add(BJTitle);

        panel.add(LEmail);
        panel.add(TEmail);
        panel.add(BEmail);

        

        panel.add(ViewID);
//************************************************************************************************************************************************** */

        BName.addActionListener(this);
        BDOB.addActionListener(this);
        BGender.addActionListener(this);
        BSS.addActionListener(this);
        BPBirth.addActionListener(this);
        BPResidence.addActionListener(this);
        BAddress.addActionListener(this);
        BNumber.addActionListener(this);
        BID.addActionListener(this);
        BSalary.addActionListener(this);
        BJTitle.addActionListener(this);
        BEmail.addActionListener(this);
        ViewID.addActionListener(this);


        //img = getImage(getCodeBase(), "f.png");
        panel.setBackground( new Color(204, 204, 204) );
        frame.add(panel);
        frame.setSize(550,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
//************************************************************************************************************************************************* */

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == BName)
        {
            employee.setFullName(TName.getText());
            BName.setForeground(Color.green);  
        }

        if (e.getSource() == BDOB)
        {
            employee.setDayOfBirth(TDOB.getText());
            BDOB.setForeground(Color.green);
        }

        if (e.getSource() == BGender)
        {
            employee.setGender(TGender.getText());
            BGender.setForeground(Color.green);
        }

        if (e.getSource() == BSS)
        {
            employee.setSocialStatus(TSS.getText());
            BSS.setForeground(Color.green);
        }

        if (e.getSource() == BPBirth)
        {
            employee.setPlaceOfBirth(TPBirth.getText());
            BPBirth.setForeground(Color.green);
        }

        if (e.getSource() == BPResidence)
        {
            employee.setPlaceOfResidence(TPResidence.getText());
            BPResidence.setForeground(Color.green);
        }

        if (e.getSource() == BAddress)
        {
            employee.setAddress(TAddress.getText());
            BAddress.setForeground(Color.green);
        }

        if (e.getSource() == BNumber)
        {

            try
            {
                employee.setPhoneNumber(Long.parseLong(TNumber.getText()));
                BNumber.setForeground(Color.green);
            }
            catch (Exception ex)
            {
                BNumber.setForeground(Color.red);
                TNumber.setText("Try again");
            }
        }


        if (e.getSource() == BID)
        {
            try
            { 
                employee.setEmployee_ID(Integer.parseInt(TID.getText()));
                BID.setForeground(Color.green);
            }
            catch (Exception ex)
            {
                BID.setForeground(Color.red);
                TID.setText("Try again");
            }
        }

        if (e.getSource() == BSalary)
        {
            try
            { 
                employee.setSalary(Integer.parseInt(TSalary.getText()));
                BSalary.setForeground(Color.green);
            }
            catch (Exception ex)
            {
                BSalary.setForeground(Color.red);
                TSalary.setText("Try again");
            }
        }

        if (e.getSource() == BJTitle)
        {
            employee.setjobtitle(TJTitle.getText());
            BJTitle.setForeground(Color.green);
        }

        if (e.getSource() == BEmail)
        {
            employee.setE_mail(TEmail.getText());
            BEmail.setForeground(Color.green);
        }

        if (e.getSource() == ViewID)
        {
            PaintID();
        }
    }
        
//************************************************************************************************************************************************* */
public void PaintID()
{
    frame2 = new JFrame("ID for employees");
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setSize(550,544);
    frame2.setLocationRelativeTo(null);

    panel2 = new JPanel();
    panel2.setLayout(null);
    
    img = new ImageIcon(getClass().getResource("img.jpg"));
    img2 = new ImageIcon(getClass().getResource("img4.jpeg"));

    LPic = new JLabel(img);
    LPic2 = new JLabel(img2);

    LPic.setBounds(0,0,550,514);
    LPic2.setBounds(270,20,250,250);
    
//*******************************************************************************************************************

    LName2 = new JLabel("Name: " + employee.getFullName());
    LName2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LDOB2 = new JLabel("Date of Birth: " + employee.getDayOfBirth());
    LDOB2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LGender2 = new JLabel("Gender: " + employee.getGender());
    LGender2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LSS2 = new JLabel("Social Status: " + employee.getSocialStatus());
    LSS2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LPResidence2 = new JLabel("Place of Residence: " + employee.getPlaceOfResidence());
    LPResidence2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LPBirth2 = new JLabel("Place of Birth: " + employee.getPlaceOfBirth());
    LPBirth2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LAddress2 = new JLabel("Address: " + employee.getAddress());
    LAddress2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LNumber2 = new JLabel("Number: " + employee.getPhoneNumber());
    LNumber2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LID2 = new JLabel("Job ID: " + employee.getEmployee_ID());
    LID2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LSalary2 = new JLabel("Salary: " + employee.getSalary());
    LSalary2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LJTitle2 = new JLabel("Job Title: " + employee.getjobtitle());
    LJTitle2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    LEmail2 = new JLabel("Email: " + employee.getE_mail());
    LEmail2.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

    SSN = new JLabel("SSN: " + employee.getSSN());
    SSN.setFont(new Font("Comic Sans",Font.LAYOUT_LEFT_TO_RIGHT,18));

//***************************************************************************************************************** */

    LName2.setBounds          (10,  10,  250, 50);
    LPBirth2.setBounds        (10,  60,  200, 50);
    LPResidence2.setBounds    (10,  110, 400, 50);
    LAddress2.setBounds       (10,  160, 200, 50);
    LDOB2.setBounds           (10,  210, 400, 50);
    LGender2.setBounds        (10,  260, 200, 50);
    LSS2.setBounds            (10,  310, 200, 50);
    LNumber2.setBounds        (10,  360, 400, 50);
    SSN.setBounds             (10,  410, 400, 50);
    LEmail2.setBounds         (10,  460, 400, 50);
    LID2.setBounds            (270, 280, 250, 50);
    LSalary2.setBounds        (270, 330, 200, 50);
    LJTitle2.setBounds        (270, 380, 250, 50);

    
//****************************************************************************************************************** */
    panel2.add(LName2);
    panel2.add(LPBirth2);
    panel2.add(LPResidence2);
    panel2.add(LAddress2);
    panel2.add(LDOB2);
    panel2.add(LGender2);
    panel2.add(LSS2);
    panel2.add(LNumber2);
    panel2.add(SSN);
    panel2.add(LEmail2);
    panel2.add(LID2);
    panel2.add(LSalary2);
    panel2.add(LJTitle2);

//****************************************************************************************************************** */
    panel2.add(LPic2);
    panel2.add(LPic);
    frame2.add(panel2);
    frame2.setVisible(true);
}

    

//*******************************************************************************************************************8 */
    {
        try
        {
        for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
        {
            if ("Nimbus".equals(info.getName()))
            {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

        }
        catch (Exception e)
        {
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } 
        catch (Exception ex)
        {
            
        }
        }
    }
//*************************************************************************************************************************************************** */
    
}
