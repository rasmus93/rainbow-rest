package ua.net.tokar.json.filters.sample;

public class User {
    public final String name;
    public final Link friends;

    public User( String name, Link friends ) {
        this.name = name;
        this.friends = friends;
    }
}
