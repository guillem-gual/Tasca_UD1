/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc32c.tasca_ud01.model;

import java.time.LocalDate;

/**
 *
 * @author guill
 */
public class Usuari {
    private String nom;
    private String llinatge1;
    private String llinatge2;
    private String dni;
    private String telefon;
    private LocalDate dataRegistre;

    public Usuari(String nom, String llinatge1, String llinatge2, String dni, String telefon) {
        this.nom = nom;
        this.llinatge1 = llinatge1;
        this.llinatge2 = llinatge2;
        this.dni = dni;
        this.telefon = telefon;
        this.dataRegistre = LocalDate.now();
    }

    public String getNomComplet() {
        return nom + " " + llinatge1 + (llinatge2 != null && !llinatge2.isEmpty() ? " " + llinatge2 : "");
    }

    // Getters y Setters...
    public String getNom() { return nom; }
    public String getDni() { return dni; }
    @Override
    public String toString() { return getNomComplet(); }
}
