/**
 * Main class of the Java program.
 */

public class Ex1_1 {

    public static void main(String[] args) {
   
   TV unu = new TV();
   TV doi = new TV();
   TV trei = new TV(25,7,false);
   
   unu.turnOn();
   unu.setChannel(5);
   unu.setVolume(3);
   unu.channelUp();
   System.out.println("TV unu" + unu);
      
   doi.turnOn();
   doi.setChannel(119);
   doi.setVolume(6);
   doi.channelUp();
   doi.volumeUp();
   doi.volumeDown();
   doi.channelDown();
   System.out.println("TV doi" + doi);
   
   trei.turnOn();
   trei.channelUp();
   trei.volumeUp();
   trei.volumeDown();
   trei.channelDown();
   trei.turnOff();
   System.out.println("TV trei" + trei);
    }
}
