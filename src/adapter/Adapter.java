package adapter;


public class Adapter {

    public static void main(String[] args) {
      JPEGImage jp = new JPEGImage();
      PNGImage pn = new PNGImage();
      IosPreviewer ios = new IosPreviewer();
      ios.ShowImage(jp);
      PNGToJPEGAdapter png = new PNGToJPEGAdapter(pn);
      ios.ShowImage(jp); 
    }
    
}
