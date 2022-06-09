public class WebButton implements Button {
    @Override
    public void onClick() {
        System.out.print("web button click");
    }

    @Override
    public void render() {
        System.out.print("web button render");
    }
}
