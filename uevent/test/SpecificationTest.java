import com.botyware.uevent.domain.Entity;
import com.botyware.uevent.domain.HostSpecification;
import com.botyware.uevent.domain.User;
import com.botyware.uevent.domain.plugs.QRReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
    @Test
    public void shouldReturnFalseIfNotHost() {

        //arrange
        User u = new User(new QRReader());
        HostSpecification hs = new HostSpecification();

        //act
        boolean result = hs.is(u);

        //assert
        assertEquals(false, result);
    }

    @Test
    public void testIsSecu() {

    }

    @Test
    public void testIsGuest() {

    }
}
