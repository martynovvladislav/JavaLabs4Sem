package org.example;

import org.example.knights.KingOfKnights;
import org.example.knights.Knight;
import org.example.knights.StrongKnight;
import org.example.knights.WeakKnight;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Knight knight = applicationContext.getBean("king", KingOfKnights.class);
        knight.fight();
        System.out.println();
        knight = applicationContext.getBean("strong", StrongKnight.class);
        knight.fight();
        System.out.println();
        knight = applicationContext.getBean("weak", WeakKnight.class);
        knight.fight();
    }
}
