
public abstract class Dialog {

	public void renderWindow() {
		Button button = createButton();
		button.render();
		button.onClick();
	}
	
	public abstract Button createButton();
}
