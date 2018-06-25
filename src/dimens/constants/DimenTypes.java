package dimens.constants;


public enum DimenTypes {

 
	 //适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
	
	  //分辨率是320*480 mdip(160)  160/160=1    宽320dp，分辨率是240*320 ldip(120)  120/160=0.75 240/0.75   宽320dp
	 DP_sw__320(320), //分辨率是480*800 hdip(240)  240/160=1.5 480/1.5   宽320dp
	 //DP_sw__360(360),//分辨率是720*1280  320  2  360dp
	 DP_sw__360(360),//分辨率是1080*1920  320  dpi的设备  
	 DP_sw__384(384),//分辨率是768*1280  320 dpi的设备   2
	 DP_sw__392(392),
	 DP_sw__400(400),
	 DP_sw__411(411),//分辨率是1080*1920  420 dpi的设备    420/160=2.625  1080/2.625=411.42
	 //DP_sw__411(411),//分辨率是1440*2560  560 dpi的设备    560/160=3.5  1440/3.5=411.42
	 DP_sw__432(432),
	 DP_sw__480(480),
	 DP_sw__533(533),
	 DP_sw__592(592),
	 DP_sw__600(600);//1200*1920  2 600
  

    /**
     * 屏幕最小宽度
     */
    private int swWidthDp;




    DimenTypes(int swWidthDp) {

        this.swWidthDp = swWidthDp;
    }

    public int getSwWidthDp() {
        return swWidthDp;
    }

    public void setSwWidthDp(int swWidthDp) {
        this.swWidthDp = swWidthDp;
    }

}
