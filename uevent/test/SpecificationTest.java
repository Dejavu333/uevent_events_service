import com.botyware.uevent.domain.*;
import com.botyware.uevent.domain.plugs.CapacityPlug;
import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
    @Test
    public void shouldReturnFalseIfUserIsNotHost() {

        //arrange
        User user = new User(new QRReaderPlug());
        HostSpecification hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsHost() {

        //arrange
        User user = new User(new EventAborterPlug());
        HostSpecification  hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(user);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotSecu() {

        //arrange
        User user = new User(new EventAborterPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsSecu() {

        //arrange
        User user = new User(new QRReaderPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(user);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotGuest() {

        //arrange
        User user = new User(new EventAborterPlug());
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsGuest() {

        //arrange
        User user = new User(new CapacityPlug());
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(user);

        //assert
        assertEquals(true, result);
    }
}
