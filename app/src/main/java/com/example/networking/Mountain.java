package com.example.networking;

public class Mountain {
    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    private int size;
    private int cost;

    public Mountain(String ID, String name, String type, String company, String location, String category, int size, int cost) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.company = company;
        this.location = location;
        this.category = category;
        this.size = size;
        this.cost = cost;
    }

    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getCompany() {
        return company;
    }
    public String getLocation() {
        return location;
    }
    public String getCategory() {
        return category;
    }
    public int getSize() {
        return size;
    }
    public int getCost() {
        return cost;
    }
}