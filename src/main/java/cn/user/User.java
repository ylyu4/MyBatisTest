package cn.user;

import java.io.Serializable;

public class User implements Serializable {
    private int age;
    private String location;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
