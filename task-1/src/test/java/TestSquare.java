import org.junit.Assert;
import org.junit.Test;

public class TestSquare {
    @Test
    public void TestArea() throws Exception {
        Square s = new Square(5);
        var res = s.area();
        Assert.assertEquals(25, res, 0.00001);
    }
}
