package org.example.wind;

public class Thing {
    private String name;
    private int age;
    private String song;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }


    public Thing() {
    }

    public Thing(String name, int age, String song) {
        this.name = name;
        this.age = age;
        this.song = song;
    }


}
