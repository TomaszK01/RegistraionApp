import entity.UsersEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.*;
import javax.swing.text.html.parser.Entity;

public class Main {

    public static void main(String[] args) {


        RegistrationForm myForm = new RegistrationForm(null);
        UsersEntity user = myForm.user;
        if (user != null) {
            System.out.println("Udana rejestracja studenta: " + user.name);
        }
        else {
            System.out.println("Rejestracja nieudana");
        }
    }

}
