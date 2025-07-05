import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class RegisterFrm extends JFrame
                 
{
    JLabel            lnm,lunm,lpwd,ldob,lplc,lcnpwd;
    JTextField        tnm,tunm,tdob,tplc,tpwd;
    JPasswordField    tcnpwd;
    JButton           bregister,bcancle;
    JPanel            phold,pbut,con;
    
     
public RegisterFrm()
{
    con =(JPanel) getContentPane();
    phold=new JPanel(new GridLayout(6,2));
    pbut = new JPanel(new FlowLayout(FlowLayout.RIGHT));

    lnm = new JLabel("Name ",JLabel.RIGHT);
    tnm = new JTextField(40);
    lunm = new JLabel("user name",JLabel.RIGHT);
    tunm = new JTextField(40);
    ldob = new JLabel("Date of birth ",JLabel.RIGHT);
    tdob= new JTextField(40);
    lplc= new JLabel("Place ",JLabel.RIGHT);
    tplc = new JTextField(40);
    lpwd= new JLabel("Password ",JLabel.RIGHT);
    tpwd= new JTextField(40);
    lcnpwd= new JLabel("Confrom password ",JLabel.RIGHT);
    tcnpwd= new JPasswordField(40);
    
    tcnpwd.setEchoChar('*');

    bregister=new JButton("Register");
    bcancle=new JButton("Cancle");
    con.add(phold,"Center");
    con.add(pbut,"South");

    phold.add(lnm);
    phold.add(tnm);
    phold.add(lunm);
    phold.add(tunm);
    phold.add(ldob);
    phold.add(tdob);
    phold.add(lplc);
    phold.add(tplc);
    phold.add(lpwd);
    phold.add(tpwd);
    phold.add(lcnpwd);
    phold.add(tcnpwd);

    pbut.add(bregister);
    pbut.add(bcancle);

    setTitle("Register Form ");
    setSize(800,300);
    setVisible(true);
   
}
}
class RegisterExp{
public static void main(String args[])
{
   RegisterFrm frm = new RegisterFrm();
}
}