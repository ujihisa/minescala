package minescala;
import minescala.Minescala;
import org.bukkit.plugin.java.JavaPlugin;

public class Minescala2 extends JavaPlugin {
  public static void main(String[] args) {
    System.out.println("from java.");
    Minescala.hello();
  }

  public void onEnable() {
    System.out.println("Let's scala!");
  }
}
