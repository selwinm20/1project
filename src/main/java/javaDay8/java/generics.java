package javaDay8.java;

public class generics <t,v>{

    //Generics with functions help make more generalized methods which more accurately represent the types used and returned.
    private t data;
    private v date;


    public t getData() {
        return data;
    }

    public void setData(t data) {
        this.data = data;
    }

    public v getDate() {
        return date;
    }

    public void setDate(v date) {
        this.date = date;
    }


    public <t,v> void shout(t thingToShout, v date1){
        System.out.println(thingToShout + "!!!");
        System.out.println(date1 + "!!!!");
    }



    public generics(t data, v date) {
        this.data = data;
        this.date = date;
    }

    public generics() {
    }
}
