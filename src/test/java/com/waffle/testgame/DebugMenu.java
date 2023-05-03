//package com.waffle.testgame;
//
//import com.waffle.components.FontRenderComponent;
//import com.waffle.components.GeometryComponent;
//import com.waffle.components.TransformComponent;
//import com.waffle.core.RenderShape;
//import com.waffle.struct.Vec2f;
//import com.waffle.ecs.GameObject;
//import com.waffle.input.Input;
//
//import java.awt.*;
//
//import static com.waffle.core.Constants.*;
//
//public class DebugMenu extends GameObject {
//    private GeometryComponent outline;
//    private TransformComponent transform;
//    private FontRenderComponent text;
//    private FrameCounter counter;
//    private static final int STRING_COUNT = 11;
//
//    @Override
//    public void start() {
//        counter = GameTest.INSTANCE.frameCounter;
//        outline = new GeometryComponent();
//        outline.shapes.add(new RenderShape(ShapeType.RECTANGLE, DrawMode.OUTLINE, Color.BLACK, 300, 5 + 5 + (STRING_COUNT * 16), new Vec2f()));
//        text = new FontRenderComponent("");
//        text.position = new Vec2f(5, 10);
//        transform = new TransformComponent(20, 20);
//    }
//
//    @Override
//    public void update(float dt) {
//        text.message = String.format(
//                """
//                        Current FPS: %.4f
//                        Volume (dB): %.2f
//                        Entity count: %d
//                        Camera zoom: %.1f
//                        Player position: (%.2f, %.2f)
//                        Camera position: (%.2f, %.2f)
//                        Slider value: %.2f
//                        Mouse position: (%d, %d)
//                        Normalized slider val: %.2f
//                        Collision count: %d
//                        Render time: %.1fus""",
//                counter.getFps(),
//                GameTest.INSTANCE.currentVolume,
//                world.getLivingEntityCount(),
//                GameTest.INSTANCE.camera.getZoomScale(),
//                GameTest.INSTANCE.player.getPosition().x, GameTest.INSTANCE.player.getPosition().y,
//                GameTest.INSTANCE.camera.getPosition().x, GameTest.INSTANCE.camera.getPosition().y,
//                GameTest.INSTANCE.slider.getValue(),
//                Input.getInstance().getMousePosition().x, Input.getInstance().getMousePosition().y,
//                GameTest.INSTANCE.slider.getNormalizedValue(),
//                GameTest.INSTANCE.testObj.counter,
//                GameTest.INSTANCE.renderTime
//        );
//    }
//}
