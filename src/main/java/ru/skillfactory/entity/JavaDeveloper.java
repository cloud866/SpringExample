package ru.skillfactory.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("javaDeveloper")
public class JavaDeveloper implements Developer {

    @Override
    public String getCode() {
        return "public static void main(String[] args) {}";
    }

}
