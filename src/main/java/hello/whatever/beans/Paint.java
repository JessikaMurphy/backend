package hello.whatever.beans;

import java.util.Date;

public class Paint {

	private long id;
	private String paintId;
    private String paintName;
    private String rgb;
    private String brand;
    
    public Paint() {
    }
 
    public Paint(String paintName,String rgb, String paintId, String brand) {
        
        this.paintName = paintName;
        this.paintId = paintId;
        this.rgb = rgb;
        this.brand = brand;
    }
 
    public void setId(long id) {
        this.id = id;
    }
 
    public long getId() {
        return id;
    }
 
    public String getPaintName() {
        return paintName;
    }
 
    public void setPaintName(String paintName) {
        this.paintName = paintName;
    }
 
    public String getPaintId() {
        return paintId;
    }
 
    public void setPaintId(String paintId) {
        this.paintId = paintId;
    }
    public String getRgb() {
        return rgb;
    }
 
    public void setRgb(String rgb) {
        this.rgb = rgb;
    }
    public String getBrand() {
        return brand;
    }
 
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
 
    @Override
    public String toString() {
        return "Paint{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + paintName + '\'' +
                ", paintId='" + paintId + '\'' +
                ", rgb='" + rgb + '\'' +
                '}';
    }
}
