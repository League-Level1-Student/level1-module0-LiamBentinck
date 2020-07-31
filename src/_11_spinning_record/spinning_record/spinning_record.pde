import ddf.minim.*;             //at the very top of your sketch
  Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
  
  



PImage recordforspinningrecord;                        //as member variable
int angle = 0;
void setup(){

        size(1200,1200);                                 //in setup method
        recordforspinningrecord= loadImage("recordforspinningrecord.jpg");      //in setup method
       recordforspinningrecord.resize(1200, 1200);     //in setup method
   song = minim.loadFile("awesomeTrack.mp3", 512);   //in the setup method
minim = new Minim(this);    //in the setup method
       
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
        angle+=amountToRotate;
    }
void draw(){
 
if(mousePressed){
  rotateImage(recordforspinningrecord, angle);
  image (recordforspinningrecord, 0, 0);  //in draw method
  angle+=1;
}

}
