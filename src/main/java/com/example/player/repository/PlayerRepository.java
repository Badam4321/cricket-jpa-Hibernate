// Write your code here
package com.example.player.repository;
import com.example.player.model.Player;
import java.util.*;
public interface PlayerRepository
{
    ArrayList<Player> getAllPlayers();
    Player getPlayer(int playerId);
    Player creatPlayer(Player player);
    Player updatePlayer(int playerId,Player player);
    void deletePlayer(int playerId);

}