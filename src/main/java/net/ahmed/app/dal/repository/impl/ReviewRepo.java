/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ahmed.app.dal.repository.impl;

import net.ahmed.app.dal.entity.Review;
import net.ahmed.app.dal.repository.AbstractRepo;

/**
 *
 * @author Ahmed Hafez
 */
public class ReviewRepo extends AbstractRepo<Review>{
    
    public ReviewRepo() {
        super(Review.class);
    }
    
}
