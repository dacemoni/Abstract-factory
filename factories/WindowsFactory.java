package Abstract_factory.factories;

import Abstract_factory.buttons.Button;
import Abstract_factory.buttons.WindowsButton;
import Abstract_factory.checkboxes.Checkbox;
import Abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}