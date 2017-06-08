package com.weightbit.dario.weightbit.model;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;


/**
 * Created by Dario on 08/06/2017.
 */

public class User extends RealmObject{

    @PrimaryKey
    private String id  = UUID.randomUUID().toString();

    private String registration_date;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String city;
    private String dateOfBirth;
    private Double height;
    private Double weight;
    private String biologicalSex;
    private String blood_type;
    private RealmList<Workout> workouts;
    private int Age;

    public User(){

        this.registration_date = new Date().toString();
    }



    public void setName(String name) {this.name = name;}

    public void setSurname(String surname) {this.surname = surname;}

    public void setUsername(String username) {this.username = username;}

    public void setPassword(String password) {this.password = password;}

    public void setCity(String city) {this.city = city;}

    public void setBlood_type(String blood_type) {this.blood_type = blood_type;}

    public void setDateOfBirth(String dateOfBirth) {this.dateOfBirth = dateOfBirth;}

    public void setBiologicalSex(String biologicalSex) {this.biologicalSex = biologicalSex;}

    public void setHeight(Double height) {this.height = height;}

    public void setWeight(Double weight) {this.weight = weight;}

    public String getId() {return id;}

    public String getRegistration_date() {return registration_date;}

    public String getName() {return name;}

    public String getSurname() {return surname;}

    public String getUsername() {return username;}

    public String getPassword() {return password;}

    public String getDateOfBirth() {return dateOfBirth;}

    public String getCity() {return city;}

    public String getBiologicalSex() {return biologicalSex;}

    public String getBlood_type() {return blood_type;}

    public Double getHeight() {return height;}

    public Double getWeight() {return weight;}

    public void setWorkouts(RealmList<Workout> workouts) {
        this.workouts = workouts;
    }

    public RealmList<Workout> getWorkouts() {
        return workouts;
    }
}
