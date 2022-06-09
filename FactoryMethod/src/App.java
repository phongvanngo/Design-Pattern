public class App {
    public static void main(String[] args) throws Exception {
        String config = "Window";
        Dialog dialog;
        if (config == "Window") {
            dialog = new WindowDialog();
        } else {
            dialog = new WebDialog();
        }

        
    }
}
