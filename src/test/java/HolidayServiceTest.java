import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.services.HolidayService;
import org.junit.jupiter.api.Assertions;

public class HolidayServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/info.csv")
    void testExample(int expected, int income, int expense, int threshold) {
        HolidayService service = new HolidayService();
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
