/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ahmed.app.dal.repository.impl;

import net.ahmed.app.dal.entity.Instructor;
import net.ahmed.app.dal.repository.AbstractRepo;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ahmed Hafez
 */
@Repository
public class InstructorRepo extends AbstractRepo<Instructor>{
    
    public InstructorRepo() {
        super(Instructor.class);
    }
    
}
