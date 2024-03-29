package com.capstone.producer.common.bindings;

import java.util.StringJoiner;

/**
 * Request Object that is received by the /airport/generate endpoint in this application.
 * Helps facilitate the generation of a Mock flight when given all the non-airport information
 */
public class GenerateRequest {
    protected String airlineName;
    protected String flightIcao;

    protected float longitude;
    protected float latitude;
    protected float altitude;

    protected float longitudeChange;
    protected float latitudeChange;
    protected float altitudeChange;

    @Override
    public String toString() {
        return new StringJoiner(", ", GenerateRequest.class.getSimpleName() + "[", "]")
                .add("airlineName='" + airlineName + "'")
                .add("flightIcao='" + flightIcao + "'")
                .add("longitude=" + longitude)
                .add("latitude=" + latitude)
                .add("altitude=" + altitude)
                .add("longitudeChange=" + longitudeChange)
                .add("latitudeChange=" + latitudeChange)
                .add("altitudeChange=" + altitudeChange)
                .toString();
    }

    public String getAirlineName() {
        return airlineName;
    }

    public GenerateRequest setAirlineName(String airlineName) {
        this.airlineName = airlineName;
        return this;
    }

    public String getFlightIcao() {
        return flightIcao;
    }

    public GenerateRequest setFlightIcao(String flightIcao) {
        this.flightIcao = flightIcao;
        return this;
    }

    public GenerateRequest setAltitude(float altitude) {
        this.altitude = altitude;
        return this;
    }

    public float getLongitude() {
        return longitude;
    }

    public GenerateRequest setLongitude(float longitude) {
        this.longitude = longitude;
        return this;
    }

    public float getLatitude() {
        return latitude;
    }

    public GenerateRequest setLatitude(float latitude) {
        this.latitude = latitude;
        return this;
    }

    public float getAltitude() {
        return altitude;
    }

    public float getLongitudeChange() {
        return longitudeChange;
    }

    public GenerateRequest setLongitudeChange(float longitudeChange) {
        this.longitudeChange = longitudeChange;
        return this;
    }

    public float getLatitudeChange() {
        return latitudeChange;
    }

    public GenerateRequest setLatitudeChange(float latitudeChange) {
        this.latitudeChange = latitudeChange;
        return this;
    }

    public float getAltitudeChange() {
        return altitudeChange;
    }

    public GenerateRequest setAltitudeChange(float altitudeChange) {
        this.altitudeChange = altitudeChange;
        return this;
    }
}
