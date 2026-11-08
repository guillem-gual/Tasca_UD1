/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc32c.tasca_ud01.model;

import java.util.HashMap;
import java.util.Map;

public class Joc {
    private String nom;
    private String genere;
    private Map<String, Integer> unitatsPerPlataforma; // P.ej. "PS5" -> 5, "PC" -> 3

    public Joc(String nom, String genere) {
        this.nom = nom;
        this.genere = genere;
        this.unitatsPerPlataforma = new HashMap<>();
    }

    public void setStock(String plataforma, int unitats) {
        unitatsPerPlataforma.put(plataforma, unitats);
    }

    public int getStock(String plataforma) {
        return unitatsPerPlataforma.getOrDefault(plataforma, 0);
    }

    public Map<String, Integer> getUnitatsPerPlataforma() {
        return unitatsPerPlataforma;
    }

    public String getNom() { return nom; }
    public String getGenere() { return genere; }
    
    @Override
    public String toString() { return nom; }
   
}