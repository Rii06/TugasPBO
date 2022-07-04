import frame.LaptopViewFrame;
import helpers.Koneksi;

public class Main {
    public static void main(String[] args) {
        Koneksi.getConnection();
        LaptopViewFrame viewFrame = new LaptopViewFrame();
        viewFrame.setVisible(true);
    }
}
