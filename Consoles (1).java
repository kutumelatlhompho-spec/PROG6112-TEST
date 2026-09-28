public abstract class Consoles implement iConsoles {
    
    private String deviceType;
    private String storeName;
    private int totalSalesAmount;
    
    //Constructor
    
    public Consoles(String deviceType, String storeName, totalSalesAmount) {
        this.deviceType = deviceType;
        this.storeName = storeName;
        this.totalSalesAmount = totalSalesAmount;
    }
    
    public String getDeviceType() {
        return deviceType;
    }
    
    public String getStoreName() {
        return storeName;
    }
    
    public String getTotalSalesAmount() {
        return totalSalesAmount;
    }
}