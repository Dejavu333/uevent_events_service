import com.botyware.uevent.domain.*;
import com.botyware.uevent.domain.plugs.EventAborterPlug;
import com.botyware.uevent.domain.plugs.QRReaderPlug;
import com.botyware.uevent.domain.specifications.GuestSpecification;
import com.botyware.uevent.domain.specifications.HostSpecification;
import com.botyware.uevent.domain.specifications.SecuSpecification;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecificationTest {
    @Test
    public void shouldReturnFalseIfUserIsNotHost() {

        //arrange
        UUser user = new UUser(null, null, null, new QRReaderPlug());
        HostSpecification hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsHost() {

        //arrange
        UUser user = new UUser(null, null, null, new EventAborterPlug());
        HostSpecification  hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(user);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotSecu() {

        //arrange
        UUser user = new UUser(null, null, null, new EventAborterPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsSecu() {

        //arrange
        UUser user = new UUser(null, null, null, new QRReaderPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(user);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotGuest() {

        //arrange
        UUser user = new UUser(null, null, null, new EventAborterPlug());
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(user);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsGuest() {

        //arrange
        UUser user = new UUser(null, null, null);
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(user);

        //assert
        assertEquals(true, result);
    }
}
