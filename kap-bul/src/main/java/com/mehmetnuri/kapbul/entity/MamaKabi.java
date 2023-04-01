package com.mehmetnuri.kapbul.entity;


import com.mehmetnuri.kapbul.enums.EnumDurumAP;
import com.mehmetnuri.kapbul.enums.EnumKapTuru;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mama_kabi")
public class MamaKabi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String ad;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private EnumDurumAP durum;


    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private EnumKapTuru turu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public EnumDurumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumDurumAP durum) {
        this.durum = durum;
    }

    public EnumKapTuru getTuru() {
        return turu;
    }

    public void setTuru(EnumKapTuru turu) {
        this.turu = turu;
    }
}
