package hud.plus.hud;

import hud.plus.system.Element;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class ExampleElement extends Element<ExampleElement> {
    public ExampleElement() {
        super("Example Element", "splashgod.cc is the best", ExampleElement::new);
    }
    @Override
    public void render(HudRenderer renderer) {
        renderer.text("splashgod.cc", x, y, Color.WHITE, true);
    }
}
