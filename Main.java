import java.awt.BorderLayout;
import javax.swing.*;
import paneles.bannerPanel;
import paneles.loginPanel;
import paneles.MenuLateralPanel; 
public class Main {

    public static void main(String[] args) {
        JFrame miVentana = new JFrame(); 
        miVentana.setTitle("Hospital SCL"); 
        miVentana.setSize(1000, 800); 
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());
        miVentana.setLocationRelativeTo(null);

        // Panel login
        loginPanel loginPanel = new loginPanel();
        miVentana.add(loginPanel.getPanel(), BorderLayout.CENTER);

        // Panel Banner
        bannerPanel BannerPanel = new bannerPanel();
        miVentana.add(BannerPanel.getBanner(), BorderLayout.WEST);


        miVentana.setVisible(true);
    }
}
