
public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("window button click");
    }

    @Override
    public void render() {
        System.out.println("window button render");
    }
}
