package readdata;


public class DataSPT{

  Double Hs = null;
  Double Tz = null;
  Double Battery = null;
  
  public DataSPT(String[] file_data){
    
    Hs = new Double(file_data[1]);
    Tz = new Double(file_data[2]);
    Battery = new Double(file_data[6]);
  
    
  }
}
