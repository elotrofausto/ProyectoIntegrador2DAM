import Controller.BLogic;
import javax.swing.UIManager;

/**
 * @author vesprada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        BLogic controller = new BLogic();
    }

}
