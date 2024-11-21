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
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class SecondFrameSig extends JFrame{

    //class de definicao do frame
    JPanel firstJPanel = new JPanel(new BorderLayout());
    Background background = new Background();
    JPanel topPanel = new JPanel();
    JPanel centralPanel= new JPanel(new BorderLayout());
    JPanel bottomPanel = new JPanel();
    private int screenX, screenY;
    Dimension jframeSize= new Dimension(380, 500);
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    private int mouseX,mouseY;
    private char gender;
    //fim

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    //Componetes do Frame
    JLabel sigInLbl = new JLabel("Sign");
    JLabel nomeLbl = new JLabel("Nome:");
    JLabel emailLbl = new JLabel("Email:");
    JLabel cidadeLbl = new JLabel("Cidade:");
    JLabel senhaLbl = new JLabel("Cria uma senha:");
    JLabel telefoneLbl = new JLabel("Telefone:");

    ButtonGroup genderGroup = new ButtonGroup();

    JRadioButton maleRadioButton = new JRadioButton("Masculino");
    JRadioButton femaleRadioButton = new JRadioButton("Feminino");


    JTextField nomeTf = new JTextField();
    JTextField emailTf = new JTextField();
    JTextField cidadeTf = new JTextField();
    JPasswordField senhaTf = new JPasswordField();
    JTextField telefoneTf = new JTextField();

    JPanel exitPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    JPanel sigIButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    CustomButton sigIButton = new CustomButton("Sign", 10);
    JLabel exit = new JLabel("Exit");
     

    //fim

    SecondFrameSig(){
        setSize(jframeSize);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        screenX = (int) (screenSize.getWidth() - jframeSize.getWidth())/2;
        screenY = (int) (screenSize.getHeight() - jframeSize.getHeight())/2;
        setLocation(screenX, screenY);
        setLayout(new BorderLayout());
        setBackground(new Color(0,0,0,0));
        centralPanel.setBorder(BorderFactory.createEmptyBorder(30, 20 ,30, 20));
        
        init();
        action();
        background.setLayout(new BorderLayout());
        background.setBorder(BorderFactory.createEmptyBorder(20, 10 ,10, 10));
        background.add(firstJPanel); 
        add(background);
        setVisible(true);
    }   
    public void init(){
        //Defincao dos 3 paines
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centralPanel.setLayout(new BoxLayout(centralPanel, BoxLayout.Y_AXIS));
        centralPanel.setBackground(Color.white);
        bottomPanel.setBackground(Color.white);
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 20 ,10, 20));
         //fim
         //customizacao das elementos
        sigInLbl.setFont(new Font("Arial", Font.BOLD, 40));
        topPanel.setBackground(Color.white);
        topPanel.add(sigInLbl);

        centralPanel.add(nomeLbl);
        centralPanel.add(Box.createVerticalStrut(10));
        nomeTf.setBorder(null);
        nomeTf.setBackground(centralPanel.getBackground());
        centralPanel.add(nomeTf);
        centralPanel.add(new JSeparator());

        centralPanel.add(emailLbl);
        centralPanel.add(Box.createVerticalStrut(10));
        emailTf.setBorder(null);
        emailTf.setBackground(centralPanel.getBackground());
        centralPanel.add(emailTf);
        centralPanel.add(new JSeparator());

        centralPanel.add(cidadeLbl);
        centralPanel.add(Box.createVerticalStrut(10));
        cidadeTf.setBorder(null);
        cidadeTf.setBackground(centralPanel.getBackground());
        centralPanel.add(cidadeTf);
        centralPanel.add(new JSeparator());

        centralPanel.add(senhaLbl);
        centralPanel.add(Box.createVerticalStrut(10));
        senhaTf.setBorder(null);
        senhaTf.setBackground(centralPanel.getBackground());
        centralPanel.add(senhaTf);
        centralPanel.add(new JSeparator());

        centralPanel.add(telefoneLbl);
        centralPanel.add(Box.createVerticalStrut(10));
        telefoneTf.setBorder(null);
        telefoneTf.setBackground(centralPanel.getBackground());
        centralPanel.add(telefoneTf);
        centralPanel.add(new JSeparator());
        //JPanel panelradionButom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderGroup.add(maleRadioButton);
        maleRadioButton.setBackground(new Color(0,0,0,0));
        femaleRadioButton.setBackground(new Color(0,0,0,0));
        genderGroup.add(femaleRadioButton);
        //panelradionButom.setBackground(new Color(0,0,0,0));
        centralPanel.add(maleRadioButton);
         centralPanel.add(femaleRadioButton);
        //centralPanel.add(panelradionButom);

        //fim
        //addicao dos elementos
        bottomPanel.setBackground(Color.WHITE);
        sigIButtonPanel.setBackground(Color.WHITE);
        exitPanel.setBackground(Color.WHITE);
        bottomPanel.add(sigIButtonPanel);
        bottomPanel.add(exitPanel);
        
        sigIButton.setPreferredSize(new Dimension(200,30));
        exitPanel.add(exit);
        sigIButtonPanel.add(sigIButton);


        firstJPanel.add(topPanel, BorderLayout.NORTH);
        firstJPanel.add(centralPanel, BorderLayout.CENTER);
        firstJPanel.add(bottomPanel, BorderLayout.SOUTH);
       //fim





        
        
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

        sigIButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            int senha = Integer.parseInt(new String(senhaTf.getPassword()));
            Utilizador user = new Utilizador(0,emailTf.getText(),senha,telefoneTf.getText(),getGender(),nomeTf.getText(),cidadeTf.getText());
           
            
            try {
              Utilizador userId = Main.setNewUser(user);
               if(!(userId.getIdUtilizador() == 0)){
                   new MealMapper(userId);
                   setVisible(false);
               }else{
                System.out.println("Erro user not Found");
               }
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            }
            
        });

        addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e){
             mouseX=e.getX();
             mouseY = e.getY();
           }
        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                int deltaX = e.getX() -mouseX;
                int deltaY = e.getY() - mouseY;
                setLocation(getLocation().x +deltaX, getLocation().y + deltaY);
            }
        });

        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGender('M');
            }
        });

        femaleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setGender('F');
               
            }
        });

    }
    public static void main(String[] args) {
        new SecondFrameSig();
    }
}
