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
        UUser UUser = new UUser(new QRReaderPlug());
        HostSpecification hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(UUser);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsHost() {

        //arrange
        UUser UUser = new UUser(new EventAborterPlug());
        HostSpecification  hostSpecification = new HostSpecification();

        //act
        boolean result = hostSpecification.is(UUser);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotSecu() {

        //arrange
        UUser UUser = new UUser(new EventAborterPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(UUser);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsSecu() {

        //arrange
        UUser UUser = new UUser(new QRReaderPlug());
        SecuSpecification secuSpecification = new SecuSpecification();

        //act
        boolean result = secuSpecification.is(UUser);

        //assert
        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseIfUserIsNotGuest() {

        //arrange
        UUser UUser = new UUser(new EventAborterPlug());
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(UUser);

        //assert
        assertEquals(false, result);
    }
    @Test
    public void shouldReturnTrueIfUserIsGuest() {

        //arrange
        UUser UUser = new UUser();
        GuestSpecification guestSpecification = new GuestSpecification();

        //act
        boolean result = guestSpecification.is(UUser);

        //assert
        assertEquals(true, result);
    }
}
