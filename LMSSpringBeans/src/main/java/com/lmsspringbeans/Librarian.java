package com.lmsspringbeans;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;

public class Librarian extends User {

    public Librarian() {
    }

    public Librarian(String name, String username, String password, String role) {
        super(name, username, password, role);
    }

}
