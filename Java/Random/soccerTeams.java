import javax.swing.JOptionPane;

public class soccerTeams{
    public static void main(String[] args){
        
        final int MIN_PLAYERS = 9, MAX_PLAYERS =15;
        int players, teamSize, teams, leftOver;
        String input;

        input = JOptionPane.showInputDialog("Enter the number of players per team.");
        teamSize = Integer.parseInt(input);

        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS){
            input = JOptionPane.showInputDialog("The number must be at least " + MIN_PLAYERS +
                                                " and no more than " + MAX_PLAYERS +
                                                ".\nEnter the number of players.");
            teamSize = Integer.parseInt(input);
        }

        input = JOptionPane.showInputDialog("Enter the avalible number of players.");
        players = Integer.parseInt(input);

        while(players < 0){
            input = JOptionPane.showInputDialog("Enter 0 or greater!");
            players = Integer.parseInt(input);
        }

        teams = players / teamSize;
        leftOver = players % teamSize;

        JOptionPane.showMessageDialog(null, "There will be " + teams + " teams with " + leftOver + " players leftover.");

        System.exit(0);

    }
}
