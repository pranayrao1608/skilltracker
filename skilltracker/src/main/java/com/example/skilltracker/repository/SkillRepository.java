package com.example.skilltracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.skilltracker.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    

}
