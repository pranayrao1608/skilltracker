
package com.example.skilltracker.entity;

import jakarta.persistence.Entity;

import java.util.*;

import com.example.skilltracker.SkillLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


  
  
  @Entity
  
  @Table(name = "skills") public class Skill {
  
  @Id
  
  @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
  
  
  private String level;
  
  public String getLevel() { return level; }
  
  public void setLevel(String level) { this.level = level; }
  
  public Long getId() { return id; }
  
  public void setId(Long id) { this.id = id; }
  
  
  
  public String getName() { return name; }
  
  public void setName(String name) { this.name = name; }
  
  private String name;
  
  
  
  
  
  // getters and setters
  
  }
  
  
  
  
  
  
  
  
 

/*
 * 
 * @Entity
 * 
 * @Table(name = "skill") public class Skill {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "skill_id") private Long id;
 * 
 * @Column(name = "name") private String name;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "person_id") private Person person;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "skill_level_id") private SkillLevel skillLevel;
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getName() { return name; }
 * 
 * public void setName(String name) { this.name = name; }
 * 
 * public Person getPerson() { return person; }
 * 
 * public void setPerson(Person person) { this.person = person; }
 * 
 * public SkillLevel getSkillLevel() { return skillLevel; }
 * 
 * public void setSkillLevel(SkillLevel skillLevel) { this.skillLevel =
 * skillLevel; }
 * 
 * // constructors, getters and setters }
 */