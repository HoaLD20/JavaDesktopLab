/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package short2networking;

import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author hoald
 */


/**
 * 
 * De ghi kieu du lieu hay object vao 1 outputstream thi ta phai implement Serializable
 * 
 */
public class Data implements Serializable{
    private String name;
    private String status;
    private ImageIcon image;
    private byte[] file;

    public Data(String name, String status, ImageIcon image, byte[] file) {
        this.name = name;
        this.status = status;
        this.image = image;
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
    
    
    
}
