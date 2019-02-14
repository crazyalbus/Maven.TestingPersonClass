package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testSetGender() {
        //Given
        Person person = new Person("Bob", 27);
        char expected = 'M';

        //When
        person.setGender('M');

        //Then
        char actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor() {
        //Given
        Person person = new Person("Bob", 27);
        String expected = "Blonde";

        //When
        person.setHairColor("Blonde");

        //Then
        String actual = person.getHairColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEyeColor() {
        //Given
        Person person = new Person("Bob", 27);
        String expected = "Blue";

        //When
        person.setEyeColor("Blue");

        //Then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMaritalStatus() {
        //Given
        Person person = new Person("Bob", 27);
        char expected = 'S';

        //When
        person.setMaritalStatus('S');

        //Then
        char actual = person.getMaritalStatus();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAlive() {
        //Given
        Person person = new Person("Bob", 27);
        boolean expected = true;

        //When
        person.setAlive(true);

        //Then
        boolean actual = person.getAlive();
        Assert.assertEquals(expected, actual);
    }

}
