package com.kodilla.mockito.homework;

import java.util.*;

public class WeatherAlert {

    private final Map<Location, Set<Person>> clientAndLocationMap = new HashMap<>();

    public void addDataToTheMap(Location location, Person person) {
        if (this.clientAndLocationMap.containsKey(location)) {
            this.clientAndLocationMap.get(location).add(person);
        } else {
            Set<Person> persons = new HashSet<>();
            persons.add(person);
            this.clientAndLocationMap.put(location, persons);
        }
    }

    public void deleteSubscription(Location location, Person person) {
        if (this.clientAndLocationMap.containsKey(location)) {
            this.clientAndLocationMap.get(location).remove(person);
        }
    }

    public void deleteAllSubscribers(Person person) {
        clientAndLocationMap.forEach((key, value) -> value.remove(person));
    }

    public void sendAlertRelatedToCertainToLocation(Alert alert, Location location) {
        if (this.clientAndLocationMap.containsKey(location)) {
            clientAndLocationMap.get(location).forEach(a -> a.receive(alert));
        }
    }

    public void sendAlertToAllSubscribers(Alert alert) {
        this.clientAndLocationMap.values().forEach(a -> a.forEach(b -> b.receive(alert)));
    }

    public void deleteLocation(Location location){
        this.clientAndLocationMap.remove(location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherAlert)) return false;
        WeatherAlert that = (WeatherAlert) o;
        return Objects.equals(clientAndLocationMap, that.clientAndLocationMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientAndLocationMap);
    }

    @Override
    public String toString() {
        return "WeatherAlert{" +
                "clientAndLocationMap=" + clientAndLocationMap +
                '}';
    }
}
