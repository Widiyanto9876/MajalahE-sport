package com.example.user.majalahe_sport.entity;

public class Majalah {
    private String name, remarks, photo,detail_kode, url;

    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    public String getPhoto(){
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }


    public String getDetail_kode() {
        return detail_kode;
    }

    public void setDetail_kode(String detail_kode) {
        this.detail_kode = detail_kode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
