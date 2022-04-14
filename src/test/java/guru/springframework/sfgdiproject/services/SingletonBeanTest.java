package guru.springframework.sfgdiproject.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class SingletonBeanTest {
    private static final String NAME = "John";

    @Test
    public void givenSingletonScope_whenset_thenEqual(){
        SingletonBean s1 = new SingletonBean();
        SingletonBean s2 = new SingletonBean();
        s1.setName(NAME);
//        assertTrue(s1.getName().equals(s2.getName()));
    }
}