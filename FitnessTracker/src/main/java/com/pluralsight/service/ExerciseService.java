package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Activity;

public interface ExerciseService 
{
	public abstract List<Activity> findAllActivities();
}