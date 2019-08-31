package stickman.model;

import java.util.List;

public class LevelImpl implements Level{
    private double height;
    private double width;
    private double floorHeight;
    private Entity hero;
    private List<Entity> entities;

    @Override
    public List<Entity> getEntities() {
        return entities;
    }

    @Override
    public double getHeight() {
        return this.height;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public void tick() {

    }

    @Override
    public double getFloorHeight() {
        return this.floorHeight;
    }

    @Override
    public double getHeroX() {
        return hero.getXPos();
    }

    @Override
    public boolean jump() {
        return true;
    }

    @Override
    public boolean moveLeft() {
        return true;
    }

    @Override
    public boolean moveRight() {
        return true;
    }

    @Override
    public boolean stopMoving() {
        return true;
    }
}
