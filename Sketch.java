import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {
	//global varibables
   public PFont font; 
  
	 float rectangleX = random(0, 300);
   float rectangleY = random(0, 300);
  
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    if (rectangleX >= 200 && rectangleY >= 200){
      background(255, 0, 0);
    }
    else if (rectangleX >= 200 && rectangleY <= 200){
      background(0, 255, 0);
    }
    else if(rectangleX <= 200 && rectangleY <=200){
      background(255, 255, 0);
    }
    else{
      background(0, 255, 255);
    }

    font = createFont("Lato Bold",50 , true);
    textFont(font);
    textAlign(CENTER, BASELINE);
  }
  

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    //clock
    String time = hour() + ":" + minute();

    if (hour() > 12){
      time = hour()- 12 + ":" + minute() + " PM";
      text(time,(width/2), (height/2));
    }
    else if(hour() == 0){
      time = "12:" + minute() + " AM";
      text(time,(width/2), (height/2));
    }
    else{
      text(time,(width/2), (height/2));
    }

    
    //left pillar
    fill(23,23,23);
    rect(rectangleX, rectangleY, 75,175);
    
    //roof of left pillar
    fill(225);
    rect(rectangleX - 10, rectangleY - 10, 95, 10 );

    //right rectangle
    fill(225);
    rect(rectangleX + 75, rectangleY + 60, 175, 115);

    //roof of white rectangle
    fill(23,23,23);
    rect(rectangleX + 65, rectangleY + 50, 195, 10);

    //window for left pillar
    fill(0 ,164 ,239);
    ellipse(rectangleX + 37, rectangleY + 75, 50, 75);

    //left window details
    stroke(23);
    line(rectangleX + 37, rectangleY + 25, rectangleX + 37, rectangleY + 150);
    line(rectangleX + 12, rectangleY + 75, rectangleX + 62, rectangleY + 75);

    //Door
    fill(78,53,36);
    rect(rectangleX + 100, rectangleY + 105, 40, 70);
  //door handle
    fill(220,220,220);
    ellipse(rectangleX + 133, rectangleY + 145, 10, 10);

  // right window

    fill(0 ,164 ,239);
    rect(rectangleX + 150, rectangleY + 80, 100, 75);
    //right window details
    
      

   
  }
  
  // define other methods down here.
}