/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.persona.demo.services;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Service;
import javax.persistence.PersistenceContext;

/**
 *
 * @author anthony
 */
@Service
public class UserService {
    @PersistenceContext
    private EntityManager em;
}
