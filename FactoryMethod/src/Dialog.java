public abstract class Dialog {
    public void render(){
        System.out.print("Dialog render ");
    }
    abstract public Button createButton();
}