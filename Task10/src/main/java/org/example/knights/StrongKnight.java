package org.example.knights;

import org.springframework.stereotype.Component;

@Component("strong")
public class StrongKnight implements Knight {

    @Override
    public void fight() {
        System.out.println("Strong hit");
    }
}
