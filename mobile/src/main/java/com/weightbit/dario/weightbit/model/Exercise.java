package com.weightbit.dario.weightbit.model;

/**
 * Created by Dario on 08/06/2017.
 */

public interface Exercise {

    void setWeight(Double weight);
    void setRepetiton(int repetiton);
    void setDuration(Double duration);
    //void setExerciseType(ExerciseType type);
    void setBpm(Double bpm);
    Double getBpm();
    Double getWeight();
    int getRepetition();
    //ExerciseType getExerciseType();
    Double getDuration();


}
