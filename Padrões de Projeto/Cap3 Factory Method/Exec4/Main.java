package aulas.padroes.factorymethod.exercicio4;

public class Main {

	public static void main(String[] args) {
		Dialog dialog;

		dialog = new WindowsDialog();
		dialog.renderWindow();

		dialog = new HtmlDialog();
		dialog.renderWindow();
	}

}
