package com.example.perie.androboum;

/**
 * Created by perie on 14/12/2017.
 */

public class Profil {

    private String email;
    boolean isConnected;
    private String uid;
    enum BombStatut {IDLE, AWAITING, BOMBER, BOMBED};
    private BombStatut statut = BombStatut.IDLE;
    private String otherUserUID;
    private String otherUseremail;
    private long score=0;
    private double latitude;
    private double longitude;

    public Profil() {}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOtherUseremail(){
        return otherUseremail;
    }

    public void setOtherUseremail(String otherUseremail){
        this.otherUseremail = otherUseremail;
    }

    public String getOtherUserUID(){
        return otherUserUID;
    }

    public void setOtherUserUID(){
        this.otherUserUID=otherUserUID;
    }

    public long getScore(){
        return score;
    }

    public void setScore(long score){
        this.score = score;
    }

    public BombStatut getStatut (){
        return statut;
    }

    public void setStatut(BombStatut statut){
        this.statut = statut;
    }

    public double getLongitude(){
        return longitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude;
    }

}
