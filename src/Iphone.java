public class Iphone implements MusicPlayer, Telephone, InternetBrowser{
  private String name;
  private float version;
  private int manufacturingYear;

  public Iphone(String name, float version, int manufacturingYear) {
    this.name = name;
    this.version = version;
    this.manufacturingYear = manufacturingYear;
  }

  public String getName() {
    return name;
  }

  public float getVersion() {
    return version;
  }

  public int getManufacturingYear() {
    return manufacturingYear;
  }

  public void showPage() {
    System.out.println(this.getName() + " shows page!");
  }

  public void addNewTab() {
    System.out.println(this.getName() + " adds a new Tab!");
  }

  public void refreshPage() {
    System.out.println(this.getName() + " refreshes page!");
  }

  public void play() {
    System.out.println(this.getName() + " plays the selected music!");
  }

  public void pause() {
    System.out.println(this.getName() + " pauses the selected music!");
  }

  public void selectMusic() {
    System.out.println(this.getName() + " selects the a music!");

  }

  public void call() {
    System.out.println(this.getName() + " calls the telephone number!");

  }

  public void answerCall() {
    System.out.println(this.getName() + " answers the call!");

  }

  public void voiceMail() {
    System.out.println(this.getName() + " accesses the voice mail service!");
  }

  public void infoMessage() {
    System.out.println(this.getName() + " was build in " + this.getManufacturingYear() + " in the version " + this.getVersion());
  }

  public static void main(String[] args) {
    Iphone myIphone = new Iphone("Silmar's Iphone", 6.0f, 2014);

    myIphone.selectMusic();
    myIphone.play();
    myIphone.pause();

    myIphone.call();
    myIphone.answerCall();
    myIphone.voiceMail();

    myIphone.showPage();
    myIphone.addNewTab();
    myIphone.refreshPage();

    myIphone.infoMessage();
  }
}
