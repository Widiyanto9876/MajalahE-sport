package com.example.user.majalahe_sport.Adapter;

import com.example.user.majalahe_sport.entity.Majalah;

import java.util.ArrayList;

public class MajalahData {
    public static String[] [] data = new String[][]{
            {"Hamilton Tutup Musim ", "SPORTS NEWS",
                    "https://akcdn.detik.net.id/community/media/visual/2018/11/25/5801b708-942e-4593-b5eb-f2c5d24d3f2f_169.jpeg?w=700&q=80",
            "data1", "https://sport.detik.com/f1/d-4316870/hamilton-tutup-musim-dengan-kemenangan-di-gp-abu-dhabi"},

            {"Ducati Desmosedici GP19", "SPORTS NEWS",
                    "https://akcdn.detik.net.id/community/media/visual/2018/09/06/ca83f703-cefe-424d-b903-d97b2e459c10_169.jpeg?w=700&q=80",
            "data2", "https://sport.detik.com/moto-gp/d-4316634/ducati-desmosedici-gp19-menakjubkan"},

            {"Marquez Menari ", "SPORTS NEWS",
                    "https://akcdn.detik.net.id/community/media/visual/2016/07/15/bacbb811-ee58-4e35-97fa-7b8572dfe796_169.jpg?w=700&q=80",
            "data3", "https://sport.detik.com/moto-gp/d-4315958/bahas-hubungannya-dengan-rossi-marquez-seperti-menari-salsa-tapi-saling-injak-kaki"},

            {"Marquez MotoGP 2018", "SPORTS NEWS",
                    "https://akcdn.detik.net.id/community/media/visual/2018/08/27/0383fa78-677e-48c2-8345-a19b7e764a7f_169.jpeg?w=700&q=80",
            "data4", "https://sport.detik.com/moto-gp/d-4315392/marquez-pebalap-paling-sering-jatuh-di-motogp-2018"},
    };

    public static ArrayList<Majalah> getListData (){
        Majalah majalah = null;
        ArrayList<Majalah> list = new ArrayList<>();
        for (int i = 0; i <data.length; i++) {
            majalah = new Majalah();
            majalah.setName(data[i] [0]);
            majalah.setRemarks(data[i] [1]);
            majalah.setPhoto(data[i] [2]);
            majalah.setDetail_kode(data[i] [3]);
            majalah.setUrl(data[i] [4]);

            list.add(majalah);
            }
            return list;
        }
    }

