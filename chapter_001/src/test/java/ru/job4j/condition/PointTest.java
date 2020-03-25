import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {
    @Test
    public void Test1() {
        Point c = new Point(1, 1, 1);
        Point d = new Point(0, 3, 3);
        double expected = 3;
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void Test2() {
        Point c = new Point(1, 5, 5);
        Point d = new Point(0, 2, 2);
        double expected = 4.35;
        double out = c.distance3d(d);
        Assert.assertEquals(expected, out, 0.01);
    }
}



