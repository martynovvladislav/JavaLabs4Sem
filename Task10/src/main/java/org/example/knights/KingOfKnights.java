package org.example.knights;

import org.springframework.stereotype.Component;

@Component("king")
public class KingOfKnights implements Knight {
    @Override
    public void fight() {
        System.out.println("Knights are going to hit");
    }
}
