package adapter;

import java.awt.Image;

public class PNGToJPEGAdapter implements JPEGImageConvestore {
    PNGImage image;
    public PNGToJPEGAdapter (PNGImage image){
    this.image=image;
    }
    
    @Override
    public Image convert(){
    return newJPEGImage();
    }
    
    private Image newJPEGImage(){
    return null;
    }
    
}
