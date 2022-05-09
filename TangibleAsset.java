public abstract class TangibleAsset{
  private String name;
  private int price;
  private String color;
  
  public TangibleAsset(String name,int price,String color){
    this.name = name;
    this.price = price;
    this.color = color;
  }
  
  private String name(){retum this.name}
  private int price(){retum this.price}
  private String color(){retum this.color}
}
