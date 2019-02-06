
public class TV{
    
    int channel;
    int volumeLevel;
    boolean on;
    
    
    public TV(int channel, int volumeLevel, boolean on){
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;  
    }
    
    public TV() {
		channel = 1;
		volumeLevel = 4;
		on = false;
    }
    
    public void turnOn(){ 
       on = true;       
    }
    public void turnOff(){
        on = false;
    }
    
    public void setChannel(int change){
        if(change >= 1 && change <= 120 && on == true){
        	this.channel = change;}
    }
    
    public void setVolume(int newVolumelevel1){	
        if(newVolumelevel1 >= 1 && newVolumelevel1 <= 7 && this.on == true){
        	this.volumeLevel = newVolumelevel1;}
    }
    
    public void channelUp(){
        this.setChannel(channel+1);
    }
    
    public void channelDown(){
    	this.setChannel(channel-1);
    }
    
    public void volumeUp(){
    	this.setVolume(volumeLevel+1);
    }
    
    public void volumeDown(){
    	this.setVolume(volumeLevel-1);
    }
    
    public String toString(){
        if (this.on == true){
        return " are canalul " +  this.channel + " si nivelul volului este " + this.volumeLevel;}
        else {return " este deconectat";}
        
        
    }
    
    
}