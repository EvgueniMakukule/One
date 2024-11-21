import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class DashBord extends JPanel{
JPanel homePanel = new JPanel(new BorderLayout());
JPanel favPanel = new JPanel(new BorderLayout());
JPanel reservaPanel = new JPanel(new BorderLayout());
JPanel settinPanel = new JPanel(new BorderLayout());

CustomButton home = new CustomButton("Home",20);
CustomButton fav = new CustomButton("Favorites",20);
CustomButton reser = new CustomButton("Reservation",20);
CustomButton settin = new CustomButton("Settings",20);

private Color tranparente = new Color(0,0,0,0);
private Color ColorOver = new Color(249, 120, 45);
private Color ColorClicked =  new Color(239, 62, 0 ); 
    
DashBord(){
        //Testes mudar mais tarde
        setBackground(Color.white);
        setBorder(BorderFactory.createEmptyBorder(0,-10,0,10));
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
       
        homePanel.setPreferredSize(new Dimension(100,10));
        homePanel.setBackground(getBackground());
        favPanel.setPreferredSize(new Dimension(100,10));
        favPanel.setBackground(getBackground());
        reservaPanel.setPreferredSize(new Dimension(100,10));
        reservaPanel.setBackground(getBackground());
        settinPanel.setPreferredSize(new Dimension(100,10));
        settinPanel.setBackground(getBackground());
        //Coloracao dos botoes
       
        home.setColor(tranparente);
        fav.setColor(tranparente);
        reser.setColor(tranparente);
        settin.setColor(tranparente);

        home.setColorOver(ColorOver);
        fav.setColorOver(ColorOver);
        reser.setColorOver(ColorOver);
        settin.setColorOver(ColorOver);

        home.setColorClick(ColorClicked);
        fav.setColorClick(ColorClicked);
        reser.setColorClick(ColorClicked);
        settin.setColorClick(ColorClicked);

        //fim
        int spaceGap = 20;
        homePanel.add(home);
        add(homePanel);
        add(Box.createVerticalStrut(spaceGap));
        favPanel.add(fav);
        add(favPanel);
        add(Box.createVerticalStrut(spaceGap));
        reservaPanel.add(reser);
        add(reservaPanel);
        add(Box.createVerticalStrut(spaceGap));
        settinPanel.add(settin);
        add(settinPanel);
        
        action();
       }
    private void action(){
   home.addActionListener(new ActionListener() {
   @Override
    public void actionPerformed(ActionEvent e) {
        home.setColor(ColorOver);
        fav.setColor(tranparente);
        reser.setColor(tranparente);
        settin.setColor(tranparente);
        BodySheets.homeVisble();
         
    }});

    fav.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        home.setColor(tranparente);
        fav.setColor(ColorOver);
        reser.setColor(tranparente);
        settin.setColor(tranparente);
        BodySheets.favoritosVisible();
    }});

    reser.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        home.setColor(tranparente);
        fav.setColor(tranparente);
        reser.setColor(ColorOver);
        settin.setColor(tranparente);
        BodySheets.reservationVisible();
       
    }});
    settin.addActionListener(new ActionListener() {
     @Override
    public void actionPerformed(ActionEvent e) {
        home.setColor(tranparente);
        fav.setColor(tranparente);
        reser.setColor(tranparente);
        settin.setColor(ColorOver);
        BodySheets.SettingsVisible();
       
    }});


    }
    
       public static void main(String[] args) {
        JFrame frame = new JFrame("Teste");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,400);
        JPanel main = new JPanel(new BorderLayout());
        main.setBackground(Color.BLUE);
        main.add(new DashBord());
        frame.getContentPane().add(main);
        frame.setVisible(true);
    }
}
