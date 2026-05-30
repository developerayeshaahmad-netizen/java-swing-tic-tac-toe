public class Player{

    private String name;
    private String sign;
    private int score;

Player(String name , String sign){

    this.name = name;
    this.sign = sign;
    this.score = 0;
}
public void setName(String name){
       this.name = name;

}
public String getName(){
    return name;
}

public void setSign(String sign){
    this.sign = sign;
}

public String getSign(){
    return sign;
}
public int getScore(){
    return score;
}
public void incScore(){

    score++;
}
}