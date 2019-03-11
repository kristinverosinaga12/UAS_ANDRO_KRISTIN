package com.example.pljc_pc.recyleview;

/**
 * Created by PLJC-PC on 12/02/2019.
 */

public class Siswa {
    String nama;
    Boolean IK, TI, SI;

    public Siswa() { }




    public Siswa(String nama, Boolean IK, Boolean TI, Boolean SI) {
        this.nama = nama;
        this.IK = IK;
        this.TI = TI;
        this.SI = SI;
    }

    public String getNama() {
        return nama;
    }

    public Boolean getIK() {
        return IK;
    }

    public Boolean getTI() {
        return TI;
    }

    public Boolean getSI() {
        return SI;
    }


}
