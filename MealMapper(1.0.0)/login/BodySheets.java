import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.OverlayLayout;

public class BodySheets extends JPanel{
    JPanel main = new JPanel();

    static HomePanel homePanel = new HomePanel();
    static FavoritosPanel favoritosPanel = new FavoritosPanel();
    static ReservationPanel reservationPanel = new ReservationPanel();
    static SettingsPanel settingsPanel = new SettingsPanel();

    BodySheets(){
        setLayout(new BorderLayout());
        main.setLayout(new OverlayLayout(main));
        setBackground(new Color(0,0,0,0));
        setOpaque(false);

        main.add(homePanel);
        main.add(favoritosPanel);
        main.add(reservationPanel);
        main.add(settingsPanel);
        
        add(main);
    }
    public static void homeVisble(){
        homePanel.setVisible(true);
        favoritosPanel.setVisible(false);
        reservationPanel.setVisible(false);
        settingsPanel.setVisible(false);
    }
    public static void favoritosVisible(){
        homePanel.setVisible(false);
        favoritosPanel.setVisible(true);
        reservationPanel.setVisible(false);
        settingsPanel.setVisible(false);
    }
    public static void reservationVisible(){
        homePanel.setVisible(false);
        favoritosPanel.setVisible(false);
        reservationPanel.setVisible(true);
        settingsPanel.setVisible(false);
    }
    public static void SettingsVisible(){
        homePanel.setVisible(false);
        favoritosPanel.setVisible(false);
        reservationPanel.setVisible(false);
        settingsPanel.setVisible(true);
    }
}
