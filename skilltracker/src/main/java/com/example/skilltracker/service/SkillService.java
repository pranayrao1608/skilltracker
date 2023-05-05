package com.example.skilltracker.service;

import java.util.List;

import com.example.skilltracker.entity.Skill;


public interface SkillService {
    List<Skill> getAllSkills();
    Skill getSkillById(Long skillId);
    Skill createSkill(Skill skill);
    Skill updateSkill(Long skillId, Skill skillDetails);
    void deleteSkill(Long skillId);
}
