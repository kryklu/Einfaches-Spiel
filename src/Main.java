import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(view, model);
            view.setVisible(true);
        }
    });
}
