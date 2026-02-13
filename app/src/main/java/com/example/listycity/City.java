package com.example.listycity;

import java.util.Objects;

/**
 * This class defines a City.
 * It contains the city name and the province name.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructor for the City class.
     * @param city The name of the city
     * @param province The name of the province
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     * @return The city name as a String
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province.
     * @return The province name as a String
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city for order.
     * Cities are compared based on their names lexicographically.
     * @param city The city to be compared.
     * @return a negative integer, zero, or a positive integer as this city
     * is less than, equal to, or greater than the specified city.
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two cities are considered equal if they have the same city name and province name.
     * @param o The reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }

    /**
     * Returns a hash code value for the city.
     * This method is supported for the benefit of hash tables.
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}