/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template */package com.persona.demo.entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import lombok.Data;@Datapublic class Usuario {        @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private long id;    private String username;    private String password;}