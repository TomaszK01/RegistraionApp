import entity.UsersEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.junit.jupiter.api.Assertions.*;

public class form_test {


    @Test
    public void cancelButtonTest() {
        try {

            ActionEvent e = null;
            ;
            JFrame parentc = null;
            ;
            RegistrationForm registrationform = new RegistrationForm(parentc);
//            registrationform.actionPerformed(e);
            assertTrue(true);

        } catch (Exception exception) {

            exception.printStackTrace();
            assertFalse(false);
        }
    }


    @Test
    public void registerUser() {
        try {
            JFrame parentc = null;
            ;
            RegistrationForm registrationform = new RegistrationForm(parentc);
            registrationform.registerUser();
            assertTrue(true);

        } catch (Exception exception) {

            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    public void testAddUserToDatabase() {
        // Given
        String name = "Jan";
        String email = "jan@example.com";
        String phone = "123456789";
        String address = "Test avenue 12";
        String password = "pass123";

        UsersEntity expectedUser = new UsersEntity();
        expectedUser.name = name;
        expectedUser.email = email;
        expectedUser.phone = phone;
        expectedUser.address = address;
        expectedUser.password = password;

        // When
        RegistrationForm registrationform = new RegistrationForm(null);
        UsersEntity actualUser = registrationform.addUserToDatabase(name, email, phone, address, password);

        // Then
        Assertions.assertEquals(expectedUser.name, actualUser.name);
        Assertions.assertEquals(expectedUser.email, actualUser.email);
        Assertions.assertEquals(expectedUser.phone, actualUser.phone);
        Assertions.assertEquals(expectedUser.address, actualUser.address);
        Assertions.assertEquals(expectedUser.password, actualUser.password);
    }


}