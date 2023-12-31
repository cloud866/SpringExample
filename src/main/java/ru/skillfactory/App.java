package ru.skillfactory;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.skillfactory.entity.DeveloperInteraction;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.skillfactory");

        DeveloperInteraction developerInteraction = context.getBean(DeveloperInteraction.class);
        developerInteraction.run();
    }
}
