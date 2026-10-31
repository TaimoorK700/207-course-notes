/**
 * Represents a rectangle with a width and height.
 * Supports calculating its area, scaling its dimensions,
 * and comparing its area with another rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Creates a rectangle object with width {@code w} and height {@code h}.
   *
   * @param w width of rectangle
   * @param h height of rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of the rectangle.
   *
   * @return area of rectangle
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by {@code factor}.
   *
   * @param factor the multiplier applied to width and height
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a greater area than another rectangle.
   *
   * @param other the rectangle to compare with
   * @return true if this rectangle's area is greater than the other rectangle's
   *     area; false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
