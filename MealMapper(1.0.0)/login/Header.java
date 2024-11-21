import java.awt.Color;
import java.awt.FlowLayout;


public class Header  extends RoundedPanel{
    WinButton winButton = new WinButton();
Header(){
    setBackground(new Color(0,0,0,0));
    setBorderColor(new Color(0,0,0,0));
    setBorderThickness(0);
    setLayout(new FlowLayout(FlowLayout.RIGHT));
    add(winButton);
}
    
}
