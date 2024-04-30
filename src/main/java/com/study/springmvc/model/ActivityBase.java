package com.study.springmvc.model;

import java.util.Date;

//TODO : Better define properties names and methods.
public abstract class ActivityBase {
    private Long activityId;
    private Discipline discipline;
    private String activityDescription;
    private Date datePosted;
    private Date activityDeadline;
}
