import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

public class MealMapper {
    static JFrame window = new JFrame();
    Background background = new Background();
    private int screenX, screenY;
    Dimension jframeSize= new Dimension(900, 600);
    Dimension screenSize  = Toolkit.getDefaultToolkit().getScreenSize();
    private int mouseX, mouseY;
    //Componentes
    Header header = new Header();
    Body body = new Body();
    //Fim
    private Utilizador userId;
   

    MealMapper(Utilizador user){
        this.userId = user;
         
         init();
       

    }

    private void init(){
         window.setSize(jframeSize);
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setUndecorated(true);
         screenX = (int) (screenSize.getWidth() - jframeSize.getWidth())/2;
         screenY = (int) (screenSize.getHeight() - jframeSize.getHeight())/2;
         window.setLocation(screenX, screenY);
         window.setLayout(new BorderLayout());
         window.setBackground(new Color(0,0,0,0));
         background.setLayout(new BorderLayout());
     
         background.setBorder(BorderFactory.createEmptyBorder(0, 0 ,8, 0));
         background.add(header, BorderLayout.NORTH);
         background.add(body, BorderLayout.CENTER);
         action();
         background.setBackground(Color.white);
         window.add(background);
         window.setVisible(true);

    }
    private void action(){
       header.addMouseListener(new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e){
            mouseX = e.getX();
            mouseY= e.getY();
        }
       });
       header.addMouseMotionListener(new MouseAdapter() {
        @Override
        public void mouseDragged(MouseEvent e){
            int deltaX =e.getX() - mouseX;
            int deltaY= e.getY() - mouseY;
            window.setLocation(window.getLocation().x+deltaX,
            window.getLocation().y + deltaY);
        }
       });
        

    }
    public static void closeWindow(){
        System.exit(JFrame.ABORT);
    } 
    public static void maximizeWindow(){
        int state = window.getExtendedState();

                if ((state & JFrame.MAXIMIZED_BOTH) == 0) {         
                    window.setExtendedState(state | JFrame.MAXIMIZED_BOTH);
                } else {
                    window.setExtendedState(state & ~JFrame.MAXIMIZED_BOTH);
                }
    }
    public static void minimizeWindow(){
        window.setExtendedState(JFrame.ICONIFIED);
    }

     
    public Utilizador getUserId() {
        return userId;
    }

    public void setUserId(Utilizador userId) {
        this.userId = userId;
    }

    public static void main(String[] args) {
        //new MealMapper();
    }
}
