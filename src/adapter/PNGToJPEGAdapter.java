package adapter;

public class PNGToJPEGAdapter implements JPEGImageConvestore {
    
     PNGImage image;
     public PNGToJPEGAdapter (PNGImage image){
        this.image=image;
    }

    public JPEGImage convert(){
        return new JPEGImage();
    }

    
}
