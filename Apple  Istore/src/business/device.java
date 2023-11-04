package business;

public class device {
    private int deviceID;
    private String deviceName;
    private String price;
    private int qnty;
    private String Category;

    public device() {
    }

    public device(int deviceID, String deviceName, String price, int qnty, String Category) {
        this.deviceID = deviceID;
        this.deviceName = deviceName;
        this.price = price;
        this.qnty = qnty;
        this.Category = Category;
    }



    public int getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQnty() {
        return qnty;
    }

    public void setQnty(int qnty) {
        this.qnty = qnty;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    
    public String Print(){
        String line = String.valueOf(getDeviceID())+","+getDeviceName()+","+getPrice()+","+getQnty()+","+getCategory();

        return line;
    }
    
    
}
