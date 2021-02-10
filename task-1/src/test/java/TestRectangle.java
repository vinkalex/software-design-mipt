import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {
    @Test
    public void TestArea() throws Exception {
        Rectangle r = new Rectangle(2, 3);
        var res = r.area();
        Assert.assertEquals(6, res, 0.00001);
    }
}
