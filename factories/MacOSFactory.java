package Abstract_factory.factories;

import Abstract_factory.buttons.Button;
import Abstract_factory.buttons.MacOSButton;
import Abstract_factory.checkboxes.Checkbox;
import Abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}