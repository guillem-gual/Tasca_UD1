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
public class Lloguer {
    private int numRegistre;
    private Usuari usuari;
    private Joc joc;
    private String plataforma;
    private LocalDate dataInici;
    private LocalDate dataTornada;
    private boolean retornat;

    public Lloguer(int numRegistre, Usuari usuari, Joc joc, String plataforma, int diesLloguer) {
        this.numRegistre = numRegistre;
        this.usuari = usuari;
        this.joc = joc;
        this.plataforma = plataforma;
        this.dataInici = LocalDate.now();
        this.dataTornada = this.dataInici.plusDays(diesLloguer);
        this.retornat = false;
    }

    public boolean isForaDeTermini() {
        return !retornat && LocalDate.now().isAfter(dataTornada);
    }

    public int getNumRegistre() { return numRegistre; }
    public Usuari getUsuari() { return usuari; }
    public Joc getJoc() { return joc; }
    public String getPlataforma() { return plataforma; }
    public LocalDate getDataInici() { return dataInici; }
    public LocalDate getDataTornada() { return dataTornada; }
    public boolean isRetornat() { return retornat; }
    public void setRetornat(boolean retornat) { this.retornat = retornat; }
}
