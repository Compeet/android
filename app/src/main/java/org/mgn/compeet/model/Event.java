package org.mgn.compeet.model;

/**
 * Created by peta on 8.2.15.
 */
public class Event {

    private int start;
    private int end;
    private String name;
    private int distance;
    private Location note;
    /** Lat, Lon **/

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Location getNote() {
        return note;
    }

    public double getLatitude() {
        return note.getLatitude();
    }

    public double getLongitude() {
        return note.getLongitude();
    }

    public void setNote(Location note) {
        this.note = note;
    }
}
