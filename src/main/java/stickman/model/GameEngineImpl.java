package stickman.model;

public class GameEngineImpl implements GameEngine {

    public GameEngineImpl(String configPath) {

    }

    @Override
    public Level getCurrentLevel() {
        return null;
    }

    @Override
    public void startLevel() {

    }

    // Hero inputs - boolean for success (possibly for sound feedback)
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

    @Override
    public void tick() {

    }

}
