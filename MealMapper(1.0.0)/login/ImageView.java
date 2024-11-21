import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImageView extends JComponent {

    private Icon image;
    public ImageView(Icon image) {
        
        this.image = image;
        setBackground(Color.WHITE);
    }


    @Override
    protected void paintComponent(Graphics grphcs) {
        if (image != null) {
            Graphics2D g2 = (Graphics2D) grphcs;
            Rectangle size = getAutoSize(image);
            int width = getWidth();
            int height = getHeight();
            BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = img.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, width, height, 23, 23);
            g.setComposite(AlphaComposite.SrcIn);
            
            g.drawImage(toImage(image), size.x, size.y, size.width, size.height, null);
            g.dispose();
            g2.drawImage(img, 0, 0, null);
            g2.dispose();
        }
        super.paintComponent(grphcs);
    }

   

    private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

    private Image toImage(Icon icon) {
        return ((ImageIcon) icon).getImage();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("test8 Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            JPanel main1 = new JPanel(new BorderLayout());
            JPanel topPanel1 = new JPanel(new BorderLayout());
            JPanel center2 = new JPanel();
            main1.setBackground(Color.BLUE);
            topPanel1.setBackground(Color.GREEN);
            center2.setBackground(Color.RED);
           ImageView ima = new ImageView(new ImageIcon("KFC.jpg"));
            topPanel1.add(ima);
            main1.add(topPanel1,BorderLayout.CENTER);
            center2.add(new JLabel("Ola"));
            main1.add(center2,BorderLayout.SOUTH);

            frame.add(main1);
            frame.setVisible(true);
        });
    }
}

