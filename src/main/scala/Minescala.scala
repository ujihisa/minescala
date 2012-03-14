package minescala
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.Listener
import org.bukkit.event.EventHandler
import org.bukkit.event.player.PlayerLoginEvent

class Minescala extends JavaPlugin with Listener {
	override def onEnable {
		println("Scala! Hello!!")
	}
	
	@EventHandler
	def onPlayerLogin(event: PlayerLoginEvent) {
		println("You logged in!")
		println(event)
	}
}
