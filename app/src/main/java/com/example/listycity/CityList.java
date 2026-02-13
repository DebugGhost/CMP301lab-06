package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class keeps track of a list of city objects.
 * It allows adding, deleting, and checking for cities.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This is the constructor.
     * It initializes an empty list of cities.
     */
    public CityList() {
        // Empty constructor
    }
    /**
     * Adds a city to the list.
     * If the city already exists in the list, an exception is thrown.
     * @param city The candidate city to add
     * @throws IllegalArgumentException if the city already exists in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns a sorted list of cities.
     * The list is sorted based on the city names.
     * @return A sorted List of City objects
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a city is present in the list.
     * @param city The city to check for
     * @return true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     * If the city does not exist in the list, an exception is thrown.
     * @param city The city to remove
     * @throws IllegalArgumentException if the city is not found in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns the total number of cities in the list.
     * @return The integer count of cities
     */
    public int countCities() {
        return cities.size();
    }
}