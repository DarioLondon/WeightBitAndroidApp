package com.weightbit.dario.weightbit.model;

import java.util.Date;
import java.util.UUID;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Dario on 08/06/2017.
 */

public class Workout extends RealmObject implements Exercise{

    @PrimaryKey
    private String id = UUID.randomUUID().toString();
    private long user_id;
    private Date startSession;
    private Double duration;
    //private ExerciseType exerciseType;
    private Double weight;
    private int repetition;
    private double heart_rate;

    public Workout(){

        this.startSession = new Date();

    }



    public String getId() {
        return id;
    }

    public long getUser_id() {
        return user_id;
    }

    public double getHeart_rate() {
        return heart_rate;
    }

    public Date getStartSession() {
        return startSession;
    }

    public void setStartSession(Date startSession) {
        this.startSession = startSession;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    @Override
    public void setWeight(Double weight) {
       this.weight = weight;
    }

    @Override
    public void setRepetiton(int repetiton) {
        this.repetition = repetiton;
    }

    @Override
    public void setDuration(Double duration) {
        this.duration = duration;
    }

//    @Override
//    public void setExerciseType(ExerciseType type) {
//        this.exerciseType = type;
//    }

    @Override
    public void setBpm(Double bpm) {
        this.heart_rate = bpm;
    }

    @Override
    public Double getBpm() {
        return heart_rate;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public int getRepetition() {
        return this.repetition;
    }

//    @Override
//    public ExerciseType getExerciseType() {
//        return this.exerciseType;
//    }

    @Override
    public Double getDuration() {
        return duration;
    }
}

