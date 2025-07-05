package parkingschedular;

import java.awt.Color;
import java.time.LocalDateTime;
import parkingschedular.login.LoginGUI;
import parkingschedular.register.RegisterGUI;
import parkingschedular.server.Server;
import parkingschedular.user.UserDashboardGUI;

public class ParkingSchedular {

    public static LoginGUI lg;
    public static RegisterGUI rg;
    public static UserDashboardGUI udg;
    public static Server server;
    
    public static Color enterButtonColor = new Color(40, 200, 55);
    public static Color buttonColor = new Color(0, 214, 34);
    public static Color panelColor = new Color(0, 0, 0, 60);
    
    public static String Email = null;
    public static String date;
    public static String time;
    public static LocalDateTime currentTime;

    public static void main(String[] args) {
        LoadingScreenGUI loading = new LoadingScreenGUI();
        loading.setVisible(true);
    }
}
