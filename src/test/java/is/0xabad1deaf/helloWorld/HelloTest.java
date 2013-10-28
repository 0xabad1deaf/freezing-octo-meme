import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class HelloTest
{
    @test
    public void programPrintsHello()
    {
        World world = new World();
        assertEquals("Hello world", world.greet());
    }
}
