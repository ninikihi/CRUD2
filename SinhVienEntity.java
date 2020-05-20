package com.dts.studentManager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sinhvien")
public class SinhVienEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sinhvien_id")
    private int sinhvienid;

    @Column(name = "sinhvien_name")
    private String sinhvienname;

    @Column(name = "sinhvien_ns")
    private String sinhvienns;

    @Column(name = "sinhvien_dc")
    private String sinhviendc;
    
    @Column(name = "sinhvien_cl")
    private String sinhviencl;

    public SinhVienEntity() {

    }


    public int getSinhvienid() {
		return sinhvienid;
	}



	public void setSinhvienid(int sinhvienid) {
		this.sinhvienid = sinhvienid;
	}



	public String getSinhvienname() {
		return sinhvienname;
	}



	public void setSinhvienname(String sinhvienname) {
		this.sinhvienname = sinhvienname;
	}



	public String getSinhvienns() {
		return sinhvienns;
	}



	public void setSinhvienns(String sinhvienns) {
		this.sinhvienns = sinhvienns;
	}



	public String getSinhviendc() {
		return sinhviendc;
	}



	public void setSinhviendc(String sinhviendc) {
		this.sinhviendc = sinhviendc;
	}



	public String getSinhviencl() {
		return sinhviencl;
	}



	public void setSinhviencl(String sinhviencl) {
		this.sinhviencl = sinhviencl;
	}



	@Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
    }
}
