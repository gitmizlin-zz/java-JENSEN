class Rectangle
{
  public int w = 10, h = 10;
  public int getArea() { return w * h; }
}
 
class Triangle extends Rectangle
{
  public int getArea() { return w * h / 2; }
}
class Triangle extends Rectangle
{
  @Override public int getArea() 
  { 
    return w * h / 2;
  }
}