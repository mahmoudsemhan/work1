/*
public class TV {
    int channel=1 ;
    int volumeLevel=1 ;
    boolean on =true;
    public TV()
    {
    }
    public void turnOn()
    {
        on = true;
    }
      public void turnOf()
    {
        on = false;
    }
      public void setchannel(int newchannel)
      {
          if(on && newchannel >0 && newchannel <= 120)
        channel = newchannel;
      }

    public void setVolume(int newvolumeLevel) {
        if(on && newvolumeLevel >0 && newvolumeLevel <= 7)
         volumeLevel=newvolumeLevel;
    }
      
      public void channelup()
      {
          if(on && channel<120)
        channel ++;
      }
      public void channeldown()
      {
          if(on && channel >1)
        channel --;
      }
      
      public void volumup()
      {
          if(on && volumeLevel <7)
          volumeLevel ++; 
        
      }
      
      public void volumdown()
      {
          if(on &&volumeLevel >1)
          volumeLevel --; 
        
      }
      
      public int getchannal()
      {
      
        return channel;
      }
      public int getvolume()
      {
      
        return volumeLevel;
      }
      
    
}
