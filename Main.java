class Main {
  public static void main( String args[])
  {
    Picture pix = new Picture("images/seagull.jpg");
    pix.mirrorVerticalRightToLeft();
    pix.explore();
  }
}