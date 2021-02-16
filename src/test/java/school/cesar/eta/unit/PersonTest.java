package school.cesar.eta.unit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;



@ExtendWith(MockitoExtension.class)
public class PersonTest {

    Person person = new Person();
    @Test
    public void getName_firstNameJonLastNameSnow_jonSnow() {

        //fail();
        //Person person = new Person();

        person.setName("Jon");
        person.setLastName("Snow");

        assertEquals(person.getName(),"Jon Snow");
    }

    @Test
    public void getName_firstNameJonNoLastName_jon() {
        fail();
    }

    @Test
    public void getName_noFirstNameLastNameSnow_snow() {
        fail();
    }

    @Test
    public void getName_noFirstNameNorLastName_throwsException() {
        fail();
    }

    @Test
    public void isBirthdayToday_differentMonthAndDay_false() {
        fail();
    }

    @Test
    public void isBirthdayToday_sameMonthDifferentDay_false() {
        fail();
    }

    @Test
    public void isBirthdayToday_sameMonthAndDay_true() {
        fail();
    }

    @Test
    public void addToFamily_somePerson_familyHasNewMember() {
        fail();
    }

    @Test
    public void addToFamily_somePerson_personAddedAlsoHasItsFamilyUpdated() {
        fail();
    }

    @Test
    public void isFamily_nonRelativePerson_false() {
        fail();
    }

    @Test
    public void isFamily_relativePerson_true() {
        fail();
    }
}
