import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class SecondFrameLog extends JFrame {
   //class de definicao
    Background background = new Background();
    JPanel firstJPanel= new JPanel(new BorderLayout());
    JPanel topPanel = new JPanel(new BorderLayout());
    JPanel centralPanel = new JPanel();
    JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private int screenX, screenY;
    Dimension jframeSize= new Dimension(380, 500);
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    private int mouseX,mouseY; 
  //fim

    //Componentes do Frame
    JLabel loginLbl = new JLabel("Login");
    JPanel topLoginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    ImageIcon iconRitgh = new ImageIcon("imagem.png");
    JLabel imgRitgh = new JLabel(iconRitgh);
       
    JLabel userLabel = new JLabel("User name:");
    JLabel pasWordLabel = new JLabel("Password:");
   
    JTextField user = new JTextField();
    JPasswordField passWord = new JPasswordField();
    
    JCheckBox renemB= new JCheckBox();

    JPanel loginBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JPanel exitBtnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

    CustomButton loginBtn = new CustomButton("Login",10);
    JLabel exit = new JLabel("Exit");
   

    //fim
   

    SecondFrameLog(){
        setSize(jframeSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        screenX = (int) (screenSize.getWidth() - jframeSize.getWidth())/2;
        screenY = (int) (screenSize.getHeight() - jframeSize.getHeight())/2;
        setLocation(screenX, screenY);
        setLayout(new BorderLayout());
        setBackground(new Color(0,0,0,0));
        firstJPanel.setBorder(BorderFactory.createEmptyBorder(10, 20 ,20, 20));
        background.setLayout(new BorderLayout());
        inti();
        action();
        
        background.setBorder(BorderFactory.createEmptyBorder(10, 10 ,10, 10));
        background.add(firstJPanel); 
        add(background);
        setVisible(true);
    }   
    public void inti(){
             topLoginPanel.setBackground(getBackground());
             firstJPanel.setBackground(getBackground());
             topPanel .setBackground(getBackground());
             centralPanel .setBackground(getBackground());
             bottomPanel.setBackground(getBackground());
             loginBtnPanel .setBackground(getBackground());
             exitBtnPanel.setBackground(getBackground());

    centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));
    bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
   
        loginLbl.setFont(new Font("Calibri",Font.BOLD,40));
        topLoginPanel.add(loginLbl);
        topPanel.add(topLoginPanel, BorderLayout.NORTH);
        topPanel.add(imgRitgh, BorderLayout.CENTER);

        centralPanel.add(userLabel);
        centralPanel.add(Box.createVerticalStrut(10));
        user.setBackground(Color.WHITE);
        user.setBorder(null);
        centralPanel.add(user);
        centralPanel.add(new JSeparator());

        centralPanel.add(pasWordLabel);
        centralPanel.add(Box.createVerticalStrut(10));
        passWord.setBackground(Color.WHITE);
        passWord.setBorder(null);
        centralPanel.add(passWord);
        centralPanel.add(new JSeparator());
        centralPanel.add(Box.createVerticalStrut(10));

        loginBtn.setPreferredSize(new Dimension(200,30));
        loginBtnPanel.add(loginBtn);
        exitBtnPanel.add(exit);       

        bottomPanel.add(loginBtnPanel);
        bottomPanel.add(exitBtnPanel);

        firstJPanel.add(topPanel,BorderLayout.NORTH);
        firstJPanel.add(centralPanel,BorderLayout.CENTER);
        firstJPanel.add(bottomPanel, BorderLayout.SOUTH);
        

    }
    public void action(){
        exit.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               System.exit(ABORT);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                exit.setForeground(Color.RED);
                exit.repaint();
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               exit.setForeground(new Color(52, 152, 219));
               exit.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setForeground(getForeground());
                exit.repaint();
                
            }
            
        });
        loginBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             int senha = Integer.parseInt(new String(passWord.getPassword()));
             try {
              Utilizador userId = Main.loginUser(user.getText(),senha);
               if(!(userId.getIdUtilizador() ==0)){
                System.out.println(userId.toString());
                new MealMapper(userId);
                setVisible(false);
               }else{
                System.out.println("Erro user can not be found");
               }
                
            } catch (IOException e1) {
                e1.printStackTrace();
            }
               
               
            }
            
        });
        
          //forma pra fazer o Jframe arrastavel
          addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int deltaX = e.getX() - mouseX;
                int deltaY = e.getY() - mouseY;
                setLocation(getLocation().x + deltaX, getLocation().y + deltaY);
            }
        });
        //Fim


    }
public static void main(String[] args) {
    new SecondFrameLog();
}
  
}
