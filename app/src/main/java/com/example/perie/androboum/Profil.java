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
    private String otherUserEmail;
    private long score=0;

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

    public String getOtherUserEmail(){
        return otherUserEmail;
    }

    public void setOtherUserEmail(String otherUserEmail){
        this.otherUserEmail = otherUserEmail;
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

}
