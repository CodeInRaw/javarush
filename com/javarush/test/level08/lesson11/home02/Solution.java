package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Set;

/**
 * JavaRush.ru
 * Level 08, Lesson 11, Home 02
 * <p/>
 * Создать класс Cat, Dog. Создать множество (Set) котов и добавить туда 4 объекта - кот. Создать множество (Set) собак
 * и добавить туда 3 объекта - собака. Создать множество всех животных (Set<Object>) и добавить в него всех котов и
 * собак. Вывести содержимое этого множества на экран. Удалить из множества всех кошек. Вывести содержимое множества
 * всех животных на экран.
 * <p/>
 * Date: 08.04.13
 * @author Sergey Kandalintsev
 */
public class Solution
{
    public static void main( String[] args )
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join( cats, dogs );
        printPets( pets );

        removeCats( pets, cats );
        printPets( pets );
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        //Написать тут ваш код

        return result;
    }

    public static Set<Dog> createDogs()
    {
        //Написать тут ваш код
        return null;
    }

    public static Set<Object> join( Set<Cat> cats, Set<Dog> dogs )
    {
        //Написать тут ваш код
        return null;
    }

    public static void removeCats( Set<Object> pets, Set<Cat> cats )
    {
        //Написать тут ваш код
    }

    public static void printPets( Set<Object> pets )
    {
        for ( Object pet : pets )
        {
            System.out.println( pet );
        }

        System.out.println();
    }

    public static class Cat
    {

    }

    public static class Dog
    {

    }
}
