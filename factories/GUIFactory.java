package Abstract_factory.factories;

import Abstract_factory.buttons.Button;
import Abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}