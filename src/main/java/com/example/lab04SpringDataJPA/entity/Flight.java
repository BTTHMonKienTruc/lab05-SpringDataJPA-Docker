package com.example.lab04SpringDataJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Admin
 *
 */
@Entity
@Table(name="chuyenbay")
public class Flight {
	@Id
	private String macb;
    private String gadi;
    private String gaden;
    private int dodai;
    private String giodi;
    private String gioden;
    private int chiphi;
//
	public String getMacb() {
		return macb;
	}
	public void setMacb(String macb) {
		this.macb = macb;
	}
	public String getGadi() {
		return gadi;
	}
	public void setGadi(String gadi) {
		this.gadi = gadi;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public int getDodai() {
		return dodai;
	}
	public void setDodai(int dodai) {
		this.dodai = dodai;
	}
	public String getGiodi() {
		return giodi;
	}
	public void setGiodi(String giodi) {
		this.giodi = giodi;
	}
	public String getGioden() {
		return gioden;
	}
	public void setGioden(String gioden) {
		this.gioden = gioden;
	}
	public int getChiphi() {
		return chiphi;
	}
	public void setChiphi(int chiphi) {
		this.chiphi = chiphi;
	}
	public Flight(String macb, String gadi, String gaden, int dodai, String giodi, String gioden, int chiphi) {
		super();
		this.macb = macb;
		this.gadi = gadi;
		this.gaden = gaden;
		this.dodai = dodai;
		this.giodi = giodi;
		this.gioden = gioden;
		this.chiphi = chiphi;
	}
	@Override
	public String toString() {
		return "Flight [macb=" + macb + ", gadi=" + gadi + ", gaden=" + gaden + ", dodai=" + dodai + ", giodi=" + giodi
				+ ", gioden=" + gioden + ", chiphi=" + chiphi + "]";
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
