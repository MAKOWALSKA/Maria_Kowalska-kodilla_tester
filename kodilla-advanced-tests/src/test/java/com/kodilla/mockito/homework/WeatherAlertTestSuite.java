package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertTestSuite {
    WeatherAlert weatherAlert = new WeatherAlert();
    Alert alert = Mockito.mock(Alert.class);
    Person person = Mockito.mock(Person.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void onlySubscribedPersonsShouldrReceiveWeatherAlert() {
        //when
        weatherAlert.sendAlertToAllSubscribers(alert);
        //then
        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    public void eachSubscriberShouldReceiveAlertRelatedToLocationHeIsSubscribedTo() {
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
    }

    @Test
    public void eachPersonSubscribedMoreTimesToSameLocationShouldReceiveOneAlert() {
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
    }

    @Test
    public void eachSubscriberShouldReceiveAlertsForAllLocationsHeIsSubscribedTo() {
        //given
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location1, person);
        weatherAlert.addDataToTheMap(location2, person);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location1);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location2);
        //then
        Mockito.verify(person, Mockito.times(3)).receive(alert);
    }

    @Test
    public void clientsSubscribedToOneLocationShouldReceiveAlertToLocation() {
        //given
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location, person1);
        weatherAlert.addDataToTheMap(location, person2);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
        Mockito.verify(person1, Mockito.times(1)).receive(alert);
        Mockito.verify(person2, Mockito.times(1)).receive(alert);
    }

    @Test
    public void alertsVSLocationTest() {
        //given
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location, person1);
        weatherAlert.addDataToTheMap(location1, person1);
        weatherAlert.addDataToTheMap(location, person2);
        weatherAlert.addDataToTheMap(location2, person2);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location1);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location2);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
        Mockito.verify(person1, Mockito.times(2)).receive(alert);
        Mockito.verify(person2, Mockito.times(2)).receive(alert);
    }

    @Test
    public void groupAlertsTest() {
        //given
        Person person1 = Mockito.mock(Person.class);
        Person person2 = Mockito.mock(Person.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location, person1);
        weatherAlert.addDataToTheMap(location1, person1);
        weatherAlert.addDataToTheMap(location, person2);
        weatherAlert.addDataToTheMap(location2, person2);
        weatherAlert.sendAlertToAllSubscribers(alert);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
        Mockito.verify(person1, Mockito.times(2)).receive(alert);
        Mockito.verify(person2, Mockito.times(2)).receive(alert);
    }

    @Test
    public void partialCancellationOfSubscriptionTest() {
        //given
        Location location1 = Mockito.mock(Location.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location1, person);
        weatherAlert.deleteSubscription(location1, person);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location1);
        //then
        Mockito.verify(person, Mockito.times(1)).receive(alert);
    }

    @Test
    public void totalCancellationOfSubscriptionTest() {
        //given
        Location location1 = Mockito.mock(Location.class);
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.addDataToTheMap(location1, person);
        weatherAlert.deleteAllSubscribers(person);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location1);
        //then
        Mockito.verify(person, Mockito.never()).receive(alert);
    }

    @Test
    public void cancellationOfLocationTest(){
        //when
        weatherAlert.addDataToTheMap(location, person);
        weatherAlert.deleteLocation(location);
        weatherAlert.sendAlertRelatedToCertainToLocation(alert, location);
        //then
        Mockito.verify(person, Mockito.never()).receive(alert);
    }
}
