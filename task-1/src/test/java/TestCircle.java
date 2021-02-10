import org.junit.Assert;
import org.junit.Test;

public class TestCircle {
    @Test
    public void TestArea() throws Exception {
        Circle circle = new Circle(1);
        var res = circle.area();
        Assert.assertEquals(Math.PI, res, 0.00001);
    }
}
