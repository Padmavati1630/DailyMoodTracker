package com.assignment.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.Assignment.entity.Mood_tracker;

public interface TrackerRepository extends JpaRepository<Mood_tracker, Long> {

}
