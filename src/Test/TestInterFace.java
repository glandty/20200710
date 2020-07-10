package Test;
interface Shape{
    void draw();
}
class Cycle implements Shape {
    @Override
    public void draw() {
        System.out.println("画个○");
    }
}

class React implements Shape {
    @Override
    public void draw() {
        System.out.println("画一个方片");
    }
}

public class TestInterFace {
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();
        shape1.draw();
        shape2.draw();
    }
}
