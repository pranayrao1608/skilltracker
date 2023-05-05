package com.example.skilltracker.entity;
/*
 * import javax.persistence.Column; import javax.persistence.EnumType; import
 * javax.persistence.Enumerated;
 * 
 * import javax.persistence.Table;
 */

import com.example.skilltracker.SkillLevel;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;






/*
 * @Entity public class PersonSkill {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "person_id") private Person person;
 * 
 * @ManyToOne
 * 
 * @JoinColumn(name = "skill_id") private Skill skill;
 * 
 * private SkillLevel level; }
 */



/*
 * @Entity
 * 
 * @Table(name = "person_skill") public class PersonSkill {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY)
 * 
 * @Column(name = "person_skill_id") private Long id;
 * 
 * @ManyToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "person_id") private Person person;
 * 
 * @ManyToOne(fetch = FetchType.LAZY)
 * 
 * @JoinColumn(name = "skill_id") private Skill skill;
 * 
 * @Column(name = "level")
 * 
 * @Enumerated(EnumType.STRING) private SkillLevel level;
 * 
 * // constructors, getters, and setters }
 */