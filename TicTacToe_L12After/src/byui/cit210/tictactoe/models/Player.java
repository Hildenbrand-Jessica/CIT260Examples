/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit210.tictactoe.models;

import byui.cit210.tictactoe.enums.PlayerType;

/**
 *
 * @author jacksonrkj
 */
public class Player {

    private String name;
    private PlayerType playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String marker;
    

    public Player() {
    }

    public Player(PlayerType playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }


    private long getWinningPercentage() {

        double totalScore = this.getWins() + this.getLosses() + this.getTies();
        if (totalScore == 0) {
            return 0;
        }
        
        double winLossRatio = this.getWins() / totalScore;
        long percentage = Math.round(winLossRatio * 100);
        return percentage;
    }

 
    public String getPlayerStastics() {
        String playerStatistics = 
                this.getName() + " has won "
                + this.getWinningPercentage() + "% of the games."
                + "\n\t" + this.getWins() + " wins, "
                + this.getLosses() + " losses and "
                + this.getTies() + " ties.";
        
        return playerStatistics;
    }
 
    
}


//        if (this.getWins() + this.getLosses() + this.getTies() == 0) {
//            return 0;
//        }