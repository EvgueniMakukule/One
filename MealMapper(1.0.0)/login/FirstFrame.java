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
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class FirstFrame extends JFrame{
   //definicao do Jframe
    CustomButton logInBtn = new CustomButton("Login",20);
    CustomButton sigInBtn = new CustomButton("Sigin",20);
    private int screenX, screenY;
    Dimension jframeSize= new Dimension(300, 500);
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    private int mouseX,mouseY;    
    //fim

    //Costumizacao do Frame
    JPanel firstPanel = new JPanel();
      JPanel topPanel = new JPanel();
        JPanel topThemePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
           JLabel theme = new JLabel("MealMapper");
      JPanel centralPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
          JPanel interiorPanel = new JPanel();
            JPanel loginBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JPanel siginBtnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
             
      JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel cancel = new JLabel("Exit");
    Background background = new Background();
    private Color backgroundColor = Color.white;
   // Fim
 

    FirstFrame(){
    
    setSize(jframeSize);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setUndecorated(true);
    screenX = (int) (screenSize.getWidth() - jframeSize.getWidth())/2;
    screenY = (int) (screenSize.getHeight() - jframeSize.getHeight())/2;
    setLocation(screenX, screenY);
    setBackground(new Color(0,0,0,0));
    background.setLayout(new BorderLayout());
    inti();
    action();
    background.setBorder(BorderFactory.createEmptyBorder(20, 0 ,20, 0));
    add(background);
    setVisible(true);


    }

    public void inti(){
       interiorPanel.setBackground(backgroundColor);
       loginBtnPanel.setBackground(backgroundColor);
       siginBtnPanel.setBackground(backgroundColor);
       bottomPanel.setBackground(backgroundColor);


        firstPanel.setLayout(new BorderLayout());
        centralPanel.setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
        centralPanel.setBackground(backgroundColor);
        interiorPanel.setLayout(new BoxLayout(interiorPanel, BoxLayout.Y_AXIS));
        
        theme.setFont(new Font("Calibri", Font.BOLD, 25));
        topThemePanel.add(theme);
        topThemePanel.setBackground(backgroundColor);
        ImageIcon icon = new ImageIcon("imagem.png");
        JLabel imgLabel = new JLabel(icon);
        
        //Adicao do login btn
        logInBtn.setPreferredSize(new Dimension(120, 40));
        loginBtnPanel.add(logInBtn);
        interiorPanel.add(loginBtnPanel);
        interiorPanel.add(Box.createVerticalStrut(20));
           //adicao do signbtn
       
        sigInBtn.setPreferredSize(new Dimension(120, 40));
        siginBtnPanel.add(sigInBtn);
        interiorPanel.add(siginBtnPanel);
        interiorPanel.add(Box.createVerticalStrut(20));

        centralPanel.add(interiorPanel);

      
        topPanel.add(topThemePanel, BorderLayout.NORTH);
        topPanel.add(imgLabel,BorderLayout.CENTER);
        bottomPanel.add(cancel);
        topPanel.setBackground(backgroundColor);

        firstPanel.add(topPanel,BorderLayout.NORTH);
        firstPanel.add(centralPanel,BorderLayout.CENTER);
        firstPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        background.add(firstPanel, BorderLayout.CENTER);

        }
    public void action(){
        cancel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
               System.exit(ABORT);
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               cancel.setForeground(Color.RED);
               cancel.repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cancel.setForeground(getForeground());
                cancel.repaint();
                
            }
            
        });

        logInBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new SecondFrameLog(); 
            }
            
        });

        sigInBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
                new SecondFrameSig();
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
        new FirstFrame();
        }
}