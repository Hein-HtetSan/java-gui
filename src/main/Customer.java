package main;

public class Customer {
    private String name;
    private String phone;
    private String address;
    private String artwork;
    private String artist;

    public Customer(){
        // default Customer
    }

    public Customer(String name, String phone, String address, String artwork, String artist){
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.artist = artist;
        this.artwork = artwork;
    }

    // Encapsulation Fields

    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getArtwork(){
        return artwork;
    }
    public String getArtist(){
        return artist;
    }
}
