package adapter;


public class Adapter {

    public static void main(String[] args) {
        JPEGImage jp= new JPEGImage();
        PNGImage pn=new PNGImage();
        IosPreviewer ios = new IosPreviewer();
        PNGToJPEGAdapter png = new PNGToJPEGAdapter(pn);
        ios.ShowImage(jp);
        ios.ShowImage(png.convert());
    }
    
}
