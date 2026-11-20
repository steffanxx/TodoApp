import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAddTask() {
        Main app = new Main();
        app.addTask("Сделать лабораторную");
        app.addTask("Сдать лабораторную");
        assertEquals(2, app.getTaskCount());
    }
}