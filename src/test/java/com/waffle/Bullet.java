package com.waffle;

import com.waffle.components.ColliderComponent;
import com.waffle.components.KinematicComponent;
import com.waffle.components.SpriteRenderComponent;
import com.waffle.components.TransformComponent;
import com.waffle.core.SpriteRenderer;
import com.waffle.struct.Vec2f;
import com.waffle.ecs.GameObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Bullet extends GameObject {
    private static BufferedImage image;
    static {
        try {
            URL file = Bullet.class.getClassLoader().getResource("projectile.png");
            image = ImageIO.read(file);
        } catch(Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    private final TransformComponent transform;
    private final KinematicComponent kinematics;
    private final SpriteRenderComponent sprite;
    private final ColliderComponent collider;
    private final float speed;

    public Bullet(float speed, float x, float y) {
        this.speed = speed;
        sprite = new SpriteRenderComponent();
        kinematics = new KinematicComponent(new Vec2f(speed, -speed), new Vec2f(0, 0), 0);
        kinematics.applyGravity = true;
        sprite.sprites.add(new SpriteRenderer(new Vec2f(), image, 50, 50));
        transform = new TransformComponent(new Vec2f(x, y));
        collider = new ColliderComponent(
                new Vec2f(),
                new Vec2f(50, 50),
                e -> {
                    //world.removeGameObject(this);
                }
        );
    }

    public void update(float dt) {
//        if(transform.position.y >= 10000) {
//            world.removeGameObject(this);
//        }
    }

    @Override
    public void start() {

    }
}
