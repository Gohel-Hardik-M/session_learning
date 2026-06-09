package com.tss.entity;

public class Player {

    private int id;
    private  String name;
    private  int played_matches;
    private  int total_runs;


    public  Player(int id, String name,int played_matches,int total_runs){
        this.id=id;
        this.name=name;
        this.played_matches=played_matches;
        this.total_runs=total_runs;

    }

    public  void setname(String name){
        this.name=name;
    }

    public  void setTotal_runs(int total_runs){
        this.total_runs=total_runs;

    }
    public void setPlayed_matches(int played_matches){
        this.played_matches=played_matches;
    }

    public  void setId(int id){
        this.id=id;

    }

    public  int avgrun(){
        return total_runs/played_matches;
    }

    public  void  display(){
        System.out.println("name :"+name);
        System.out.println("played matches :"+played_matches);
        System.out.println("total runs :"+total_runs);
    }

}
