package db;

public class Laptop {
	public String product_id;
	public String category;
	public String model_name;
	public String manufacturer_name;
	public String release_date;
	public String price;
	public String screen_res;
	public String screen_size; 
	public String weight;
	public String battery;
	public String product_status;
	public String dimensions;
	//laptop
	public String Connectivity;
	public String RAM_type;
	public String RAM_capacity_GB;
	
	
	
	public String getConnectivity() {
		return Connectivity;
	}
	public void setConnectivity(String connectivity) {
		Connectivity = connectivity;
	}
	public String getRAM_type() {
		return RAM_type;
	}
	public void setRAM_type(String rAM_type) {
		RAM_type = rAM_type;
	}
	public String getRAM_capacity_GB() {
		return RAM_capacity_GB;
	}
	public void setRAM_capacity_GB(String rAM_capacity_GB) {
		RAM_capacity_GB = rAM_capacity_GB;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getManufacturer_name() {
		return manufacturer_name;
	}
	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getScreen_res() {
		return screen_res;
	}
	public void setScreen_res(String screen_res) {
		this.screen_res = screen_res;
	}
	public String getScreen_size() {
		return screen_size;
	}
	public void setScreen_size(String screen_size) {
		this.screen_size = screen_size;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getProduct_status() {
		return product_status;
	}
	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}	
}
