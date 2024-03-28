package org.example.knights;

import org.springframework.stereotype.Component;

@Component("weak")
public class WeakKnight implements Knight {
    @Override
    public void fight() {
        System.out.println("Weak hit");
    }
}
